package wraith.musica;

import net.minecraft.util.Identifier;

public class Utils {

    public static Identifier ID(String path) {
        return new Identifier(Musica.MOD_ID, path);
    }

}
