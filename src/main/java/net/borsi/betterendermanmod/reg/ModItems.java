package net.borsi.betterendermanmod.reg;

import net.borsi.betterendermanmod.BetterEndermanMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //--- ITEM LIST ---//
    public static final Item IRON_POWDER = registerItem("iron_powder", new Item(new FabricItemSettings()));
    public static final Item GOLD_POWDER = registerItem("gold_powder", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_POWDER = registerItem("obsidian_powder", new Item(new FabricItemSettings()));
    public static final Item ENDER_POWDER = registerItem("ender_powder", new Item(new FabricItemSettings()));

    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDER_INGOT = registerItem("ender_ingot", new Item(new FabricItemSettings()));

    public static final Item ENTERMAN_SPAWN_EGG = registerItem("enterman_spawn_egg", new SpawnEggItem(ModEntities.ENTERMAN, 0x613E24, 0x60AB4B, new FabricItemSettings()));

    //--- HELPER METHODS ---//
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BetterEndermanMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        BetterEndermanMod.LOGGER.info("["+BetterEndermanMod.MOD_ID+":MOD_ITEMS] >>> Registering Mod Items for "+BetterEndermanMod.MOD_ID);
    }

}
