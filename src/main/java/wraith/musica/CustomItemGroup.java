package wraith.musica;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import wraith.musica.registry.ItemRegistry;

public class CustomItemGroup {

    public static final ItemGroup MUSICA = FabricItemGroupBuilder
            .create(Utils.ID("musica"))
            .icon(() -> new ItemStack(ItemRegistry.get("music_disc_dire_straits_money_for_nothing")))
            .build();

}
