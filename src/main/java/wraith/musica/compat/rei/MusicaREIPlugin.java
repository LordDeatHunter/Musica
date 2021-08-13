package wraith.musica.compat.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.ItemStack;
import wraith.musica.Utils;
import wraith.musica.registry.ItemRegistry;

public class MusicaREIPlugin implements REIClientPlugin {

    public static final CategoryIdentifier<SongMixerDisplay> SONG_MIXER_CATEGORY_ID = CategoryIdentifier.of(Utils.ID("song_mixer"));

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new SongMixerCategory());
        registry.addWorkstations(SONG_MIXER_CATEGORY_ID, EntryStacks.of(new ItemStack(ItemRegistry.get("song_mixer"))));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.add(new SongMixerDisplay());
    }

}