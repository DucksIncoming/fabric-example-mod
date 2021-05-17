package com.ducksincoming.frostandflame.registry.entity.pumpkinhead;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class PumpkinHeadEntity extends HostileEntity {
    public PumpkinHeadEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
}
