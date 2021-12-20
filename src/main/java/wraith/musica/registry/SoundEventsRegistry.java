package wraith.musica.registry;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.registry.Registry;
import wraith.musica.Utils;

import java.util.HashMap;

public final class SoundEventsRegistry {

    private SoundEventsRegistry(){}

    private static final HashMap<String, SoundEvent> SOUND_EVENTS = new HashMap<>();

    public static void createAndRegister(String id) {
        register(id, new SoundEvent(Utils.ID("music_disc." + id)));
    }

    public static void register(String id, SoundEvent soundEvent) {
        SOUND_EVENTS.put(id, Registry.register(Registry.SOUND_EVENT, Utils.ID(id), soundEvent));
    }

    public static SoundEvent get(String key) {
        return SOUND_EVENTS.get(key);
    }

    public static void init() {
        register("record_scratch", new SoundEvent(Utils.ID("ambient.record_scratch")));
    }

}
