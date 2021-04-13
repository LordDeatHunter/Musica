package wraith.musica.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import wraith.musica.CustomItemGroup;
import wraith.musica.CustomMusicDiscItem;
import wraith.musica.Utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private ItemRegistry(){}

    private static final HashMap<String, Item> ITEMS = new HashMap<String, Item>() {{
        put("music_disc_dire_straits_money_for_nothing", new CustomMusicDiscItem(10, SoundEventsRegistry.get("dire_straits_money_for_nothing"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_naps_the_block_omen", new CustomMusicDiscItem(10, SoundEventsRegistry.get("naps_the_block_omen"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_naps_the_block_dimensions", new CustomMusicDiscItem(10, SoundEventsRegistry.get("naps_the_block_dimensions"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_naps_the_block_silence", new CustomMusicDiscItem(10, SoundEventsRegistry.get("naps_the_block_silence"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_naps_the_block_tall", new CustomMusicDiscItem(10, SoundEventsRegistry.get("naps_the_block_tall"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_john_denver_take_me_home_country_roads", new CustomMusicDiscItem(10, SoundEventsRegistry.get("john_denver_take_me_home_country_roads"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_toto_africa", new CustomMusicDiscItem(10, SoundEventsRegistry.get("toto_africa"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_rick_astley_never_gonna_give_you_up", new CustomMusicDiscItem(10, SoundEventsRegistry.get("rick_astley_never_gonna_give_you_up"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_genius_james_because", new CustomMusicDiscItem(10, SoundEventsRegistry.get("genius_james_because"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_edevegie_world", new CustomMusicDiscItem(10, SoundEventsRegistry.get("edevegie_world"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_carrot_and_co_hue", new CustomMusicDiscItem(10, SoundEventsRegistry.get("carrot_and_co_hue"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_gwyd_waves", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_waves"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_gwyd_charr", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_charr"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_gwyd_bricks", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_bricks"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
        put("music_disc_gwyd_tricks", new CustomMusicDiscItem(10, SoundEventsRegistry.get("gwyd_tricks"), (new Item.Settings()).maxCount(1).group(CustomItemGroup.MUSICA).rarity(Rarity.RARE)));
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

}
