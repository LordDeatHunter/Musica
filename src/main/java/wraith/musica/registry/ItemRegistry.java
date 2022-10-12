package wraith.musica.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import wraith.musica.CustomItemGroup;
import wraith.musica.CustomMusicDiscItem;
import wraith.musica.Utils;

import java.util.HashMap;

public final class ItemRegistry {


    private static final HashMap<String, Item> ITEMS = new HashMap<>();
    private static final FabricItemSettings DISC_SETTINGS = new FabricItemSettings()
        .maxCount(1)
        .group(CustomItemGroup.MUSICA)
        .rarity(Rarity.RARE);
    private ItemRegistry() {}

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        register("sticky_disc", new Item(new FabricItemSettings().group(CustomItemGroup.MUSICA)));
        register("blank_disc", new Item(new FabricItemSettings().group(CustomItemGroup.MUSICA)));
        register("song_mixer", new BlockItem(BlockRegistry.get("song_mixer"), new FabricItemSettings().group(CustomItemGroup.MUSICA)));

        createAndRegisterDisc("dire_straits_money_for_nothing", 375);
        createAndRegisterDisc("toto_africa", 251);
        createAndRegisterDisc("john_denver_take_me_home_country_roads", 181);
        createAndRegisterDisc("daft_punk_around_the_world", 424);
        createAndRegisterDisc("rick_astley_never_gonna_give_you_up", 209);
        createAndRegisterDisc("yes_roundabout", 381);

        createAndRegisterDisc("naps_the_block_omen", 160);
        createAndRegisterDisc("naps_the_block_dimensions", 168);
        createAndRegisterDisc("naps_the_block_silence", 202);
        createAndRegisterDisc("naps_the_block_tall", 138);

        createAndRegisterDisc("genius_james_because", 105);

        createAndRegisterDisc("edevegie_world", 136);

        createAndRegisterDisc("carrot_and_co_hue", 148);

        createAndRegisterDisc("gwyd_waves", 88);
        createAndRegisterDisc("gwyd_charr", 56);
        createAndRegisterDisc("gwyd_bricks", 199);
        createAndRegisterDisc("gwyd_tricks", 76);
        createAndRegisterDisc("gwyd_click", 119);

        createAndRegisterDisc("lost_angel_bastion", 140);
        createAndRegisterDisc("lost_angel_cheese", 98);
        createAndRegisterDisc("lost_angel_drifter", 205);
        createAndRegisterDisc("lost_angel_eyes", 240);
        createAndRegisterDisc("lost_angel_face", 179);
        createAndRegisterDisc("lost_angel_haunted", 115);
        createAndRegisterDisc("lost_angel_heartless", 275);
        createAndRegisterDisc("lost_angel_lost", 135);
        createAndRegisterDisc("lost_angel_neoncity", 185);
        createAndRegisterDisc("lost_angel_past", 115);
        createAndRegisterDisc("lost_angel_sepulcrum", 125);
        createAndRegisterDisc("lost_angel_skylines", 205);
        createAndRegisterDisc("lost_angel_wilds", 124);
        createAndRegisterDisc("lost_angel_ice_shards", 138);
        createAndRegisterDisc("lost_angel_chemistry", 225);
        createAndRegisterDisc("lost_angel_souls", 203);
        createAndRegisterDisc("lost_angel_crush", 86);
        createAndRegisterDisc("lost_angel_crippling_fear", 200);
        createAndRegisterDisc("lost_angel_shattered", 156);
        createAndRegisterDisc("lost_angel_silva", 205);
        createAndRegisterDisc("lost_angel_holger", 232);
        createAndRegisterDisc("lost_angel_grit", 203);
        createAndRegisterDisc("lost_angel_united", 120);
        createAndRegisterDisc("lost_angel_stalker", 200);
        createAndRegisterDisc("lost_angel_amethyst", 145);
        createAndRegisterDisc("lost_angel_archer", 185);
        createAndRegisterDisc("lost_angel_cheddar", 110);
        createAndRegisterDisc("lost_angel_disc_14", 85);
        createAndRegisterDisc("lost_angel_disc_39", 195);
        createAndRegisterDisc("lost_angel_enderwalk", 155);
        createAndRegisterDisc("lost_angel_fred", 110);
        createAndRegisterDisc("lost_angel_galactica", 195);
        createAndRegisterDisc("lost_angel_high_rise", 270);
        createAndRegisterDisc("lost_angel_lost_300", 160);
        createAndRegisterDisc("lost_angel_mansion", 70);
        createAndRegisterDisc("lost_angel_mellow_fruit", 140);
        createAndRegisterDisc("lost_angel_mozzeralla", 155);
        createAndRegisterDisc("lost_angel_nightmare", 250);
        createAndRegisterDisc("lost_angel_odyssey", 165);
        createAndRegisterDisc("lost_angel_pumpkin_patch", 300);
        createAndRegisterDisc("lost_angel_sea_side", 75);
        createAndRegisterDisc("lost_angel_shrooms", 155);
        createAndRegisterDisc("lost_angel_simple", 420);
        createAndRegisterDisc("lost_angel_slither", 100);
        createAndRegisterDisc("lost_angel_strike_them_down", 135);
        createAndRegisterDisc("lost_angel_tall_remix", 170);
        createAndRegisterDisc("lost_angel_tears_of_joy", 135);
        createAndRegisterDisc("lost_angel_the_speedrunner", 125);
        createAndRegisterDisc("lost_angel_the_syndicate", 425);
        createAndRegisterDisc("lost_angel_the_tall_ones", 165);
        createAndRegisterDisc("lost_angel_the_unfinished_symphony", 140);

        createAndRegisterDisc("kaz_shroom", 168);
        createAndRegisterDisc("kaz_rain", 124);
        createAndRegisterDisc("kaz_activate", 84);
        createAndRegisterDisc("kaz_chorus", 120);
        createAndRegisterDisc("kaz_droopy_loves_jean", 138);
        createAndRegisterDisc("kaz_jungle", 151);
        createAndRegisterDisc("kaz_low_ki_sailing", 110);
        createAndRegisterDisc("kaz_noon", 157);
        createAndRegisterDisc("kaz_soul", 39);
        createAndRegisterDisc("kaz_tall_remix", 144);

        createAndRegisterDisc("firch_anti", 98);
        createAndRegisterDisc("firch_range", 87);
        createAndRegisterDisc("firch_chop", 99);
        createAndRegisterDisc("firch_prophet", 181);

        createAndRegisterDisc("twockx_eternal_dream", 208);

        createAndRegisterDisc("yekonaip_plains", 143);
        createAndRegisterDisc("yekonaip_ocean", 193);
        createAndRegisterDisc("yekonaip_savanna", 236);
        createAndRegisterDisc("yekonaip_swampland", 212);
        createAndRegisterDisc("yekonaip_mesa", 240);
        createAndRegisterDisc("yekonaip_extreme_hills", 202);
        createAndRegisterDisc("yekonaip_taiga", 177);
        createAndRegisterDisc("yekonaip_jungle", 156);
        createAndRegisterDisc("yekonaip_desert", 223);

        createAndRegisterDisc("jamiesname_18", 134);
        createAndRegisterDisc("jamiesname_shulk", 109);
        createAndRegisterDisc("jamiesname_pillaged", 140);

        createAndRegisterDisc("bling_cheese_birch_bop", 338);
        createAndRegisterDisc("bling_cheese_charlie", 255);
        createAndRegisterDisc("bling_cheese_chicken", 163);
        createAndRegisterDisc("bling_cheese_fort_stress", 295);
        createAndRegisterDisc("bling_cheese_disc_15", 282);
        createAndRegisterDisc("bling_cheese_neon", 224);
        createAndRegisterDisc("bling_cheese_skulk", 203);
        createAndRegisterDisc("bling_cheese_strall", 140);
        createAndRegisterDisc("bling_cheese_surviving", 242);
        createAndRegisterDisc("bling_cheese_time", 226);
        createAndRegisterDisc("bling_cheese_brain_sploshed", 171);
        createAndRegisterDisc("bling_cheese_ever_ending", 366);
        createAndRegisterDisc("bling_cheese_woodland_wobble", 430);

        createAndRegisterDisc("terraainn_moonset", 110);
        createAndRegisterDisc("terraainn_insomnia", 104);
        createAndRegisterDisc("terraainn_tweet", 144);
        createAndRegisterDisc("terraainn_crimson_columns", 124);
        createAndRegisterDisc("terraainn_wind", 106);
        createAndRegisterDisc("terraainn_close", 150);
        createAndRegisterDisc("terraainn_rgb", 185);
        createAndRegisterDisc("terraainn_disc_20", 105);
        createAndRegisterDisc("terraainn_disc_15", 40);
        createAndRegisterDisc("terraainn_storm", 118);
        createAndRegisterDisc("terraainn_illager_raid", 156);
        createAndRegisterDisc("terraainn_100", 199);
        createAndRegisterDisc("terraainn_lush", 134);
        createAndRegisterDisc("terraainn_remnant", 214);
        createAndRegisterDisc("terraainn_finale", 125);
        createAndRegisterDisc("terraainn_glow", 120);
        createAndRegisterDisc("terraainn_looking_backward", 150);
        createAndRegisterDisc("terraainn_proto", 136);
        createAndRegisterDisc("terraainn_sussy", 100);
        createAndRegisterDisc("terraainn_terrain", 213);
        createAndRegisterDisc("terraainn_ultima", 134);
        createAndRegisterDisc("terraainn_alex", 224);
        createAndRegisterDisc("terraainn_steve", 151);
        createAndRegisterDisc("terraainn_2010", 98);
        createAndRegisterDisc("terraainn_error", 134);
        createAndRegisterDisc("terraainn_deep", 103);

        createAndRegisterDisc("tandem_music_over", 167);

        createAndRegisterDisc("hearken_music_warped", 80);
        createAndRegisterDisc("hearken_music_first_night", 84);

        createAndRegisterDisc("error_404_music_ender_disc", 112);

        createAndRegisterDisc("medlek_stew", 230);

        createAndRegisterDisc("4pointzx_12", 102);
        createAndRegisterDisc("4pointzx_anthem", 99);
        createAndRegisterDisc("4pointzx_dust", 100);
        createAndRegisterDisc("4pointzx_levitate", 146);
        createAndRegisterDisc("4pointzx_prism", 91);
        createAndRegisterDisc("4pointzx_seaside", 96);
        createAndRegisterDisc("4pointzx_sensor", 159);
        createAndRegisterDisc("4pointzx_shine", 105);
        createAndRegisterDisc("4pointzx_warm", 81);
        createAndRegisterDisc("4pointzx_watcher", 88);
        createAndRegisterDisc("4pointzx_flame", 126);
        createAndRegisterDisc("4pointzx_scorch", 129);

        createAndRegisterDisc("a_peace_of_pie_chorus", 191);
        createAndRegisterDisc("a_peace_of_pie_flutermo", 180);
        createAndRegisterDisc("a_peace_of_pie_roots", 185);
        createAndRegisterDisc("a_peace_of_pie_pumpking", 187);
        createAndRegisterDisc("a_peace_of_pie_drockstone", 189);
        createAndRegisterDisc("a_peace_of_pie_sculktronic", 127);
        createAndRegisterDisc("a_peace_of_pie_melone", 201);
        createAndRegisterDisc("a_peace_of_pie_toxicoses", 157);
        createAndRegisterDisc("a_peace_of_pie_lurkin", 142);
        createAndRegisterDisc("a_peace_of_pie_fungus", 159);

        createAndRegisterDisc("k620_aqua", 241);
        createAndRegisterDisc("k620_run", 131);
        createAndRegisterDisc("k620_midnight", 231);
        createAndRegisterDisc("k620_speedrunner", 195);
        createAndRegisterDisc("k620_paradise_land", 204);
        createAndRegisterDisc("k620_feelin_poggers", 175);
        createAndRegisterDisc("k620_ingenuity", 180);
        createAndRegisterDisc("k620_past_the_far_lands", 101);
        createAndRegisterDisc("k620_forgot", 216);
        createAndRegisterDisc("k620_extreme_intensity", 176);
        createAndRegisterDisc("k620_deep_beyond_the_end", 176);
        createAndRegisterDisc("k620_ender_chaos", 153);
        createAndRegisterDisc("k620_masterwaves", 195);
        createAndRegisterDisc("k620_lemon_tree", 173);

        createAndRegisterDisc("fire_blazer_79_aurora", 155);
        createAndRegisterDisc("fire_blazer_79_void", 123);
        createAndRegisterDisc("fire_blazer_79_sight", 163);

        createAndRegisterDisc("epicuras_deepstate", 175);
        createAndRegisterDisc("epicuras_redfunk", 148);
        createAndRegisterDisc("epicuras_coldrave", 162);
        createAndRegisterDisc("epicuras_cradle", 121);
        createAndRegisterDisc("epicuras_ascent", 213);
        createAndRegisterDisc("epicuras_jagged", 188);
        createAndRegisterDisc("epicuras_submarine", 204);
        createAndRegisterDisc("epicuras_beachwave", 153);
        createAndRegisterDisc("epicuras_odyssey", 207);

        createAndRegisterDisc("maplemickey_shock", 127);

        createAndRegisterDisc("chefas_wither_dance", 220);
        createAndRegisterDisc("chefas_diorite", 154);

        createAndRegisterDisc("doom_on_a_spoon_just_the_beginning", 183);
        createAndRegisterDisc("doom_on_a_spoon_tide", 148);
        createAndRegisterDisc("doom_on_a_spoon_vengeful", 69);
        createAndRegisterDisc("doom_on_a_spoon_seeds", 124);
        createAndRegisterDisc("doom_on_a_spoon_ravage", 102);
        createAndRegisterDisc("doom_on_a_spoon_warden", 92);
        createAndRegisterDisc("doom_on_a_spoon_flight_of_the_voids_ship", 202);

        createAndRegisterDisc("zoo937_copper", 65);
        createAndRegisterDisc("zoo937_dripstone", 75);
        createAndRegisterDisc("zoo937_magma", 77);
        createAndRegisterDisc("zoo937_cavern", 72);

        createAndRegisterDisc("libra_glowsquid", 166);
        createAndRegisterDisc("libra_panic_attack", 139);

        createAndRegisterDisc("deesaster_float", 157);

        createAndRegisterDisc("w7n_disc_16", 99);
        createAndRegisterDisc("w7n_disc_8", 230);
        createAndRegisterDisc("w7n_disc_9", 201);
        createAndRegisterDisc("w7n_disc_19", 161);
    }

    public static void createAndRegisterDisc(String id, int length) {
        SoundEventsRegistry.createAndRegister(id);
        register("music_disc_" + id, new CustomMusicDiscItem(10, SoundEventsRegistry.get(id), DISC_SETTINGS, length));
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