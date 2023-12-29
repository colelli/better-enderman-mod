package net.borsi.betterendermanmod.reg;

import net.borsi.betterendermanmod.BetterEndermanMod;
import net.borsi.betterendermanmod.common.entities.Enterman;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static EntityType<Enterman> ENTERMAN = Registry.register(Registries.ENTITY_TYPE, new Identifier(BetterEndermanMod.MOD_ID, "enterman"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Enterman::new).dimensions(EntityDimensions.fixed(0.65f, 4.9f)).build());

    public static void registerModEntities(){
        BetterEndermanMod.LOGGER.info("["+BetterEndermanMod.MOD_ID+":MOD_ENTITIES] >>> Registering Mod Entities for "+BetterEndermanMod.MOD_ID);
    }

}
