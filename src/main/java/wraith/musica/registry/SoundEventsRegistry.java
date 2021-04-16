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
        put("john_denver_take_me_home_country_roads", new SoundEvent(Utils.ID("music_disc.john_denver_take_me_home_country_roads")));
        put("toto_africa", new SoundEvent(Utils.ID("music_disc.toto_africa")));
        put("rick_astley_never_gonna_give_you_up", new SoundEvent(Utils.ID("music_disc.rick_astley_never_gonna_give_you_up")));
        put("yes_roundabout", new SoundEvent(Utils.ID("music_disc.yes_roundabout")));
        put("daft_punk_around_the_world", new SoundEvent(Utils.ID("music_disc.daft_punk_around_the_world")));

        put("naps_the_block_omen", new SoundEvent(Utils.ID("music_disc.naps_the_block_omen")));
        put("naps_the_block_dimensions", new SoundEvent(Utils.ID("music_disc.naps_the_block_dimensions")));
        put("naps_the_block_silence", new SoundEvent(Utils.ID("music_disc.naps_the_block_silence")));
        put("naps_the_block_tall", new SoundEvent(Utils.ID("music_disc.naps_the_block_tall")));

        put("genius_james_because", new SoundEvent(Utils.ID("music_disc.genius_james_because")));

        put("edevegie_world", new SoundEvent(Utils.ID("music_disc.edevegie_world")));

        put("carrot_and_co_hue", new SoundEvent(Utils.ID("music_disc.carrot_and_co_hue")));

        put("gwyd_waves", new SoundEvent(Utils.ID("music_disc.gwyd_waves")));
        put("gwyd_charr", new SoundEvent(Utils.ID("music_disc.gwyd_charr")));
        put("gwyd_bricks", new SoundEvent(Utils.ID("music_disc.gwyd_bricks")));
        put("gwyd_tricks", new SoundEvent(Utils.ID("music_disc.gwyd_tricks")));

        put("lost_angel_bastion", new SoundEvent(Utils.ID("music_disc.lost_angel_bastion")));
        put("lost_angel_cheese", new SoundEvent(Utils.ID("music_disc.lost_angel_cheese")));
        put("lost_angel_chemistry", new SoundEvent(Utils.ID("music_disc.lost_angel_chemistry")));
        put("lost_angel_drifter", new SoundEvent(Utils.ID("music_disc.lost_angel_drifter")));
        put("lost_angel_eyes", new SoundEvent(Utils.ID("music_disc.lost_angel_eyes")));
        put("lost_angel_face", new SoundEvent(Utils.ID("music_disc.lost_angel_face")));
        put("lost_angel_haunted", new SoundEvent(Utils.ID("music_disc.lost_angel_haunted")));
        put("lost_angel_heartless", new SoundEvent(Utils.ID("music_disc.lost_angel_heartless")));
        put("lost_angel_ice_shards", new SoundEvent(Utils.ID("music_disc.lost_angel_ice_shards")));
        put("lost_angel_lost", new SoundEvent(Utils.ID("music_disc.lost_angel_lost")));
        put("lost_angel_neoncity", new SoundEvent(Utils.ID("music_disc.lost_angel_neoncity")));
        put("lost_angel_past", new SoundEvent(Utils.ID("music_disc.lost_angel_past")));
        put("lost_angel_sepulcrum", new SoundEvent(Utils.ID("music_disc.lost_angel_sepulcrum")));
        put("lost_angel_skylines", new SoundEvent(Utils.ID("music_disc.lost_angel_skylines")));
        put("lost_angel_souls", new SoundEvent(Utils.ID("music_disc.lost_angel_souls")));
        put("lost_angel_wilds", new SoundEvent(Utils.ID("music_disc.lost_angel_wilds")));

        put("kaz_shroom", new SoundEvent(Utils.ID("music_disc.kaz_shroom")));
        put("kaz_rain", new SoundEvent(Utils.ID("music_disc.kaz_rain")));
        put("kaz_activate", new SoundEvent(Utils.ID("music_disc.kaz_activate")));

        put("firch_anti", new SoundEvent(Utils.ID("music_disc.firch_anti")));
        put("firch_range", new SoundEvent(Utils.ID("music_disc.firch_range")));
        put("firch_chop", new SoundEvent(Utils.ID("music_disc.firch_chop")));

        put("twockx_eternal_dream", new SoundEvent(Utils.ID("music_disc.twockx_eternal_dream")));

        put("yekonaip_plains", new SoundEvent(Utils.ID("music_disc.yekonaip_plains")));
        put("yekonaip_ocean", new SoundEvent(Utils.ID("music_disc.yekonaip_ocean")));
        put("yekonaip_savanna", new SoundEvent(Utils.ID("music_disc.yekonaip_savanna")));
        put("yekonaip_swampland", new SoundEvent(Utils.ID("music_disc.yekonaip_swampland")));
        put("yekonaip_mesa", new SoundEvent(Utils.ID("music_disc.yekonaip_mesa")));
        put("yekonaip_extreme_hills", new SoundEvent(Utils.ID("music_disc.yekonaip_extreme_hills")));
        put("yekonaip_taiga", new SoundEvent(Utils.ID("music_disc.yekonaip_taiga")));
        put("yekonaip_jungle", new SoundEvent(Utils.ID("music_disc.yekonaip_jungle")));
        put("yekonaip_desert", new SoundEvent(Utils.ID("music_disc.yekonaip_desert")));

        put("jamiesname_18", new SoundEvent(Utils.ID("music_disc.jamiesname_18")));
        put("jamiesname_shulk", new SoundEvent(Utils.ID("music_disc.jamiesname_shulk")));
        put("jamiesname_pillaged", new SoundEvent(Utils.ID("music_disc.jamiesname_pillaged")));

        put("bling_cheese_birch_bop", new SoundEvent(Utils.ID("music_disc.bling_cheese_birch_bop")));
        put("bling_cheese_charlie", new SoundEvent(Utils.ID("music_disc.bling_cheese_charlie")));
        put("bling_cheese_chicken", new SoundEvent(Utils.ID("music_disc.bling_cheese_chicken")));
        put("bling_cheese_fort_stress", new SoundEvent(Utils.ID("music_disc.bling_cheese_fort_stress")));
        put("bling_cheese_ic_5", new SoundEvent(Utils.ID("music_disc.bling_cheese_ic_5")));
        put("bling_cheese_neon", new SoundEvent(Utils.ID("music_disc.bling_cheese_neon")));
        put("bling_cheese_skulk", new SoundEvent(Utils.ID("music_disc.bling_cheese_skulk")));
        put("bling_cheese_strall", new SoundEvent(Utils.ID("music_disc.bling_cheese_strall")));
        put("bling_cheese_surviving", new SoundEvent(Utils.ID("music_disc.bling_cheese_surviving")));
        put("bling_cheese_time", new SoundEvent(Utils.ID("music_disc.bling_cheese_time")));

        put("terraainn_moonset", new SoundEvent(Utils.ID("music_disc.terraainn_moonset")));
        put("terraainn_insomnia", new SoundEvent(Utils.ID("music_disc.terraainn_insomnia")));
        put("terraainn_tweet", new SoundEvent(Utils.ID("music_disc.terraainn_tweet")));
        put("terraainn_crimson_columns", new SoundEvent(Utils.ID("music_disc.terraainn_crimson_columns")));
        put("terraainn_wind", new SoundEvent(Utils.ID("music_disc.terraainn_wind")));
        put("terraainn_close", new SoundEvent(Utils.ID("music_disc.terraainn_close")));
        put("terraainn_rgb", new SoundEvent(Utils.ID("music_disc.terraainn_rgb")));
        put("terraainn_disc_20", new SoundEvent(Utils.ID("music_disc.terraainn_disc_20")));
        put("terraainn_disc_15", new SoundEvent(Utils.ID("music_disc.terraainn_disc_15")));
        put("terraainn_storm", new SoundEvent(Utils.ID("music_disc.terraainn_storm")));
        put("terraainn_illager_raid", new SoundEvent(Utils.ID("music_disc.terraainn_illager_raid")));
        put("terraainn_100", new SoundEvent(Utils.ID("music_disc.terraainn_100")));
        put("terraainn_lush", new SoundEvent(Utils.ID("music_disc.terraainn_lush")));
        put("terraainn_remnant", new SoundEvent(Utils.ID("music_disc.terraainn_remnant")));

        put("tandem_music_over", new SoundEvent(Utils.ID("music_disc.tandem_music_over")));

        put("hearken_music_warped", new SoundEvent(Utils.ID("music_disc.hearken_music_warped")));
        put("hearken_music_first_night", new SoundEvent(Utils.ID("music_disc.hearken_music_first_night")));


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
