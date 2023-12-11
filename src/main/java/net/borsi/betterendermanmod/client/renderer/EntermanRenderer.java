package net.borsi.betterendermanmod.client.renderer;

import net.borsi.betterendermanmod.BetterEndermanMod;
import net.borsi.betterendermanmod.common.entities.Enterman;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class EntermanRenderer extends GeoEntityRenderer<Enterman> {
    public EntermanRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new EntermanModel());
    }

    @Override
    public Identifier getTextureLocation(Enterman animatable) {
        return new Identifier(BetterEndermanMod.MOD_ID, "textures/entity/enterman.png");
    }

    @Override
    public void render(Enterman entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
