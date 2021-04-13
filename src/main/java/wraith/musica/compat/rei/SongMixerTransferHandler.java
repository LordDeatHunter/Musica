/*
package wraith.musica.compat.rei;

import me.shedaniel.rei.api.AutoTransferHandler;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import wraith.musica.screen.SongMixerScreenHandler;

public class SongMixerTransferHandler implements AutoTransferHandler {

    @Override
    public @NotNull Result handle(@NotNull Context context) {
        if (!(context.getContainer() instanceof SongMixerScreenHandler)) {
            return Result.createNotApplicable();
        }
        if (!context.isActuallyCrafting()){
            return Result.createSuccessful();
        }

        SongMixerScreenHandler handler = (SongMixerScreenHandler) context.getContainer();

        ClientPlayerEntity player = context.getMinecraft().player;

        player.inventory.offerOrDrop(context.getMinecraft().world, handler.input.getStack(0));
        player.inventory.offerOrDrop(context.getMinecraft().world, handler.input.getStack(1));

        int amount = Screen.hasShiftDown() ? 64 : 1;

        int disc = -1;
        int dye = -1;
        for (int i = 0; i < player.inventory.size() && (disc == -1 || dye == -1); ++i) {
            if (disc == -1 && SongMixerDisplay.isBlankDisc(player.inventory.getStack(i).getItem())) {
                disc = i;
            } else if (dye == -1 && SongMixerDisplay.isDye(player.inventory.getStack(i).getItem())) {
                dye = i;
            }
        }
        ItemStack discStack = ItemStack.EMPTY;
        ItemStack dyeStack = ItemStack.EMPTY;
        if (disc != -1) {
            discStack = player.inventory.removeStack(disc, amount);
        }
        if (dye != -1) {
            dyeStack = player.inventory.removeStack(dye, amount);
        }
        handler.input.setStack(0, discStack);
        handler.input.setStack(1, dyeStack);

        context.getMinecraft().openScreen(context.getContainerScreen());

        return Result.createSuccessful();
    }

}
*/