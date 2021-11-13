package wraith.musica.compat.rei;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Slot;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import org.jetbrains.annotations.NotNull;
import wraith.musica.registry.ItemRegistry;

import java.util.ArrayList;
import java.util.List;

public class SongMixerCategory implements DisplayCategory<SongMixerDisplay> {

    public static final TranslatableText TITLE = new TranslatableText("container.musica.song_mixer.rei.title");

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(new ItemStack(ItemRegistry.get("song_mixer")));
    }

    @Override
    public Text getTitle() {
        return TITLE;
    }

    @Override
    public @NotNull List<Widget> setupDisplay(SongMixerDisplay recipeDisplay, Rectangle bounds) {
        Point origin = new Point(bounds.getCenterX() - 58, bounds.getCenterY() - 27);

        var widgets = new ArrayList<Widget>();

        widgets.add(Widgets.createRecipeBase(bounds));

        var inputs = recipeDisplay.getInputEntries();
        var slots = new ArrayList<Slot>();

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
        widgets.add(Widgets.createSlot(new Point(origin.x + 90, y)).entries(recipeDisplay.getOutputEntries().get(0)).markOutput());

        widgets.add(Widgets.createArrow(new Point(origin.x + 55, y)));

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 40;
    }

    @Override
    public CategoryIdentifier<? extends SongMixerDisplay> getCategoryIdentifier() {
        return MusicaREIPlugin.SONG_MIXER_CATEGORY_ID;
    }

}
