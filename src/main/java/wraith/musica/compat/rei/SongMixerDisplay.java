package wraith.musica.compat.rei;

import me.shedaniel.rei.api.EntryStack;
import me.shedaniel.rei.api.RecipeDisplay;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import wraith.musica.registry.ItemRegistry;
import wraith.musica.screen.SongMixerScreen;

import java.util.*;

public class SongMixerDisplay implements RecipeDisplay {

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
    public @NotNull List<List<EntryStack>> getInputEntries() {
        List<ItemStack> stacks = new ArrayList<>();
        for (Item dye : DYES) {
            stacks.add(new ItemStack(dye));
        }
        return EntryStack.ofIngredients(Arrays.asList(Ingredient.ofItems(BLANK_DISC), Ingredient.ofStacks(stacks.stream())));
    }

    @Override
    public @NotNull Identifier getRecipeCategory() {
        return MusicaREIPlugin.SONG_MIXER_CATEGORY_ID;
    }

    @Override
    public @NotNull List<List<EntryStack>> getResultingEntries() {
        ArrayList<EntryStack> stacks = new ArrayList<>();
        for (Item disc : DISCS) {
            stacks.add(EntryStack.create(new ItemStack(disc)));
        }
        return Collections.singletonList(stacks);
    }

}
