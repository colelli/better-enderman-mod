package net.borsi.betterendermanmod.datagen;

import net.borsi.betterendermanmod.reg.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.<BLOCK>);
        blockStateModelGenerator.registerParentedItemModel(ModItems.ENTERMAN_SPAWN_EGG, ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.IRON_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_INGOT, Models.GENERATED);
    }

}
