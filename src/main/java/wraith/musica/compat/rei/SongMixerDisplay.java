package wraith.musica.compat.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import org.jetbrains.annotations.NotNull;
import wraith.musica.registry.ItemRegistry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SongMixerDisplay implements Display {

    private final List<EntryIngredient> outputs;

    public SongMixerDisplay(RegistryEntry<Item> item) {
        this.outputs = Collections.singletonList(EntryIngredients.of(item.value()));
    }

    @Override
    public @NotNull List<EntryIngredient> getInputEntries() {
        return Arrays.asList(
            EntryIngredients.ofItems(Collections.singletonList(ItemRegistry.get("blank_disc"))),
            EntryIngredients.ofIngredient(Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("c:dyes"))))
        );
    }

    @Override
    public List<EntryIngredient> getOutputEntries() {
        return outputs;
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return MusicaREIPlugin.SONG_MIXER_CATEGORY_ID;
    }

}
