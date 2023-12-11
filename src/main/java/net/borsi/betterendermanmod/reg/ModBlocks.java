package net.borsi.betterendermanmod.reg;

import net.borsi.betterendermanmod.BetterEndermanMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

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
