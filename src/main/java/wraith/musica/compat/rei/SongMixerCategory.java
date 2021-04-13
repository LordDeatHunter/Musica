package wraith.musica.compat.rei;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.EntryStack;
import me.shedaniel.rei.api.RecipeCategory;
import me.shedaniel.rei.api.widgets.Slot;
import me.shedaniel.rei.api.widgets.Widgets;
import me.shedaniel.rei.gui.widget.Widget;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import wraith.musica.registry.ItemRegistry;

import java.util.ArrayList;
import java.util.List;

public class SongMixerCategory implements RecipeCategory<SongMixerDisplay> {

    public static TranslatableText TITLE = new TranslatableText("container.musica.song_mixer.rei.title");

    @Override
    public @NotNull Identifier getIdentifier() {
        return MusicaREIPlugin.SONG_MIXER_CATEGORY_ID;
    }

    @Override
    public @NotNull String getCategoryName() {
        return TITLE.getString();
    }

    @Override
    public @NotNull EntryStack getLogo() {
        return EntryStack.create(new ItemStack(ItemRegistry.get("song_mixer")));
    }

    @Override
    public @NotNull List<Widget> setupDisplay(SongMixerDisplay recipeDisplay, Rectangle bounds) {
        Point origin = new Point(bounds.getCenterX() - 58, bounds.getCenterY() - 27);

        List<Widget> widgets = new ArrayList<>();
        widgets.add(Widgets.createRecipeBase(bounds));

        List<List<EntryStack>> inputs = recipeDisplay.getInputEntries();
        List<Slot> slots = new ArrayList<>();

        int y = origin.y + 20;
        slots.add(Widgets.createSlot(new Point(origin.x + 8, y)).markInput());
        slots.add(Widgets.createSlot(new Point(origin.x + 32, y)).markInput());

        for (int i = 0; i < inputs.size(); i++) {
            if (!inputs.get(i).isEmpty()) {
                slots.get(i).entries(inputs.get(i));
            }
        }

        widgets.addAll(slots);
        widgets.add(Widgets.createResultSlotBackground(new Point(origin.x + 90, y)));
        widgets.add(Widgets.createSlot(new Point(origin.x + 90, y)).entries(recipeDisplay.getResultingEntries().get(0)).markOutput());

        widgets.add(Widgets.createArrow(new Point(origin.x + 55, y)));

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 40;
    }

}
