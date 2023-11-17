package unfinished.unfinisheds_content_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import unfinished.unfinisheds_content_mod.Unfinished_sContentMod;

public class ModBlocks
{
    public static final Block LIL_BRO_BLOCK = RegisterBlock
            ("lil_bro_block",
             new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).mapColor(MapColor.WHITE).strength(2.0f, 1200.0f))
            );

    private static Block RegisterBlock(String name, Block block)
    {
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Unfinished_sContentMod.MOD_ID, name), block);
    }

    private static Item RegisterBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(Unfinished_sContentMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void RegisterModBlocks()
    {
        Unfinished_sContentMod.LOGGER.info("Registering Mod Blocks for " + Unfinished_sContentMod.MOD_ID);
    }
}
