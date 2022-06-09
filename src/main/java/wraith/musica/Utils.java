package wraith.musica;

import net.minecraft.util.Identifier;

import java.util.Random;

public class Utils {

    public static final Random RANDOM = new Random();

    public static Identifier ID(String path) {
        return new Identifier(Musica.MOD_ID, path);
    }

    public static int getRandomIntInRange(int min, int max) {
        return min + RANDOM.nextInt(max - min + 1);
    }

    public static float getRandomFloatInRange(int min, int max) {
        return min + RANDOM.nextFloat() * max;
    }

    public static boolean getRandomChance(float chance) {
        return !(chance <= 0) && chance >= getRandomFloatInRange(0, 100);
    }

}
