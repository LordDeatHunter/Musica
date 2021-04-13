package wraith.musica.registry;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import wraith.musica.Utils;
import wraith.musica.screen.SongMixerScreenHandler;

public class CustomScreenHandlerRegistry {

    private CustomScreenHandlerRegistry(){}

    public static ScreenHandlerType<? extends ScreenHandler> SONG_MIXER_SCREEN;

    public static void register() {
        SONG_MIXER_SCREEN = ScreenHandlerRegistry.registerSimple(Utils.ID("song_mixer"), SongMixerScreenHandler::new);
    }

}
