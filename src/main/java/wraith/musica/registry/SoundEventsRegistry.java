package wraith.musica.registry;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.registry.Registry;
import wraith.musica.Utils;

import java.util.HashMap;
import java.util.Map;

public class SoundEventsRegistry {

    private SoundEventsRegistry(){}

    private static final HashMap<String, SoundEvent> SOUND_EVENTS = new HashMap<String, SoundEvent>() {{
        put("dire_straits_money_for_nothing", new SoundEvent(Utils.ID("music_disc.dire_straits_money_for_nothing")));
        put("naps_the_block_omen", new SoundEvent(Utils.ID("music_disc.naps_the_block_omen")));
        put("naps_the_block_dimensions", new SoundEvent(Utils.ID("music_disc.naps_the_block_dimensions")));
        put("naps_the_block_silence", new SoundEvent(Utils.ID("music_disc.naps_the_block_silence")));
        put("naps_the_block_tall", new SoundEvent(Utils.ID("music_disc.naps_the_block_tall")));
        put("john_denver_take_me_home_country_roads", new SoundEvent(Utils.ID("music_disc.john_denver_take_me_home_country_roads")));
        put("toto_africa", new SoundEvent(Utils.ID("music_disc.toto_africa")));
        put("rick_astley_never_gonna_give_you_up", new SoundEvent(Utils.ID("music_disc.rick_astley_never_gonna_give_you_up")));
        put("lost_angel_ice_shards", new SoundEvent(Utils.ID("music_disc.lost_angel_ice_shards")));
        put("lost_angel_chemistry", new SoundEvent(Utils.ID("music_disc.lost_angel_chemistry")));
        put("lost_angel_souls", new SoundEvent(Utils.ID("music_disc.lost_angel_souls")));
        put("genius_james_because", new SoundEvent(Utils.ID("music_disc.genius_james_because")));
        put("edevegie_world", new SoundEvent(Utils.ID("music_disc.edevegie_world")));
        put("carrot_and_co_hue", new SoundEvent(Utils.ID("music_disc.carrot_and_co_hue")));
        put("gwyd_waves", new SoundEvent(Utils.ID("music_disc.gwyd_waves")));
        put("gwyd_charr", new SoundEvent(Utils.ID("music_disc.gwyd_charr")));
        put("gwyd_bricks", new SoundEvent(Utils.ID("music_disc.gwyd_bricks")));
        put("gwyd_tricks", new SoundEvent(Utils.ID("music_disc.gwyd_tricks")));
        put("lost_angel_bastion", new SoundEvent(Utils.ID("music_disc.lost_angel_bastion")));
        put("lost_angel_cheese", new SoundEvent(Utils.ID("music_disc.lost_angel_cheese")));
        put("lost_angel_drifter", new SoundEvent(Utils.ID("music_disc.lost_angel_drifter")));
        put("lost_angel_eyes", new SoundEvent(Utils.ID("music_disc.lost_angel_eyes")));
        put("lost_angel_face", new SoundEvent(Utils.ID("music_disc.lost_angel_face")));
        put("lost_angel_haunted", new SoundEvent(Utils.ID("music_disc.lost_angel_haunted")));
        put("lost_angel_heartless", new SoundEvent(Utils.ID("music_disc.lost_angel_heartless")));
        put("lost_angel_lost", new SoundEvent(Utils.ID("music_disc.lost_angel_lost")));
        put("lost_angel_neoncity", new SoundEvent(Utils.ID("music_disc.lost_angel_neoncity")));
        put("lost_angel_past", new SoundEvent(Utils.ID("music_disc.lost_angel_past")));
        put("lost_angel_sepulcrum", new SoundEvent(Utils.ID("music_disc.lost_angel_sepulcrum")));
        put("lost_angel_skylines", new SoundEvent(Utils.ID("music_disc.lost_angel_skylines")));
        put("lost_angel_wilds", new SoundEvent(Utils.ID("music_disc.lost_angel_wilds")));
        put("kaz_shroom", new SoundEvent(Utils.ID("music_disc.kaz_shroom")));
        put("kaz_rain", new SoundEvent(Utils.ID("music_disc.kaz_rain")));
        put("kaz_activate", new SoundEvent(Utils.ID("music_disc.kaz_activate")));

        put("record_scratch", new SoundEvent(Utils.ID("ambient.record_scratch")));
    }};

    public static void register() {
        for (Map.Entry<String, SoundEvent> soundEvent : SOUND_EVENTS.entrySet()) {
            Registry.register(Registry.SOUND_EVENT, Utils.ID(soundEvent.getKey()), soundEvent.getValue());
        }
    }

    public static SoundEvent get(String key) {
        return SOUND_EVENTS.get(key);
    }
}
