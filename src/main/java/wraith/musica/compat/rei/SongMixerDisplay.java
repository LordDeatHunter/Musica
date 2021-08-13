package wraith.musica.compat.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import wraith.musica.registry.ItemRegistry;

import java.util.*;

public class SongMixerDisplay implements Display {

    private static final HashSet<Item> DYES = new HashSet<>(TagRegistry.item(new Identifier("c:dyes")).values());
    private static final Item BLANK_DISC = ItemRegistry.get("blank_disc");
    private static final HashSet<Item> DISCS = new HashSet<>(TagRegistry.item(new Identifier("c:music_discs")).values());

    public static boolean isDye(Item item) {
        return DYES.contains(item);
    }

    public static boolean isDisc(Item item) {
        return DISCS.contains(item);
    }

    public static boolean isBlankDisc(Item item) {
        return item == BLANK_DISC;
    }

    @Override
    public @NotNull List<EntryIngredient> getInputEntries() {
        List<ItemStack> stacks = new ArrayList<>();
        for (Item dye : DYES) {
            stacks.add(new ItemStack(dye));
        }
        return Arrays.asList(EntryIngredients.ofItems(Collections.singletonList(BLANK_DISC)), EntryIngredients.ofItemStacks(stacks));
    }

    @Override
    public List<EntryIngredient> getOutputEntries() {
        ArrayList<EntryIngredient> stacks = new ArrayList<>();
        for (Item disc : DISCS) {
            stacks.add(EntryIngredients.of(new ItemStack(disc)));
        }
        return stacks;
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return MusicaREIPlugin.SONG_MIXER_CATEGORY_ID;
    }

}
