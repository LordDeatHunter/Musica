package wraith.musica.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.Property;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import wraith.musica.registry.BlockRegistry;
import wraith.musica.registry.CustomScreenHandlerRegistry;
import wraith.musica.registry.ItemRegistry;
import wraith.musica.registry.SoundEventsRegistry;

import java.util.List;

public class SongMixerScreenHandler extends ScreenHandler {

    private final ScreenHandlerContext context;
    private final Property selectedRecipe;
    static List<Item> availableDiscs = null;

    final Slot inputSlot;
    final Slot outputSlot;
    final Slot dyeSlot;

    public final Inventory input;
    private final CraftingResultInventory output;
    private Runnable contentsChangedListener;
    private long lastTakeTime;

    public SongMixerScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
    }

    public SongMixerScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(CustomScreenHandlerRegistry.SONG_MIXER_SCREEN, syncId);

        if (availableDiscs == null) {
            availableDiscs = TagRegistry.item(new Identifier("c:music_discs")).values();
        }

        this.contentsChangedListener = () -> {};

        this.input = new SimpleInventory(2) {
            @Override
            public void markDirty() {
                super.markDirty();
                SongMixerScreenHandler.this.onContentChanged(this);
                SongMixerScreenHandler.this.contentsChangedListener.run();
            }

        };

        this.selectedRecipe = Property.create();
        this.selectedRecipe.set(-1);

        this.output = new CraftingResultInventory();
        this.context = context;

        this.inputSlot = this.addSlot(new Slot(this.input, 0, 20, 20){
            @Override
            public boolean canInsert(ItemStack stack) {
                return stack.getItem() == ItemRegistry.get("blank_disc");
            }

            @Override
            public void onStackChanged(ItemStack originalItem, ItemStack itemStack) {
                SongMixerScreenHandler.this.selectedRecipe.set(-1);
                super.onStackChanged(originalItem, itemStack);
            }

            @Override
            public ItemStack onTakeItem(PlayerEntity player, ItemStack stack) {
                SongMixerScreenHandler.this.populateResult();
                return super.onTakeItem(player, stack);
            }
        });
        this.dyeSlot = this.addSlot(new Slot(this.input, 1, 20, 48){
            @Override
            public boolean canInsert(ItemStack stack) {
                return TagRegistry.item(new Identifier("c:dyes")).contains(stack.getItem());
            }

            @Override
            public void onStackChanged(ItemStack originalItem, ItemStack itemStack) {
                SongMixerScreenHandler.this.selectedRecipe.set(-1);
                super.onStackChanged(originalItem, itemStack);
            }

            @Override
            public ItemStack onTakeItem(PlayerEntity player, ItemStack stack) {
                SongMixerScreenHandler.this.populateResult();
                return super.onTakeItem(player, stack);
            }
        });
        this.outputSlot = this.addSlot(new Slot(this.output, 2, 143, 33) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return false;
            }

            @Override
            public ItemStack onTakeItem(PlayerEntity player, ItemStack stack) {
                stack.onCraft(player.world, player, stack.getCount());
                ItemStack input = SongMixerScreenHandler.this.inputSlot.takeStack(1);
                SongMixerScreenHandler.this.dyeSlot.takeStack(1);
                if (!input.isEmpty()) {
                    SongMixerScreenHandler.this.populateResult();
                }

                context.run((world, blockPos) -> {
                    long l = world.getTime();
                    if (SongMixerScreenHandler.this.lastTakeTime != l) {
                        world.playSound(null, blockPos, SoundEventsRegistry.get("record_scratch"), SoundCategory.BLOCKS, 1.0F, 1.0F);
                        SongMixerScreenHandler.this.lastTakeTime = l;
                    }

                });
                return super.onTakeItem(player, stack);
            }
        });

        int k;
        for(k = 0; k < 3; ++k) {
            for(int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + k * 9 + 9, 8 + j * 18, 84 + k * 18));
            }
        }

        for(k = 0; k < 9; ++k) {
            this.addSlot(new Slot(playerInventory, k, 8 + k * 18, 142));
        }

        this.addProperty(this.selectedRecipe);

    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            int invSize = 3;
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < invSize) {
                if (!this.insertItem(originalStack, invSize, this.slots.size(), false)) {
                    return ItemStack.EMPTY;
                }
            } else if (originalStack.getItem() == ItemRegistry.get("blank_disc")) {
                if (!this.insertItem(originalStack, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (TagRegistry.item(new Identifier("c:dyes")).contains(originalStack.getItem())) {
                if (!this.insertItem(originalStack, 1, 2, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (invSlot < this.slots.size() - 9) {
                if (!this.insertItem(originalStack, this.slots.size() - 9, this.slots.size(), false)) {
                    return ItemStack.EMPTY;
                }
            } else if (invSlot >= this.slots.size() - 9) {
                if (!this.insertItem(originalStack, invSize, this.slots.size() - 9, false)) {
                    return ItemStack.EMPTY;
                }
            } else {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }

            if (originalStack.getCount() == newStack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTakeItem(player, originalStack);
        }

        return newStack;

    }


    @Environment(EnvType.CLIENT)
    public void setContentsChangedListener(Runnable runnable) {
        this.contentsChangedListener = runnable;
    }

    @Override
    public boolean onButtonClick(PlayerEntity player, int id) {
        if (isValidSlot(id)) {
            this.selectedRecipe.set(id);
            this.populateResult();
        }

        return true;
    }

    private boolean isValidSlot(int id) {
        return id >= 0 && id < availableDiscs.size();
    }

    private void populateResult() {
        if (!availableDiscs.isEmpty() && this.isValidSlot(this.selectedRecipe.get()) && canCraft()) {
            Item item = availableDiscs.get(this.selectedRecipe.get());
            this.outputSlot.setStack(new ItemStack(item));
        } else {
            this.outputSlot.setStack(ItemStack.EMPTY);
        }
        this.sendContentUpdates();
    }

    @Override
    public void close(PlayerEntity player) {
        super.close(player);
        this.output.removeStack(1);
        this.context.run((world, blockPos) -> {
            this.dropInventory(player, player.world, this.input);
        });
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return canUse(this.context, player, BlockRegistry.get("song_mixer"));
    }

    @Environment(EnvType.CLIENT)
    public boolean canCraft() {
        return this.inputSlot.hasStack() && this.dyeSlot.hasStack() && !availableDiscs.isEmpty();
    }

    @Environment(EnvType.CLIENT)
    public int getSelectedRecipe() {
        return this.selectedRecipe.get();
    }

}