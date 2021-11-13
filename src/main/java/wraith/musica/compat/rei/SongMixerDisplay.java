package wraith.musica.compat.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import wraith.musica.registry.ItemRegistry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SongMixerDisplay implements Display {

    @Override
    public @NotNull List<EntryIngredient> getInputEntries() {
        return Arrays.asList(EntryIngredients.ofItems(Collections.singletonList(ItemRegistry.get("blank_disc"))),
                EntryIngredients.ofIngredient(Ingredient.fromTag(TagFactory.ITEM.create(new Identifier("c:dyes")))));
    }

    @Override
    public List<EntryIngredient> getOutputEntries() {
        return Collections.singletonList(EntryIngredients.ofIngredient(Ingredient.fromTag(TagFactory.ITEM.create(new Identifier("c:music_discs")))));
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return MusicaREIPlugin.SONG_MIXER_CATEGORY_ID;
    }

}
