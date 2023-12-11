package net.borsi.betterendermanmod;

import net.borsi.betterendermanmod.client.renderer.EntermanRenderer;
import net.borsi.betterendermanmod.reg.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class BetterEndermanModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.ENTERMAN, EntermanRenderer::new);
    }
}
