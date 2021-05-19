package com.ducksincoming.frostandflame.registry.entity.pumpkinhead;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class PumpkinHeadEntityRenderer extends GeoEntityRenderer<PumpkinHeadEntity> {

    public PumpkinHeadEntityRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new PumpkinHeadModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public Identifier getTexture(PumpkinHeadEntity entity) {
        return new Identifier("fandf", "textures/entity/pumpkinhead/pumpkin_head.png");
    }
}
