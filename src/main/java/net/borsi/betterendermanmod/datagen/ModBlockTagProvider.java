package net.borsi.betterendermanmod.datagen;

import net.borsi.betterendermanmod.reg.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        //-- MINEABLE --//
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ENDER_ORE)
                .add(ModBlocks.RAW_ENDER_BLOCK);

        //-- NEEDS STONE TOOL --//
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        //-- NEEDS IRON TOOL --//
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        //-- NEEDS DIAMOND TOOL --//
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENDER_ORE)
                .add(ModBlocks.RAW_ENDER_BLOCK);

        //-- NEEDS CUSTOM LEVEL TOOL --//
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")));
    }
}
