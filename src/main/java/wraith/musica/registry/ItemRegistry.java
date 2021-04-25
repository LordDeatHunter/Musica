package wraith.musica.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import wraith.musica.CustomItemGroup;
import wraith.musica.CustomMusicDiscItem;
import wraith.musica.Utils;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private ItemRegistry(){}

    private static final HashMap<String, Item> ITEMS = new HashMap<String, Item>() {{
        put("music_disc_dire_straits_money_for_nothing", new CustomMusicDiscItem(10, SoundEventsRegistry.get("dire_straits_money_for_nothing"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_toto_africa", new CustomMusicDiscItem(10, SoundEventsRegistry.get("toto_africa"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_john_denver_take_me_home_country_roads", new CustomMusicDiscItem(10, SoundEventsRegistry.get("john_denver_take_me_home_country_roads"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_daft_punk_around_the_world", new CustomMusicDiscItem(10, SoundEventsRegistry.get("daft_punk_around_the_world"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_rick_astley_never_gonna_give_you_up", new CustomMusicDiscItem(10, SoundEventsRegistry.get("rick_astley_never_gonna_give_you_up"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yes_roundabout", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yes_roundabout"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_naps_the_block_omen", new CustomMusicDiscItem(10, SoundEventsRegistry.get("naps_the_block_omen"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_naps_the_block_dimensions", new CustomMusicDiscItem(10, SoundEventsRegistry.get("naps_the_block_dimensions"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_naps_the_block_silence", new CustomMusicDiscItem(10, SoundEventsRegistry.get("naps_the_block_silence"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_naps_the_block_tall", new CustomMusicDiscItem(10, SoundEventsRegistry.get("naps_the_block_tall"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_genius_james_because", new CustomMusicDiscItem(10, SoundEventsRegistry.get("genius_james_because"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_edevegie_world", new CustomMusicDiscItem(10, SoundEventsRegistry.get("edevegie_world"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_carrot_and_co_hue", new CustomMusicDiscItem(10, SoundEventsRegistry.get("carrot_and_co_hue"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_gwyd_waves", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_waves"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_gwyd_charr", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_charr"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_gwyd_bricks", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_bricks"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_gwyd_tricks", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_tricks"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_gwyd_click", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_click"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_lost_angel_bastion", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_bastion"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_cheese", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_cheese"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_drifter", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_drifter"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_eyes", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_eyes"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_face", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_face"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_haunted", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_haunted"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_heartless", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_heartless"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_lost", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_lost"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_neoncity", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_neoncity"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_past", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_past"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_sepulcrum", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_sepulcrum"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_skylines", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_skylines"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_wilds", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_wilds"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_ice_shards", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_ice_shards"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_chemistry", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_chemistry"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_lost_angel_souls", new CustomMusicDiscItem(10, SoundEventsRegistry.get("lost_angel_souls"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_kaz_shroom", new CustomMusicDiscItem(10, SoundEventsRegistry.get("kaz_shroom"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_kaz_rain", new CustomMusicDiscItem(10, SoundEventsRegistry.get("kaz_rain"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_kaz_activate", new CustomMusicDiscItem(10, SoundEventsRegistry.get("kaz_activate"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_firch_anti", new CustomMusicDiscItem(10, SoundEventsRegistry.get("firch_anti"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_firch_range", new CustomMusicDiscItem(10, SoundEventsRegistry.get("firch_range"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_firch_chop", new CustomMusicDiscItem(10, SoundEventsRegistry.get("firch_chop"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_firch_prophet", new CustomMusicDiscItem(10, SoundEventsRegistry.get("firch_prophet"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_twockx_eternal_dream", new CustomMusicDiscItem(10, SoundEventsRegistry.get("twockx_eternal_dream"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_yekonaip_plains", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_plains"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yekonaip_ocean", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_ocean"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yekonaip_savanna", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_savanna"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yekonaip_swampland", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_swampland"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yekonaip_mesa", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_mesa"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yekonaip_extreme_hills", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_extreme_hills"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yekonaip_taiga", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_taiga"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yekonaip_jungle", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_jungle"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_yekonaip_desert", new CustomMusicDiscItem(10, SoundEventsRegistry.get("yekonaip_desert"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_jamiesname_18", new CustomMusicDiscItem(10, SoundEventsRegistry.get("jamiesname_18"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_jamiesname_shulk", new CustomMusicDiscItem(10, SoundEventsRegistry.get("jamiesname_shulk"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_jamiesname_pillaged", new CustomMusicDiscItem(10, SoundEventsRegistry.get("jamiesname_pillaged"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_bling_cheese_birch_bop", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_birch_bop"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_charlie", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_charlie"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_chicken", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_chicken"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_fort_stress", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_fort_stress"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_ic_5", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_ic_5"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_neon", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_neon"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_skulk", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_skulk"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_strall", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_strall"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_surviving", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_surviving"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_bling_cheese_time", new CustomMusicDiscItem(10, SoundEventsRegistry.get("bling_cheese_time"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        
        put("music_disc_terraainn_moonset", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_moonset"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_insomnia", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_insomnia"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_tweet", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_tweet"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_crimson_columns", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_crimson_columns"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_wind", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_wind"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_close", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_close"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_rgb", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_rgb"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_disc_20", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_disc_20"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_disc_15", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_disc_15"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_storm", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_storm"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_illager_raid", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_illager_raid"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_100", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_100"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_lush", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_lush"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_remnant", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_remnant"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_finale", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_finale"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_glow", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_glow"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_looking_backward", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_looking_backward"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_proto", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_proto"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_sussy", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_sussy"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_terrain", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_terrain"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_terraainn_ultima", new CustomMusicDiscItem(10, SoundEventsRegistry.get("terraainn_ultima"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_tandem_music_over", new CustomMusicDiscItem(10, SoundEventsRegistry.get("tandem_music_over"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_hearken_music_warped", new CustomMusicDiscItem(10, SoundEventsRegistry.get("hearken_music_warped"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_hearken_music_first_night", new CustomMusicDiscItem(10, SoundEventsRegistry.get("hearken_music_first_night"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_error_404_music_ender_disc", new CustomMusicDiscItem(10, SoundEventsRegistry.get("error_404_music_ender_disc"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_medlek_stew", new CustomMusicDiscItem(10, SoundEventsRegistry.get("medlek_stew"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_4pointzx_12", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_12"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_anthem", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_anthem"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_dust", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_dust"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_levitate", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_levitate"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_prism", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_prism"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_seaside", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_seaside"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_sensor", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_sensor"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_shine", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_shine"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_warm", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_warm"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_watcher", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_watcher"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_flame", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_flame"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_4pointzx_scorch", new CustomMusicDiscItem(10, SoundEventsRegistry.get("4pointzx_scorch"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_a_peace_of_pie_chorus", new CustomMusicDiscItem(10, SoundEventsRegistry.get("a_peace_of_pie_chorus"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_a_peace_of_pie_flutermo", new CustomMusicDiscItem(10, SoundEventsRegistry.get("a_peace_of_pie_flutermo"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_a_peace_of_pie_roots", new CustomMusicDiscItem(10, SoundEventsRegistry.get("a_peace_of_pie_roots"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_a_peace_of_pie_pumpking", new CustomMusicDiscItem(10, SoundEventsRegistry.get("a_peace_of_pie_pumpking"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_a_peace_of_pie_drockstone", new CustomMusicDiscItem(10, SoundEventsRegistry.get("a_peace_of_pie_drockstone"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_a_peace_of_pie_sculktronic", new CustomMusicDiscItem(10, SoundEventsRegistry.get("a_peace_of_pie_sculktronic"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));

        put("music_disc_k620_aqua", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_aqua"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_run", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_run"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_midnight", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_midnight"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_speedrunner", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_speedrunner"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_paradise_land", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_paradise_land"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_feelin_poggers", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_feelin_poggers"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_ingenuity", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_ingenuity"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_past_the_far_lands", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_past_the_far_lands"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_forgot", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_forgot"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_extreme_intensity", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_extreme_intensity"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_deep_beyond_the_end", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_deep_beyond_the_end"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_k620_ender_chaos", new CustomMusicDiscItem(10, SoundEventsRegistry.get("k620_ender_chaos"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));


        put("sticky_disc", new Item(new Item.Settings().group(CustomItemGroup.MUSICA)));
        put("blank_disc", new Item(new Item.Settings().group(CustomItemGroup.MUSICA)));
        put("song_mixer", new BlockItem(BlockRegistry.get("song_mixer"), new Item.Settings().group(CustomItemGroup.MUSICA)));
    }};

    public static void register() {
        for (Map.Entry<String, Item> item : ITEMS.entrySet()) {
            Registry.register(Registry.ITEM, Utils.ID(item.getKey()), item.getValue());
        }
    }

    public static Item get(String key) {
        return ITEMS.get(key);
    }

    public static boolean contains(String item) {
        return ITEMS.containsKey(item);
    }

}