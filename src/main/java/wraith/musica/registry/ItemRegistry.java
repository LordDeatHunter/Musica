package wraith.musica.registry;

import net.devtech.arrp.json.models.JModel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import wraith.musica.CustomItemGroup;
import wraith.musica.CustomMusicDiscItem;
import wraith.musica.Musica;
import wraith.musica.Utils;

import java.util.HashMap;

public final class ItemRegistry {

    private ItemRegistry(){}

    private static final HashMap<String, Item> ITEMS = new HashMap<>();
    private static final FabricItemSettings DISC_SETTINGS = new FabricItemSettings()
                                                        .maxCount(1)
                                                        .group(CustomItemGroup.MUSICA)
                                                        .rarity(Rarity.RARE);

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        register("sticky_disc", new Item(new FabricItemSettings().group(CustomItemGroup.MUSICA)));
        register("blank_disc", new Item(new FabricItemSettings().group(CustomItemGroup.MUSICA)));
        register("song_mixer", new BlockItem(BlockRegistry.get("song_mixer"), new FabricItemSettings().group(CustomItemGroup.MUSICA)));

        createAndRegisterDisc("dire_straits_money_for_nothing");
        createAndRegisterDisc("toto_africa");
        createAndRegisterDisc("john_denver_take_me_home_country_roads");
        createAndRegisterDisc("daft_punk_around_the_world");
        createAndRegisterDisc("rick_astley_never_gonna_give_you_up");
        createAndRegisterDisc("yes_roundabout");

        createAndRegisterDisc("naps_the_block_omen");
        createAndRegisterDisc("naps_the_block_dimensions");
        createAndRegisterDisc("naps_the_block_silence");
        createAndRegisterDisc("naps_the_block_tall");

        createAndRegisterDisc("genius_james_because");

        createAndRegisterDisc("edevegie_world");

        createAndRegisterDisc("carrot_and_co_hue");

        createAndRegisterDisc("gwyd_waves");
        createAndRegisterDisc("gwyd_charr");
        createAndRegisterDisc("gwyd_bricks");
        createAndRegisterDisc("gwyd_tricks");
        createAndRegisterDisc("gwyd_click");

        createAndRegisterDisc("lost_angel_bastion");
        createAndRegisterDisc("lost_angel_cheese");
        createAndRegisterDisc("lost_angel_drifter");
        createAndRegisterDisc("lost_angel_eyes");
        createAndRegisterDisc("lost_angel_face");
        createAndRegisterDisc("lost_angel_haunted");
        createAndRegisterDisc("lost_angel_heartless");
        createAndRegisterDisc("lost_angel_lost");
        createAndRegisterDisc("lost_angel_neoncity");
        createAndRegisterDisc("lost_angel_past");
        createAndRegisterDisc("lost_angel_sepulcrum");
        createAndRegisterDisc("lost_angel_skylines");
        createAndRegisterDisc("lost_angel_wilds");
        createAndRegisterDisc("lost_angel_ice_shards");
        createAndRegisterDisc("lost_angel_chemistry");
        createAndRegisterDisc("lost_angel_souls");
        createAndRegisterDisc("lost_angel_crush");
        createAndRegisterDisc("lost_angel_crippling_fear");
        createAndRegisterDisc("lost_angel_shattered");
        createAndRegisterDisc("lost_angel_silva");
        createAndRegisterDisc("lost_angel_holger");
        createAndRegisterDisc("lost_angel_grit");
        createAndRegisterDisc("lost_angel_united");
        createAndRegisterDisc("lost_angel_stalker");
        createAndRegisterDisc("lost_angel_amethyst");
        createAndRegisterDisc("lost_angel_archer");
        createAndRegisterDisc("lost_angel_cheddar");
        createAndRegisterDisc("lost_angel_disc_14");
        createAndRegisterDisc("lost_angel_disc_39");
        createAndRegisterDisc("lost_angel_enderwalk");
        createAndRegisterDisc("lost_angel_fred");
        createAndRegisterDisc("lost_angel_galactica");
        createAndRegisterDisc("lost_angel_high_rise");
        createAndRegisterDisc("lost_angel_lost_300");
        createAndRegisterDisc("lost_angel_mansion");
        createAndRegisterDisc("lost_angel_mellow_fruit");
        createAndRegisterDisc("lost_angel_mozzeralla");
        createAndRegisterDisc("lost_angel_nightmare");
        createAndRegisterDisc("lost_angel_odyssey");
        createAndRegisterDisc("lost_angel_pumpkin_patch");
        createAndRegisterDisc("lost_angel_sea_side");
        createAndRegisterDisc("lost_angel_shrooms");
        createAndRegisterDisc("lost_angel_simple");
        createAndRegisterDisc("lost_angel_slither");
        createAndRegisterDisc("lost_angel_strike_them_down");
        createAndRegisterDisc("lost_angel_tall_remix");
        createAndRegisterDisc("lost_angel_tears_of_joy");
        createAndRegisterDisc("lost_angel_the_speedrunner");
        createAndRegisterDisc("lost_angel_the_syndicate");
        createAndRegisterDisc("lost_angel_the_tall_ones");
        createAndRegisterDisc("lost_angel_the_unfinished_symphony");

        createAndRegisterDisc("kaz_shroom");
        createAndRegisterDisc("kaz_rain");
        createAndRegisterDisc("kaz_activate");

        createAndRegisterDisc("firch_anti");
        createAndRegisterDisc("firch_range");
        createAndRegisterDisc("firch_chop");
        createAndRegisterDisc("firch_prophet");

        createAndRegisterDisc("twockx_eternal_dream");

        createAndRegisterDisc("yekonaip_plains");
        createAndRegisterDisc("yekonaip_ocean");
        createAndRegisterDisc("yekonaip_savanna");
        createAndRegisterDisc("yekonaip_swampland");
        createAndRegisterDisc("yekonaip_mesa");
        createAndRegisterDisc("yekonaip_extreme_hills");
        createAndRegisterDisc("yekonaip_taiga");
        createAndRegisterDisc("yekonaip_jungle");
        createAndRegisterDisc("yekonaip_desert");

        createAndRegisterDisc("jamiesname_18");
        createAndRegisterDisc("jamiesname_shulk");
        createAndRegisterDisc("jamiesname_pillaged");

        createAndRegisterDisc("bling_cheese_birch_bop");
        createAndRegisterDisc("bling_cheese_charlie");
        createAndRegisterDisc("bling_cheese_chicken");
        createAndRegisterDisc("bling_cheese_fort_stress");
        createAndRegisterDisc("bling_cheese_disc_15");
        createAndRegisterDisc("bling_cheese_neon");
        createAndRegisterDisc("bling_cheese_skulk");
        createAndRegisterDisc("bling_cheese_strall");
        createAndRegisterDisc("bling_cheese_surviving");
        createAndRegisterDisc("bling_cheese_time");

        createAndRegisterDisc("terraainn_moonset");
        createAndRegisterDisc("terraainn_insomnia");
        createAndRegisterDisc("terraainn_tweet");
        createAndRegisterDisc("terraainn_crimson_columns");
        createAndRegisterDisc("terraainn_wind");
        createAndRegisterDisc("terraainn_close");
        createAndRegisterDisc("terraainn_rgb");
        createAndRegisterDisc("terraainn_disc_20");
        createAndRegisterDisc("terraainn_disc_15");
        createAndRegisterDisc("terraainn_storm");
        createAndRegisterDisc("terraainn_illager_raid");
        createAndRegisterDisc("terraainn_100");
        createAndRegisterDisc("terraainn_lush");
        createAndRegisterDisc("terraainn_remnant");
        createAndRegisterDisc("terraainn_finale");
        createAndRegisterDisc("terraainn_glow");
        createAndRegisterDisc("terraainn_looking_backward");
        createAndRegisterDisc("terraainn_proto");
        createAndRegisterDisc("terraainn_sussy");
        createAndRegisterDisc("terraainn_terrain");
        createAndRegisterDisc("terraainn_ultima");
        createAndRegisterDisc("terraainn_alex");
        createAndRegisterDisc("terraainn_steve");
        createAndRegisterDisc("terraainn_2010");
        createAndRegisterDisc("terraainn_error");
        createAndRegisterDisc("terraainn_deep");

        createAndRegisterDisc("tandem_music_over");

        createAndRegisterDisc("hearken_music_warped");
        createAndRegisterDisc("hearken_music_first_night");

        createAndRegisterDisc("error_404_music_ender_disc");

        createAndRegisterDisc("medlek_stew");

        createAndRegisterDisc("4pointzx_12");
        createAndRegisterDisc("4pointzx_anthem");
        createAndRegisterDisc("4pointzx_dust");
        createAndRegisterDisc("4pointzx_levitate");
        createAndRegisterDisc("4pointzx_prism");
        createAndRegisterDisc("4pointzx_seaside");
        createAndRegisterDisc("4pointzx_sensor");
        createAndRegisterDisc("4pointzx_shine");
        createAndRegisterDisc("4pointzx_warm");
        createAndRegisterDisc("4pointzx_watcher");
        createAndRegisterDisc("4pointzx_flame");
        createAndRegisterDisc("4pointzx_scorch");

        createAndRegisterDisc("a_peace_of_pie_chorus");
        createAndRegisterDisc("a_peace_of_pie_flutermo");
        createAndRegisterDisc("a_peace_of_pie_roots");
        createAndRegisterDisc("a_peace_of_pie_pumpking");
        createAndRegisterDisc("a_peace_of_pie_drockstone");
        createAndRegisterDisc("a_peace_of_pie_sculktronic");
        createAndRegisterDisc("a_peace_of_pie_melone");
        createAndRegisterDisc("a_peace_of_pie_toxicoses");
        createAndRegisterDisc("a_peace_of_pie_lurkin");
        createAndRegisterDisc("a_peace_of_pie_fungus");

        createAndRegisterDisc("k620_aqua");
        createAndRegisterDisc("k620_run");
        createAndRegisterDisc("k620_midnight");
        createAndRegisterDisc("k620_speedrunner");
        createAndRegisterDisc("k620_paradise_land");
        createAndRegisterDisc("k620_feelin_poggers");
        createAndRegisterDisc("k620_ingenuity");
        createAndRegisterDisc("k620_past_the_far_lands");
        createAndRegisterDisc("k620_forgot");
        createAndRegisterDisc("k620_extreme_intensity");
        createAndRegisterDisc("k620_deep_beyond_the_end");
        createAndRegisterDisc("k620_ender_chaos");
        createAndRegisterDisc("k620_masterwaves");
        createAndRegisterDisc("k620_lemon_tree");

        createAndRegisterDisc("fire_blazer_79_aurora");
        createAndRegisterDisc("fire_blazer_79_void");
        createAndRegisterDisc("fire_blazer_79_sight");

        createAndRegisterDisc("epicuras_deepstate");
        createAndRegisterDisc("epicuras_redfunk");
        createAndRegisterDisc("epicuras_coldrave");
        createAndRegisterDisc("epicuras_cradle");
        createAndRegisterDisc("epicuras_ascent");
        createAndRegisterDisc("epicuras_jagged");
        createAndRegisterDisc("epicuras_submarine");
        createAndRegisterDisc("epicuras_beachwave");
        createAndRegisterDisc("epicuras_odyssey");

        createAndRegisterDisc("maplemickey_shock");

        createAndRegisterDisc("chefas_wither_dance");
        createAndRegisterDisc("chefas_diorite");

        createAndRegisterDisc("doom_on_a_spoon_just_the_beginning");
        createAndRegisterDisc("doom_on_a_spoon_tide");
        createAndRegisterDisc("doom_on_a_spoon_vengeful");
        createAndRegisterDisc("doom_on_a_spoon_seeds");
        createAndRegisterDisc("doom_on_a_spoon_ravage");
        createAndRegisterDisc("doom_on_a_spoon_warden");
        createAndRegisterDisc("doom_on_a_spoon_flight_of_the_voids_ship");

        createAndRegisterDisc("zoo937_copper");
        createAndRegisterDisc("zoo937_dripstone");
        createAndRegisterDisc("zoo937_magma");
        createAndRegisterDisc("zoo937_cavern");

        createAndRegisterDisc("libra_glowsquid");
        createAndRegisterDisc("libra_panic_attack");

        createAndRegisterDisc("deesaster_float");

        createAndRegisterDisc("w7n_disc_16");
    }

    public static void createAndRegisterDisc(String id) {
        SoundEventsRegistry.createAndRegister(id);
        register("music_disc_" + id, new CustomMusicDiscItem(10, SoundEventsRegistry.get(id), DISC_SETTINGS));
        var identifier = Utils.ID("item/music_disc_" + id);
        Musica.RESOURCE_PACK.addModel(JModel.model("minecraft:item/generated").textures(JModel.textures().layer0(identifier.toString())), identifier);
    }

    public static void register(String id, Item item) {
        ITEMS.put(id, Registry.register(Registry.ITEM, Utils.ID(id), item));
    }

    public static Item get(String key) {
        return ITEMS.getOrDefault(key, Items.AIR);
    }

    public static boolean contains(String item) {
        return ITEMS.containsKey(item);
    }

}