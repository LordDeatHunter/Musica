package wraith.musica.mixin;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import wraith.musica.Config;
import wraith.musica.Utils;
import wraith.musica.registry.ItemRegistry;

import java.util.ArrayList;
import java.util.HashMap;

@Mixin(Block.class)
public abstract class BlockMixin {

    @Shadow
    public static void dropStack(World world, BlockPos pos, ItemStack stack) {}

    @Inject(method = "onDestroyedByExplosion", at = @At("HEAD"))
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion, CallbackInfo ci) {
        String id = Registry.BLOCK.getId((Block)(Object)this).toString();
        if (!Config.getInstance().EXPLOSION_DROPS.containsKey(id)) {
            return;
        }
        HashMap<String, HashMap<String, Float>> explosionDrops = Config.getInstance().EXPLOSION_DROPS.get(id);
        String cause = "";
        if (explosionDrops.containsKey("any")) {
            cause = "any";
        } else if (explosion.getCausingEntity() instanceof PlayerEntity && explosionDrops.containsKey("tnt")) {
            cause = "tnt";
        } else if (explosion.getCausingEntity() instanceof CreeperEntity) {
            CreeperEntity creeper = (CreeperEntity) explosion.getCausingEntity();
            if (((EntityAccessor)creeper).getDataTracker().get(((CreeperEntityAccessor)creeper).getCharged()) && explosionDrops.containsKey("charged_creeper")) {
                cause = "charged_creeper";
            } else if (!creeper.shouldRenderOverlay() && explosionDrops.containsKey("uncharged_creeper")) {
                cause = "uncharged_creeper";
            } else {
                cause = "creeper";
            }
        }
        if ("".equals(cause) || !explosionDrops.containsKey(cause)) {
            return;
        }

        ArrayList<String> discs = new ArrayList<>(explosionDrops.get(cause).keySet());
        if (discs.isEmpty()) {
            return;
        }
        String disc = discs.get(Utils.getRandomIntInRange(0, discs.size() - 1));

        float chance = explosionDrops.get(cause).get(disc);
        if (!Utils.getRandomChance(chance)) {
            return;
        }

        Item item;
        if (disc.startsWith("#")) {
            item = TagRegistry.item(Utils.ID(disc.substring(1))).getRandom(Utils.RANDOM);
        } else if (ItemRegistry.contains(disc)) {
            item = ItemRegistry.get(disc);
        } else {
            return;
        }

        dropStack(world, pos, new ItemStack(item));

    }

    @Inject(method = "afterBreak", at = @At("HEAD"))
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack stack, CallbackInfo ci) {
        String blockID = Registry.BLOCK.getId((Block)(Object)this).toString();
        if (!Config.getInstance().BLOCK_MINE_DROPS.containsKey(blockID)) {
            return;
        }
        HashMap<String, HashMap<String, Float>> mineDrops = Config.getInstance().BLOCK_MINE_DROPS.get(blockID);
        String itemID = Registry.ITEM.getId(stack.getItem()).toString();
        if (!mineDrops.containsKey(itemID) && mineDrops.containsKey("")) {
            itemID = "";
        }

        if (!mineDrops.containsKey(itemID)) {
            return;
        }
        ArrayList<String> discs = new ArrayList<>(mineDrops.get(itemID).keySet());
        if (discs.isEmpty()) {
            return;
        }
        String disc = discs.get(Utils.getRandomIntInRange(0, discs.size() - 1));

        float chance = mineDrops.get(itemID).get(disc);
        if (!Utils.getRandomChance(chance)) {
            return;
        }

        Item item;
        if (disc.startsWith("#")) {
            item = TagRegistry.item(Utils.ID(disc.substring(1))).getRandom(Utils.RANDOM);
        } else if (ItemRegistry.contains(disc)) {
            item = ItemRegistry.get(disc);
        } else {
            return;
        }

        dropStack(world, pos, new ItemStack(item));
    }

}
