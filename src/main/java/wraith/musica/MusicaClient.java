package wraith.musica;

import net.fabricmc.api.ClientModInitializer;
import wraith.musica.registry.CustomScreenRegistry;

public class MusicaClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        CustomScreenRegistry.register();
    }

}
