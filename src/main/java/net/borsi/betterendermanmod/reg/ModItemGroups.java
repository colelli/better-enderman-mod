package net.borsi.betterendermanmod.reg;

import net.borsi.betterendermanmod.BetterEndermanMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BETTER_ENDERMAN_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BetterEndermanMod.MOD_ID,"better-enderman-mod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.better-enderman-mod"))
                    .icon(() -> new ItemStack(ModItems.ENDER_INGOT)).entries((displayContext, entries) -> {

                        //--------------- BLOCKS ---------------//
                        //-- ORES --//

                        //-- BUILDING BLOCKS --//

                        //-- CRAFTING --//

                        //--------------- ITEMS ---------------//
                        //-- INGREDIENTS --//
                        entries.add(ModItems.IRON_POWDER);
                        entries.add(ModItems.GOLD_POWDER);
                        entries.add(ModItems.OBSIDIAN_POWDER);
                        entries.add(ModItems.ENDER_POWDER);
                        entries.add(ModItems.OBSIDIAN_INGOT);
                        entries.add(ModItems.ENDER_INGOT);

                        //-- SPAWN EGGS --//
                        entries.add(ModItems.ENTERMAN_SPAWN_EGG);

                    }).build());

    public static void registerItemGroups(){
        BetterEndermanMod.LOGGER.info("["+BetterEndermanMod.MOD_ID+":MOD_ITEM_GROUPS] >>> Registering Mod Item Groups for "+BetterEndermanMod.MOD_ID);
    }
}
