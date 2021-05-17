// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package com.ducksincoming.frostandflame.registry.entity.pumpkinhead;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class PumpkinHeadModel extends EntityModel<PumpkinHeadEntity> {
private final ModelPart bb_main;
	private final ModelPart ArmRight_r1;
public PumpkinHeadModel() {
		textureWidth = 64;
		textureHeight = 64;
		bb_main = new ModelPart(this);
		bb_main.setPivot(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(16, 32).addCuboid(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(32, 0).addCuboid(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 16).addCuboid(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -20.0F, -10.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		ArmRight_r1 = new ModelPart(this);
		ArmRight_r1.setPivot(6.0F, -18.0F, -4.0F);
		bb_main.addChild(ArmRight_r1);
		setRotationAngle(ArmRight_r1, -0.7854F, 0.0F, 0.0F);
		ArmRight_r1.setTextureOffset(24, 16).addCuboid(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		ArmRight_r1.setTextureOffset(0, 32).addCuboid(-14.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
}

	@Override
	public void setAngles(PumpkinHeadEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
	matrixStack.translate(0, 0, 0);
	bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}