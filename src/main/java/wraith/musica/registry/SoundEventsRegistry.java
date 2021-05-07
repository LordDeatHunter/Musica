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
        put("gwyd_click", new SoundEvent(Utils.ID("music_disc.gwyd_click")));

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
        put("lost_angel_crippling_fear", new SoundEvent(Utils.ID("music_disc.lost_angel_crippling_fear")));
        put("lost_angel_shattered", new SoundEvent(Utils.ID("music_disc.lost_angel_shattered")));
        put("lost_angel_silva", new SoundEvent(Utils.ID("music_disc.lost_angel_silva")));
        put("lost_angel_holger", new SoundEvent(Utils.ID("music_disc.lost_angel_holger")));
        put("lost_angel_crush", new SoundEvent(Utils.ID("music_disc.lost_angel_crush")));
        put("lost_angel_grit", new SoundEvent(Utils.ID("music_disc.lost_angel_grit")));
        put("lost_angel_united", new SoundEvent(Utils.ID("music_disc.lost_angel_united")));
        put("lost_angel_stalker", new SoundEvent(Utils.ID("music_disc.lost_angel_stalker")));

        put("kaz_shroom", new SoundEvent(Utils.ID("music_disc.kaz_shroom")));
        put("kaz_rain", new SoundEvent(Utils.ID("music_disc.kaz_rain")));
        put("kaz_activate", new SoundEvent(Utils.ID("music_disc.kaz_activate")));

        put("firch_anti", new SoundEvent(Utils.ID("music_disc.firch_anti")));
        put("firch_range", new SoundEvent(Utils.ID("music_disc.firch_range")));
        put("firch_chop", new SoundEvent(Utils.ID("music_disc.firch_chop")));
        put("firch_prophet", new SoundEvent(Utils.ID("music_disc.firch_prophet")));

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
        put("terraainn_finale", new SoundEvent(Utils.ID("music_disc.terraainn_finale")));
        put("terraainn_glow", new SoundEvent(Utils.ID("music_disc.terraainn_glow")));
        put("terraainn_looking_backward", new SoundEvent(Utils.ID("music_disc.terraainn_looking_backward")));
        put("terraainn_proto", new SoundEvent(Utils.ID("music_disc.terraainn_proto")));
        put("terraainn_sussy", new SoundEvent(Utils.ID("music_disc.terraainn_sussy")));
        put("terraainn_terrain", new SoundEvent(Utils.ID("music_disc.terraainn_terrain")));
        put("terraainn_ultima", new SoundEvent(Utils.ID("music_disc.terraainn_ultima")));
        put("terraainn_alex", new SoundEvent(Utils.ID("music_disc.terraainn_alex")));
        put("terraainn_steve", new SoundEvent(Utils.ID("music_disc.terraainn_steve")));
        put("terraainn_2010", new SoundEvent(Utils.ID("music_disc.terraainn_2010")));
        put("terraainn_error", new SoundEvent(Utils.ID("music_disc.terraainn_error")));
        put("terraainn_deep", new SoundEvent(Utils.ID("music_disc.terraainn_deep")));

        put("tandem_music_over", new SoundEvent(Utils.ID("music_disc.tandem_music_over")));

        put("hearken_music_warped", new SoundEvent(Utils.ID("music_disc.hearken_music_warped")));
        put("hearken_music_first_night", new SoundEvent(Utils.ID("music_disc.hearken_music_first_night")));

        put("error_404_music_ender_disc", new SoundEvent(Utils.ID("music_disc.error_404_music_ender_disc")));

        put("medlek_stew", new SoundEvent(Utils.ID("music_disc.medlek_stew")));

        put("4pointzx_12", new SoundEvent(Utils.ID("music_disc.4pointzx_12")));
        put("4pointzx_anthem", new SoundEvent(Utils.ID("music_disc.4pointzx_anthem")));
        put("4pointzx_dust", new SoundEvent(Utils.ID("music_disc.4pointzx_dust")));
        put("4pointzx_levitate", new SoundEvent(Utils.ID("music_disc.4pointzx_levitate")));
        put("4pointzx_prism", new SoundEvent(Utils.ID("music_disc.4pointzx_prism")));
        put("4pointzx_seaside", new SoundEvent(Utils.ID("music_disc.4pointzx_seaside")));
        put("4pointzx_sensor", new SoundEvent(Utils.ID("music_disc.4pointzx_sensor")));
        put("4pointzx_shine", new SoundEvent(Utils.ID("music_disc.4pointzx_shine")));
        put("4pointzx_warm", new SoundEvent(Utils.ID("music_disc.4pointzx_warm")));
        put("4pointzx_watcher", new SoundEvent(Utils.ID("music_disc.4pointzx_watcher")));
        put("4pointzx_flame", new SoundEvent(Utils.ID("music_disc.4pointzx_flame")));
        put("4pointzx_scorch", new SoundEvent(Utils.ID("music_disc.4pointzx_scorch")));

        put("a_peace_of_pie_chorus", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_chorus")));
        put("a_peace_of_pie_flutermo", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_flutermo")));
        put("a_peace_of_pie_roots", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_roots")));
        put("a_peace_of_pie_pumpking", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_pumpking")));
        put("a_peace_of_pie_drockstone", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_drockstone")));
        put("a_peace_of_pie_sculktronic", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_sculktronic")));
        put("a_peace_of_pie_melone", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_melone")));
        put("a_peace_of_pie_toxicoses", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_toxicoses")));
        put("a_peace_of_pie_lurkin", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_lurkin")));
        put("a_peace_of_pie_fungus", new SoundEvent(Utils.ID("music_disc.a_peace_of_pie_fungus")));

        put("k620_aqua", new SoundEvent(Utils.ID("music_disc.k620_aqua")));
        put("k620_run", new SoundEvent(Utils.ID("music_disc.k620_run")));
        put("k620_midnight", new SoundEvent(Utils.ID("music_disc.k620_midnight")));
        put("k620_speedrunner", new SoundEvent(Utils.ID("music_disc.k620_speedrunner")));
        put("k620_paradise_land", new SoundEvent(Utils.ID("music_disc.k620_paradise_land")));
        put("k620_feelin_poggers", new SoundEvent(Utils.ID("music_disc.k620_feelin_poggers")));
        put("k620_ingenuity", new SoundEvent(Utils.ID("music_disc.k620_ingenuity")));
        put("k620_past_the_far_lands", new SoundEvent(Utils.ID("music_disc.k620_past_the_far_lands")));
        put("k620_forgot", new SoundEvent(Utils.ID("music_disc.k620_forgot")));
        put("k620_extreme_intensity", new SoundEvent(Utils.ID("music_disc.k620_extreme_intensity")));
        put("k620_deep_beyond_the_end", new SoundEvent(Utils.ID("music_disc.k620_deep_beyond_the_end")));
        put("k620_ender_chaos", new SoundEvent(Utils.ID("music_disc.k620_ender_chaos")));
        put("k620_masterwaves", new SoundEvent(Utils.ID("music_disc.k620_masterwaves")));
        put("k620_lemon_tree", new SoundEvent(Utils.ID("music_disc.k620_lemon_tree")));

        put("fire_blazer_79_void", new SoundEvent(Utils.ID("music_disc.fire_blazer_79_void")));
        put("fire_blazer_79_sight", new SoundEvent(Utils.ID("music_disc.fire_blazer_79_sight")));
        put("fire_blazer_79_aurora", new SoundEvent(Utils.ID("music_disc.fire_blazer_79_aurora")));

        put("epicuras_deepstate", new SoundEvent(Utils.ID("music_disc.epicuras_deepstate")));
        put("epicuras_redfunk", new SoundEvent(Utils.ID("music_disc.epicuras_redfunk")));
        put("epicuras_coldrave", new SoundEvent(Utils.ID("music_disc.epicuras_coldrave")));
        put("epicuras_cradle", new SoundEvent(Utils.ID("music_disc.epicuras_cradle")));
        put("epicuras_ascent", new SoundEvent(Utils.ID("music_disc.epicuras_ascent")));
        put("epicuras_jagged", new SoundEvent(Utils.ID("music_disc.epicuras_jagged")));
        put("epicuras_submarine", new SoundEvent(Utils.ID("music_disc.epicuras_submarine")));
        put("epicuras_beachwave", new SoundEvent(Utils.ID("music_disc.epicuras_beachwave")));
        put("epicuras_odyssey", new SoundEvent(Utils.ID("music_disc.epicuras_odyssey")));

        put("maplemickey_shock", new SoundEvent(Utils.ID("music_disc.maplemickey_shock")));

        put("chefas_wither_dance", new SoundEvent(Utils.ID("music_disc.chefas_wither_dance")));
        put("chefas_diorite", new SoundEvent(Utils.ID("music_disc.chefas_diorite")));

        put("doom_on_a_spoon_just_the_beginning", new SoundEvent(Utils.ID("music_disc.doom_on_a_spoon_just_the_beginning")));
        put("doom_on_a_spoon_tide", new SoundEvent(Utils.ID("music_disc.doom_on_a_spoon_tide")));
        put("doom_on_a_spoon_vengeful", new SoundEvent(Utils.ID("music_disc.doom_on_a_spoon_vengeful")));
        put("doom_on_a_spoon_seeds", new SoundEvent(Utils.ID("music_disc.doom_on_a_spoon_seeds")));
        put("doom_on_a_spoon_ravage", new SoundEvent(Utils.ID("music_disc.doom_on_a_spoon_ravage")));
        put("doom_on_a_spoon_warden", new SoundEvent(Utils.ID("music_disc.doom_on_a_spoon_warden")));
        put("doom_on_a_spoon_flight_of_the_voids_ship", new SoundEvent(Utils.ID("music_disc.doom_on_a_spoon_flight_of_the_voids_ship")));

        put("zoo937_copper", new SoundEvent(Utils.ID("music_disc.zoo937_copper")));
        put("zoo937_dripstone", new SoundEvent(Utils.ID("music_disc.zoo937_dripstone")));
        put("zoo937_magma", new SoundEvent(Utils.ID("music_disc.zoo937_magma")));
        put("zoo937_cavern", new SoundEvent(Utils.ID("music_disc.zoo937_cavern")));

        put("libra_glowsquid", new SoundEvent(Utils.ID("music_disc.libra_glowsquid")));
        put("libra_panic_attack", new SoundEvent(Utils.ID("music_disc.libra_panic_attack")));

        put("deesaster_float", new SoundEvent(Utils.ID("music_disc.deesaster_float")));

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
