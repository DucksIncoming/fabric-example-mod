package com.ducksincoming.frostandflame;

import com.ducksincoming.frostandflame.registry.entity.pumpkinhead.PumpkinHeadEntity;
import com.ducksincoming.frostandflame.registry.entity.pumpkinhead.PumpkinHeadEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class FrostAndFlameClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(FrostAndFlame.PUMPKIN_HEAD, (dispatcher, context) -> {
            return new PumpkinHeadEntityRenderer(dispatcher);
        });
    }
}
