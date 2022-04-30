package wraith.musica;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.TagEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.musica.registry.BlockRegistry;
import wraith.musica.registry.CustomScreenHandlerRegistry;
import wraith.musica.registry.ItemRegistry;
import wraith.musica.registry.SoundEventsRegistry;

import java.util.HashMap;
import java.util.Map;

public class Musica implements ModInitializer {

    public static final String MOD_ID = "musica";
    public static final Logger LOGGER = LogManager.getLogger();
    public static boolean isReloading = false;

    public static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create("musica:pack");

    @Override
    public void onInitialize() {
        Config.saveFilesFromJar("configs", "", false);
        Config.getInstance().parseConfig();
        if (Config.getInstance().shouldOverrideConfigs()) {
            Config.saveFilesFromJar("configs", "", true);
        }
        registerLootTable();
        registerCommands();
        registerPacketHandlers();
        BlockRegistry.register();
        ItemRegistry.init();
        SoundEventsRegistry.init();
        CustomScreenHandlerRegistry.register();
        RRPCallback.BEFORE_VANILLA.register(a -> a.add(RESOURCE_PACK));
        LOGGER.info("[Musica] has successfully been loaded!");
    }

    private void registerPacketHandlers() {
        ServerPlayNetworking.registerGlobalReceiver(Utils.ID("song_mixer.click_disc"), (server, player, networkHandler, data, sender) -> {
            NbtCompound tag = data.readNbt();
            if (tag != null && tag.contains("sync_id") && tag.contains("click_slot")) {
                server.execute(() -> {
                    int syncId = tag.getInt("sync_id");
                    int button = tag.getInt("click_slot");
                    if (player.currentScreenHandler.syncId == syncId) {
                        player.currentScreenHandler.onButtonClick(player, button);
                    }
                });
            }
        });
    }

    private void registerCommands() {
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            dispatcher.register(CommandManager.literal("musica")
                    .then(CommandManager.literal("reload")
                            .requires(source -> source.hasPermissionLevel(2))
                            .executes(context -> {
                                ServerPlayerEntity player = context.getSource().getPlayer();
                                if (!isReloading) {
                                    isReloading = true;
                                    if (player != null) {
                                        player.sendMessage(new LiteralText("§6[§eMusica§6] §3is being reloaded. §4This might cause some lag!"), false);
                                    }
                                    Config.getInstance().parseConfig();
                                    MinecraftServer server = context.getSource().getServer();
                                    server.reloadResources(server.getDataPackManager().getEnabledNames());
                                    if (player != null) {
                                        player.sendMessage(new LiteralText("§6[§eMusica§6] §3has successfully reloaded!"), false);
                                    }
                                    isReloading = false;
                                } else {
                                    if (player != null) {
                                        player.sendMessage(new LiteralText("§6[§eMusica§6] §3is already being reloaded. Please be patient."), false);
                                    }
                                }
                                return 1;
                            })
                    )
            );
        });
    }

    private void registerLootTable() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, fabricLootSupplierBuilder, lootTableSetter) -> {
            String[] segments = id.toString().split(":");
            if (segments.length < 2) {
                return;
            }
            String[] segmentsPath = segments[1].split("/");
            if (segmentsPath.length < 2) {
                return;
            }
            boolean isEntity = "entities".equals(segmentsPath[0]);
            boolean isChest = "chests".equals(segmentsPath[0]);
            if (!isEntity && !isChest) {
                return;
            }
            String lootId = segments[0] + ":" + segmentsPath[1];
            if (isEntity) {
                if (!Config.getInstance().MOB_DROPS.containsKey(lootId)) {
                    return;
                }
                HashMap<String, HashMap<String, Float>> killers = Config.getInstance().MOB_DROPS.get(lootId);

                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(1));

                for (Map.Entry<String, HashMap<String, Float>> killer : killers.entrySet()) {
                    String killerId = killer.getKey();
                    for (Map.Entry<String, Float> items : killer.getValue().entrySet()) {
                        String item = items.getKey();
                        if (item.startsWith("#")) {
                            poolBuilder.withEntry(TagEntry.builder(TagFactory.ITEM.create(Utils.ID(item.substring(1)))).build());
                        } else {
                            poolBuilder.withEntry(ItemEntry.builder(ItemRegistry.get(item)).build());
                        }
                        poolBuilder.withCondition(RandomChanceLootCondition.builder(items.getValue() / 100.0F).build());
                        if (!"any".equals(killerId)) {
                            if (killerId.startsWith("#")) {
                                poolBuilder.withCondition(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.KILLER, EntityPredicate.Builder.create().type(TagRegistry.entityType(new Identifier(killerId.substring(1)))).build()).build());
                            } else {
                                poolBuilder.withCondition(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.KILLER, EntityPredicate.Builder.create().type(Registry.ENTITY_TYPE.get(new Identifier(killerId))).build()).build());
                            }
                        }
                    }
                }
                fabricLootSupplierBuilder.withPool(poolBuilder.build());
            } else {
                if (!Config.getInstance().TREASURES.containsKey(lootId)) {
                    return;
                }
                HashMap<String, Float> discs = Config.getInstance().TREASURES.get(lootId);

                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(1));

                for (Map.Entry<String, Float> disc : discs.entrySet()) {
                    String item = disc.getKey();
                    if (item.startsWith("#")) {
                        poolBuilder.withEntry(TagEntry.builder(TagFactory.ITEM.create(Utils.ID(item.substring(1)))).build());
                    } else {
                        poolBuilder.withEntry(ItemEntry.builder(ItemRegistry.get(item)).build());
                    }
                    poolBuilder.withCondition(RandomChanceLootCondition.builder(disc.getValue() / 100.0F).build());
                }
                fabricLootSupplierBuilder.withPool(poolBuilder.build());
            }

        });
    }

}
