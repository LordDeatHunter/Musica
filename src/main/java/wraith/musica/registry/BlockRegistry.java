package wraith.musica.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import wraith.musica.SongMixerBlock;
import wraith.musica.Utils;

import java.util.HashMap;
import java.util.Map;

public class BlockRegistry {

    private BlockRegistry(){}

    private static final HashMap<String, Block> BLOCKS = new HashMap<>() {{
        put("song_mixer", new SongMixerBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DIRT_BROWN).strength(2.0F, 6.0F)));
    }};

    public static void register() {
        for (Map.Entry<String, Block> block : BLOCKS.entrySet()) {
            Registry.register(Registry.BLOCK, Utils.ID(block.getKey()), block.getValue());
        }
    }

    public static Block get(String key) {
        return BLOCKS.get(key);
    }

}
