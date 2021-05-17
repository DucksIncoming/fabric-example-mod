package com.ducksincoming.frostandflame.registry.entity.pumpkinhead;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PumpkinHeadEntityRenderer extends MobEntityRenderer<PumpkinHeadEntity, PumpkinHeadModel> {

    public PumpkinHeadEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new PumpkinHeadModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(PumpkinHeadEntity entity) {
        return new Identifier("fandf", "textures/entity/pumpkinhead/pumpkin_head.png");
    }
}
