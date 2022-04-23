package net.cyno.vinculum.item;

import net.cyno.vinculum.VinculumMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VincItems {

    public static final Item VINCULIC_CRYSTAL = registerVincItems("vinculic_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof()));

    private static Item registerVincItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VinculumMain.MOD_ID, name), item);
    }

    public static void registerVincItems() {
        System.out.println("Registering Items for " + VinculumMain.MOD_ID);
    }

}
