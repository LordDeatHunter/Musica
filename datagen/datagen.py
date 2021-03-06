import json
from pathlib import Path

items = [
  "dire_straits_money_for_nothing",
  "toto_africa",
  "john_denver_take_me_home_country_roads",
  "daft_punk_around_the_world",
  "rick_astley_never_gonna_give_you_up",
  "yes_roundabout",
  "naps_the_block_omen",
  "naps_the_block_dimensions",
  "naps_the_block_silence",
  "naps_the_block_tall",
  "genius_james_because",
  "edevegie_world",
  "carrot_and_co_hue",
  "gwyd_waves",
  "gwyd_charr",
  "gwyd_bricks",
  "gwyd_tricks",
  "gwyd_click",
  "lost_angel_bastion",
  "lost_angel_cheese",
  "lost_angel_drifter",
  "lost_angel_eyes",
  "lost_angel_face",
  "lost_angel_haunted",
  "lost_angel_heartless",
  "lost_angel_lost",
  "lost_angel_neoncity",
  "lost_angel_past",
  "lost_angel_sepulcrum",
  "lost_angel_skylines",
  "lost_angel_wilds",
  "lost_angel_ice_shards",
  "lost_angel_chemistry",
  "lost_angel_souls",
  "lost_angel_crush",
  "lost_angel_crippling_fear",
  "lost_angel_shattered",
  "lost_angel_silva",
  "lost_angel_holger",
  "lost_angel_grit",
  "lost_angel_united",
  "lost_angel_stalker",
  "lost_angel_amethyst",
  "lost_angel_archer",
  "lost_angel_cheddar",
  "lost_angel_disc_14",
  "lost_angel_disc_39",
  "lost_angel_enderwalk",
  "lost_angel_fred",
  "lost_angel_galactica",
  "lost_angel_high_rise",
  "lost_angel_lost_300",
  "lost_angel_mansion",
  "lost_angel_mellow_fruit",
  "lost_angel_mozzeralla",
  "lost_angel_nightmare",
  "lost_angel_odyssey",
  "lost_angel_pumpkin_patch",
  "lost_angel_sea_side",
  "lost_angel_shrooms",
  "lost_angel_simple",
  "lost_angel_slither",
  "lost_angel_strike_them_down",
  "lost_angel_tall_remix",
  "lost_angel_tears_of_joy",
  "lost_angel_the_speedrunner",
  "lost_angel_the_syndicate",
  "lost_angel_the_tall_ones",
  "lost_angel_the_unfinished_symphony",
  "kaz_shroom",
  "kaz_rain",
  "kaz_activate",
  "kaz_chorus",
  "kaz_droopy_loves_jean",
  "kaz_jungle",
  "kaz_low_ki_sailing",
  "kaz_noon",
  "kaz_soul",
  "kaz_tall_remix",
  "firch_anti",
  "firch_range",
  "firch_chop",
  "firch_prophet",
  "twockx_eternal_dream",
  "yekonaip_plains",
  "yekonaip_ocean",
  "yekonaip_savanna",
  "yekonaip_swampland",
  "yekonaip_mesa",
  "yekonaip_extreme_hills",
  "yekonaip_taiga",
  "yekonaip_jungle",
  "yekonaip_desert",
  "jamiesname_18",
  "jamiesname_shulk",
  "jamiesname_pillaged",
  "bling_cheese_birch_bop",
  "bling_cheese_charlie",
  "bling_cheese_chicken",
  "bling_cheese_fort_stress",
  "bling_cheese_disc_15",
  "bling_cheese_neon",
  "bling_cheese_skulk",
  "bling_cheese_strall",
  "bling_cheese_surviving",
  "bling_cheese_time",
  "bling_cheese_brain_sploshed",
  "bling_cheese_ever_ending",
  "bling_cheese_woodland_wobble",
  "terraainn_moonset",
  "terraainn_insomnia",
  "terraainn_tweet",
  "terraainn_crimson_columns",
  "terraainn_wind",
  "terraainn_close",
  "terraainn_rgb",
  "terraainn_disc_20",
  "terraainn_disc_15",
  "terraainn_storm",
  "terraainn_illager_raid",
  "terraainn_100",
  "terraainn_lush",
  "terraainn_remnant",
  "terraainn_finale",
  "terraainn_glow",
  "terraainn_looking_backward",
  "terraainn_proto",
  "terraainn_sussy",
  "terraainn_terrain",
  "terraainn_ultima",
  "terraainn_alex",
  "terraainn_steve",
  "terraainn_2010",
  "terraainn_error",
  "terraainn_deep",
  "tandem_music_over",
  "hearken_music_warped",
  "hearken_music_first_night",
  "error_404_music_ender_disc",
  "medlek_stew",
  "4pointzx_12",
  "4pointzx_anthem",
  "4pointzx_dust",
  "4pointzx_levitate",
  "4pointzx_prism",
  "4pointzx_seaside",
  "4pointzx_sensor",
  "4pointzx_shine",
  "4pointzx_warm",
  "4pointzx_watcher",
  "4pointzx_flame",
  "4pointzx_scorch",
  "a_peace_of_pie_chorus",
  "a_peace_of_pie_flutermo",
  "a_peace_of_pie_roots",
  "a_peace_of_pie_pumpking",
  "a_peace_of_pie_drockstone",
  "a_peace_of_pie_sculktronic",
  "a_peace_of_pie_melone",
  "a_peace_of_pie_toxicoses",
  "a_peace_of_pie_lurkin",
  "a_peace_of_pie_fungus",
  "k620_aqua",
  "k620_run",
  "k620_midnight",
  "k620_speedrunner",
  "k620_paradise_land",
  "k620_feelin_poggers",
  "k620_ingenuity",
  "k620_past_the_far_lands",
  "k620_forgot",
  "k620_extreme_intensity",
  "k620_deep_beyond_the_end",
  "k620_ender_chaos",
  "k620_masterwaves",
  "k620_lemon_tree",
  "fire_blazer_79_aurora",
  "fire_blazer_79_void",
  "fire_blazer_79_sight",
  "epicuras_deepstate",
  "epicuras_redfunk",
  "epicuras_coldrave",
  "epicuras_cradle",
  "epicuras_ascent",
  "epicuras_jagged",
  "epicuras_submarine",
  "epicuras_beachwave",
  "epicuras_odyssey",
  "maplemickey_shock",
  "chefas_wither_dance",
  "chefas_diorite",
  "doom_on_a_spoon_just_the_beginning",
  "doom_on_a_spoon_tide",
  "doom_on_a_spoon_vengeful",
  "doom_on_a_spoon_seeds",
  "doom_on_a_spoon_ravage",
  "doom_on_a_spoon_warden",
  "doom_on_a_spoon_flight_of_the_voids_ship",
  "zoo937_copper",
  "zoo937_dripstone",
  "zoo937_magma",
  "zoo937_cavern",
  "libra_glowsquid",
  "libra_panic_attack",
  "deesaster_float",
  "w7n_disc_16",
  "w7n_disc_8",
  "w7n_disc_9",
  "w7n_disc_19"
]

for item in items:
  model = {
        'parent': "minecraft:item/generated",
        'textures': {
          'layer0': f"musica:item/music_disc_{item}"
        }
      }
  save_dir = "assets/musica/models/item/"
  filepath = save_dir + f"music_disc_{item}.json"
  Path(__file__).parent.joinpath(save_dir).mkdir(parents=True, exist_ok=True)
  with Path(__file__).parent.joinpath(filepath).open('w') as f:
      f.write(json.dumps(model, indent=2))