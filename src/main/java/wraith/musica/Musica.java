package wraith.musica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.loot.LootPool;
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
import net.minecraft.tag.TagKey;
import net.minecraft.text.Text;
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
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> 
            dispatcher.register(CommandManager.literal("musica")
                .then(CommandManager.literal("reload")
                        .requires(source -> source.hasPermissionLevel(2))
                        .executes(context -> {
                            ServerPlayerEntity player = context.getSource().getPlayer();
                            if (!isReloading) {
                                isReloading = true;
                                if (player != null) {
                                    player.sendMessage(Text.literal("§6[§eMusica§6] §3is being reloaded. §4This might cause some lag!"), false);
                                }
                                Config.getInstance().parseConfig();
                                MinecraftServer server = context.getSource().getServer();
                                server.reloadResources(server.getDataPackManager().getEnabledNames());
                                if (player != null) {
                                    player.sendMessage(Text.literal("§6[§eMusica§6] §3has successfully reloaded!"), false);
                                }
                                isReloading = false;
                            } else {
                                if (player != null) {
                                    player.sendMessage(Text.literal("§6[§eMusica§6] §3is already being reloaded. Please be patient."), false);
                                }
                            }
                            return 1;
                        })
                )
        ));
    }

    private void registerLootTable() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, fabricLootSupplierBuilder, lootTableSetter) -> {
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

                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1));

                for (Map.Entry<String, HashMap<String, Float>> killer : killers.entrySet()) {
                    String killerId = killer.getKey();
                    for (Map.Entry<String, Float> items : killer.getValue().entrySet()) {
                        String item = items.getKey();
                        if (item.startsWith("#")) {
                            poolBuilder.with(TagEntry.builder(TagKey.of(Registry.ITEM_KEY, Utils.ID(item.substring(1)))).build());
                        } else {
                            poolBuilder.with(ItemEntry.builder(ItemRegistry.get(item)).build());
                        }
                        poolBuilder.conditionally(RandomChanceLootCondition.builder(items.getValue() / 100.0F).build());
                        if (!"any".equals(killerId)) {
                            if (killerId.startsWith("#")) {
                                poolBuilder.conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.KILLER, EntityPredicate.Builder.create().type(TagKey.of(Registry.ENTITY_TYPE_KEY, (new Identifier(killerId.substring(1))))).build()).build());
                            } else {
                                poolBuilder.conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.KILLER, EntityPredicate.Builder.create().type(Registry.ENTITY_TYPE.get(new Identifier(killerId))).build()).build());
                            }
                        }
                    }
                }
                fabricLootSupplierBuilder.pool(poolBuilder.build());
            } else {
                if (!Config.getInstance().TREASURES.containsKey(lootId)) {
                    return;
                }
                HashMap<String, Float> discs = Config.getInstance().TREASURES.get(lootId);

                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1));

                for (Map.Entry<String, Float> disc : discs.entrySet()) {
                    String item = disc.getKey();
                    if (item.startsWith("#")) {
                        poolBuilder.with(TagEntry.builder(TagKey.of(Registry.ITEM_KEY, Utils.ID(item.substring(1)))).build());
                    } else {
                        poolBuilder.with(ItemEntry.builder(ItemRegistry.get(item)).build());
                    }
                    poolBuilder.conditionally(RandomChanceLootCondition.builder(disc.getValue() / 100.0F).build());
                }
                fabricLootSupplierBuilder.pool(poolBuilder.build());
            }

        });
    }

}
