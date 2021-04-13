package wraith.musica;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.musica.registry.BlockRegistry;
import wraith.musica.registry.CustomScreenHandlerRegistry;
import wraith.musica.registry.ItemRegistry;
import wraith.musica.registry.SoundEventsRegistry;

public class Musica implements ModInitializer {

    public static final String MOD_ID = "musica";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        SoundEventsRegistry.register();
        BlockRegistry.register();
        ItemRegistry.register();
        CustomScreenHandlerRegistry.register();
        LOGGER.info("[Musica] has successfully been loaded!");
    }

}
