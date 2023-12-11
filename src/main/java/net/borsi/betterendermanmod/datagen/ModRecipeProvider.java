package net.borsi.betterendermanmod.datagen;

import net.borsi.betterendermanmod.reg.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final int DEFAULT_SMELTING_TIME = 200;
    private static final int DEFAULT_BLASTING_TIME = 100;
    private static final List<ItemConvertible> ENDER_INGOT_SMELTABLES = List.of(ModItems.ENDER_POWDER);
    private static final List<ItemConvertible> OBSIDIAN_INGOT_SMETABLES = List.of(ModItems.OBSIDIAN_POWDER);
    private static final List<ItemConvertible> GOLD_INGOT_SMELTABLES = List.of(ModItems.GOLD_POWDER);
    private static final List<ItemConvertible> IRON_INGOT_SMELTABLES = List.of(ModItems.IRON_POWDER);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, IRON_INGOT_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.5f, DEFAULT_SMELTING_TIME, "ender");
        offerBlasting(exporter, IRON_INGOT_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.5f, DEFAULT_BLASTING_TIME, "ender");
        offerSmelting(exporter, GOLD_INGOT_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.5f, DEFAULT_SMELTING_TIME, "ender");
        offerBlasting(exporter, GOLD_INGOT_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.5f, DEFAULT_BLASTING_TIME, "ender");
        offerSmelting(exporter, OBSIDIAN_INGOT_SMETABLES, RecipeCategory.MISC, ModItems.OBSIDIAN_INGOT, 0.7f, DEFAULT_SMELTING_TIME, "ender");
        offerBlasting(exporter, OBSIDIAN_INGOT_SMETABLES, RecipeCategory.MISC, ModItems.OBSIDIAN_INGOT, 0.7f, DEFAULT_BLASTING_TIME, "ender");
        offerSmelting(exporter, ENDER_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.ENDER_INGOT, 1.0f, DEFAULT_SMELTING_TIME, "ender");
        offerBlasting(exporter, ENDER_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.ENDER_INGOT, 1.0f, DEFAULT_BLASTING_TIME, "ender");

        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.<ITEM>, RecipeCategory.BUILDING_BLOCKS, ModBlocks.<BLOCK>);
    }
}
