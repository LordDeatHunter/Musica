package wraith.musica.registry;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import wraith.musica.screen.SongMixerScreen;

public class CustomScreenRegistry {

    private CustomScreenRegistry(){}

    public static void register() {
        ScreenRegistry.register(CustomScreenHandlerRegistry.SONG_MIXER_SCREEN, SongMixerScreen::new);
    }

}
