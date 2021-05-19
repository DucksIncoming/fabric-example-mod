// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

package com.ducksincoming.frostandflame.registry.entity.pumpkinhead;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PumpkinHeadModel extends AnimatedGeoModel<PumpkinHeadEntity> {

	@Override
	public Identifier getModelLocation(PumpkinHeadEntity object) {
		return new Identifier("fandf", "geo/pumpkin_head.geo.json");
	}

	@Override
	public Identifier getTextureLocation(PumpkinHeadEntity object) {
		return new Identifier("fandf", "textures/entity/pumpkinhead/pumpkin_head.png");
	}

	@Override
	public Identifier getAnimationFileLocation(PumpkinHeadEntity animatable) {
		return new Identifier("fandf", "animations/pumpkinhead/pumpkinhead.walk.json");
	}
}