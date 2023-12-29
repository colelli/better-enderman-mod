package net.borsi.betterendermanmod;

import net.borsi.betterendermanmod.common.entities.Enterman;
import net.borsi.betterendermanmod.reg.ModBlocks;
import net.borsi.betterendermanmod.reg.ModEntities;
import net.borsi.betterendermanmod.reg.ModItemGroups;
import net.borsi.betterendermanmod.reg.ModItems;
import net.borsi.betterendermanmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndermanMod implements ModInitializer {
	public static final String MOD_ID = "better-enderman-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Call to register all Mod Items & Item Groups
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		// Call to register all Mod Blocks e Block Items
		ModBlocks.registerModBlocks();

		// Call to register alla Mod Entities
		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.ENTERMAN, Enterman.setAttributes());

		// Call to world generation
		ModWorldGeneration.generateModWorldGen();
	}

}