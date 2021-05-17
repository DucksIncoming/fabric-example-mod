package com.ducksincoming.frostandflame;

import com.ducksincoming.frostandflame.registry.entity.pumpkinhead.PumpkinHeadEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.ducksincoming.frostandflame.FrostAndFlameClient;

public class FrostAndFlame implements ModInitializer {

    public static final EntityType<PumpkinHeadEntity> PUMPKIN_HEAD = Registry.register(
        Registry.ENTITY_TYPE, new Identifier("fandf", "pumpkin_head"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, PumpkinHeadEntity::new).dimensions(EntityDimensions.fixed(0.75f, 1.5f)).build()
    );

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("fandf", "pumpkin_head_spawn_egg"), new SpawnEggItem(FrostAndFlame.PUMPKIN_HEAD, 0x000000, 0xFFAE00, new Item.Settings().group(ItemGroup.MISC)));
        FabricDefaultAttributeRegistry.register(PUMPKIN_HEAD, PumpkinHeadEntity.createMobAttributes());
    }
}
