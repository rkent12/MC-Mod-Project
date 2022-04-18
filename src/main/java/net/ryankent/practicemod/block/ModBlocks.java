package net.ryankent.practicemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ryankent.practicemod.PracticeMod;
import net.ryankent.practicemod.block.custom.CustomBlock;
import net.ryankent.practicemod.block.custom.ModStairsBlock;
import net.ryankent.practicemod.block.custom.StatusBlock;
import net.ryankent.practicemod.item.ModItemGroup;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
        new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
                .breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f)
                    .breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new ModStairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(6.0f)
                    .breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f)
                    .breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block CUSTOM_BLOCK = registerBlock("custom_block",
            new CustomBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().nonOpaque()));

    public static final Block STATUS_BLOCK = registerBlock("status_block",
            new StatusBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f)
                    .breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registry.BLOCK, new Identifier(PracticeMod.mod_id, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(PracticeMod.mod_id, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.MOD)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + PracticeMod.mod_id);
    }
}
