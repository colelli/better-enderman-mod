package net.borsi.betterendermanmod.client.renderer;

import net.borsi.betterendermanmod.BetterEndermanMod;
import net.borsi.betterendermanmod.common.entities.Enterman;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class EntermanModel extends GeoModel<Enterman> {
    @Override
    public Identifier getModelResource(Enterman animatable) {
        return new Identifier(BetterEndermanMod.MOD_ID,"geo/enterman.geo.json");
    }

    @Override
    public Identifier getTextureResource(Enterman animatable) {
        return new Identifier(BetterEndermanMod.MOD_ID, "textures/entity/enterman.png");
    }

    @Override
    public Identifier getAnimationResource(Enterman animatable) {
        return new Identifier(BetterEndermanMod.MOD_ID, "animations/enterman.animation.json");
    }

    @Override
    public void setCustomAnimations(Enterman animatable, long instanceId, AnimationState<Enterman> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");
        if (head == null) return;
        if (head.getChildBones().isEmpty()) return;

        EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
        head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
    }

}
