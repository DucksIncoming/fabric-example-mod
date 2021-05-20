package com.ducksincoming.frostandflame;

import com.ducksincoming.frostandflame.registry.entity.pumpkinhead.PumpkinHeadEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.*;

public class FrostAndFlame implements ModInitializer {

    //Entity
    public static final EntityType<PumpkinHeadEntity> PUMPKIN_HEAD = Registry.register(
        Registry.ENTITY_TYPE, new Identifier("fandf", "pumpkin_head"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, PumpkinHeadEntity::new).dimensions(EntityDimensions.fixed(0.75f, 1.5f)).build()
    );

    //Items

    //Blocks
    public static final Block HAUNTED_PUMPKIN = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT));

    @Override
    public void onInitialize() {
        GeckoLib.initialize();

        //Blocks
        Registry.register(Registry.BLOCK, new Identifier("fandf", "haunted_pumpkin"), HAUNTED_PUMPKIN);

        //Items
        Registry.register(Registry.ITEM, new Identifier("fandf", "pumpkin_head_spawn_egg"), new SpawnEggItem(FrostAndFlame.PUMPKIN_HEAD, 0x000000, 0xFFAE00, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("fandf", "haunted_pumpkin"), new BlockItem(HAUNTED_PUMPKIN, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        //Entities
        FabricDefaultAttributeRegistry.register(PUMPKIN_HEAD, PumpkinHeadEntity.createPumpkinHeadAttributes());
    }
}
