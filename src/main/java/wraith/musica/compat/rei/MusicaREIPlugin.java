package wraith.musica.compat.rei;

import me.shedaniel.rei.api.EntryStack;
import me.shedaniel.rei.api.RecipeHelper;
import me.shedaniel.rei.api.plugins.REIPluginV0;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import wraith.musica.Utils;
import wraith.musica.registry.ItemRegistry;

public class MusicaREIPlugin implements REIPluginV0 {

    public static final Identifier ID = Utils.ID("rei_plugin");
    public static final Identifier SONG_MIXER_CATEGORY_ID = Utils.ID("song_mixer");

    @Override
    public Identifier getPluginIdentifier() {
        return ID;
    }

    @Override
    public void registerOthers(RecipeHelper recipeHelper) {
        //recipeHelper.registerAutoCraftingHandler(new SongMixerTransferHandler());
        recipeHelper.registerWorkingStations(SONG_MIXER_CATEGORY_ID, EntryStack.create(new ItemStack(ItemRegistry.get("song_mixer"))));
    }

    @Override
    public void registerPluginCategories(RecipeHelper recipeHelper) {
        recipeHelper.registerCategories(new SongMixerCategory());
    }

    @Override
    public void registerRecipeDisplays(RecipeHelper recipeHelper) {
        recipeHelper.registerDisplay(new SongMixerDisplay());
    }



}
