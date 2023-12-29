package net.borsi.betterendermanmod.datagen;

import net.borsi.betterendermanmod.reg.ModBlocks;
import net.borsi.betterendermanmod.reg.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //-- DROP ITSELF --//
        //addDrop(ModBlocks.<BLOCK>);
        addDrop(ModBlocks.RAW_ENDER_BLOCK);

        //-- DROP ORE(S) --//
        //addDrop(ModBlocks.<BLOCK>, oreDrops(ModBlocks.<BLOCK>, ModItems.<ITEM>)); // oreDrops() drops only 1 of the corresponding Item
        addDrop(ModBlocks.ENDER_ORE, oreDrops(ModBlocks.ENDER_ORE, ModItems.RAW_ENDER));

        //multipleOreDrops(ModBlocks.<BLOCK>, Items.QUARTZ, UniformLootNumberProvider.create(1, 4));

    }


    public LootTable.Builder multipleOreDrops(Block drop, Item item, LootNumberProvider lootNumberProvider) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(item).apply(SetCountLootFunction.builder(lootNumberProvider))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

}
