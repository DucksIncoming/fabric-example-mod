package com.ducksincoming.frostandflame.registry.entity.pumpkinhead;

import com.mojang.datafixers.optics.Wander;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.task.WanderAroundTask;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class PumpkinHeadEntity extends HostileEntity {
    public PumpkinHeadEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(12, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.goalSelector.add(20, new WanderAroundGoal(this, 3.0f));
    }
}
