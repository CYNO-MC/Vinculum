package net.cyno.vinculum.block;

import net.cyno.vinculum.VinculumMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VincBlocks {


    public static final Block GLITCHED_DIRT = registerBlock("glitched_dirt",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.5F).requiresTool()), ItemGroup.MISC);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new  Identifier(VinculumMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(VinculumMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerVincBlocks() {
        System.out.println("Registering Mod Blocks for " + VinculumMain.MOD_ID);
    }
}
