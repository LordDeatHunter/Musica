package wraith.musica.registry;

import net.minecraft.client.gui.screen.ingame.HandledScreens;
import wraith.musica.screen.SongMixerScreen;

public class CustomScreenRegistry {

    private CustomScreenRegistry() {}

    public static void register() {
        HandledScreens.register(CustomScreenHandlerRegistry.SONG_MIXER_SCREEN, SongMixerScreen::new);
    }

}
