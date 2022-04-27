package net.cyno.vinculum.block;

import net.cyno.vinculum.VinculumMain;
import net.cyno.vinculum.block.custom.CrackedNetherrackBlock;
import net.cyno.vinculum.block.custom.CrystalCobblestoneBlock;
import net.cyno.vinculum.block.custom.RefinedGoldBlock;
import net.cyno.vinculum.item.VincItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VincBlocks {


    public static final Block GLITCHED_DIRT = registerBlock("glitched_dirt",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.5F).requiresTool()
                    .sounds(BlockSoundGroup.GRAVEL)), VincItemGroups.VINCULUM);

    public static final Block CRACKED_NETHERRACK = registerBlock("cracked_netherrack",
            new CrackedNetherrackBlock(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(0.4F).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), VincItemGroups.VINCULUM);

    public static final Block REFINED_GOLD_BLOCK = registerBlock("refined_gold_block",
            new RefinedGoldBlock(FabricBlockSettings.of(Material.METAL).strength(2.5F).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), VincItemGroups.VINCULUM);

    public static final Block CRYS_COBBLE_BLOCK = registerBlock("crys_cobble_block",
            new CrystalCobblestoneBlock(FabricBlockSettings.of(Material.STONE).strength(1.0F).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), VincItemGroups.VINCULUM);




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
