package net.cyno.vinculum.item;

import net.cyno.vinculum.VinculumMain;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class VincItemGroups {
    public static final ItemGroup VINCULUM = FabricItemGroupBuilder.build(new Identifier(VinculumMain.MOD_ID, "vinculum"),
            () -> new ItemStack(VincItems.VINCULIC_CRYSTAL));
}
