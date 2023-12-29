package net.borsi.betterendermanmod.reg;

import net.borsi.betterendermanmod.BetterEndermanMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block ENDER_ORE = registerBlock("ender_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 6), FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block RAW_ENDER_BLOCK = registerBlock("raw_ender_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));

    //--- HELPER METHODS ---//
    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(BetterEndermanMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterEndermanMod.MOD_ID, name), block);
    }
    public static void registerModBlocks(){
        BetterEndermanMod.LOGGER.info("["+BetterEndermanMod.MOD_ID+":MOD_BLOCKS] >>> Registering Mod Blocks for " + BetterEndermanMod.MOD_ID);
    }

}
