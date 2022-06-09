package wraith.musica.registry;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;
import wraith.musica.Utils;
import wraith.musica.screen.SongMixerScreenHandler;

public class CustomScreenHandlerRegistry {

    public static ScreenHandlerType<? extends ScreenHandler> SONG_MIXER_SCREEN;

    private CustomScreenHandlerRegistry() {}

    public static void register() {
        SONG_MIXER_SCREEN = Registry.register(Registry.SCREEN_HANDLER, Utils.ID("song_mixer"), new ScreenHandlerType<>(SongMixerScreenHandler::new));
    }

}
