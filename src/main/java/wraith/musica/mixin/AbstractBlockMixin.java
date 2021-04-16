package wraith.musica.mixin;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import wraith.musica.Config;
import wraith.musica.Utils;
import wraith.musica.registry.ItemRegistry;

import java.util.ArrayList;
import java.util.HashMap;

@Mixin(AbstractBlock.AbstractBlockState.class)
public abstract class AbstractBlockMixin {

    @Shadow public abstract Block getBlock();

    @Inject(method = "onUse", at = @At("HEAD"))
    public void onUse(World world, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> cir) {
        String block = Registry.BLOCK.getId(getBlock()).toString();
        HashMap<String, HashMap<String, Integer>> items;
        if (Config.getInstance().BLOCK_DROPS.containsKey(block)) {
            items = Config.getInstance().BLOCK_DROPS.get(block);
        } else if (Config.getInstance().BLOCK_DROPS.containsKey("")) {
            items = Config.getInstance().BLOCK_DROPS.get("");
        } else {
            return;
        }
        String itemId = Registry.ITEM.getId(player.getStackInHand(hand).getItem()).toString();
        if (!items.containsKey(itemId) && items.containsKey("")) {
            itemId = "";
        }

        if (!items.containsKey(itemId)) {
            return;
        }

        ArrayList<String> discs = new ArrayList<>(items.get(itemId).keySet());
        String disc = discs.get(Utils.getRandomIntInRange(0, discs.size() - 1));

        int chance = items.get(itemId).get(disc);
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
        Block.dropStack(world, player.getBlockPos(), new ItemStack(item));

    }

}
