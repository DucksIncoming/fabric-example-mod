package com.ducksincoming.frostandflame.registry.entity.pumpkinhead;

import com.ducksincoming.frostandflame.FrostAndFlame;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class PumpkinHeadEntity extends PathAwareEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);
    public boolean PumpkinHeadCanSpawn = true;

    public PumpkinHeadEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        this.ignoreCameraFrustum = true;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event){
        if (this.moveControl.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.pumpkinhead.walk", true));
            return PlayState.CONTINUE;
        }
        else {
            return PlayState.STOP;
        }

    }
    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new WanderAroundGoal(this, 0.5f));
        this.goalSelector.add(2, new AttackGoal (this));
    }

    @Override
    public boolean canSpawn(WorldView view){
        BlockPos blockunderentity = new BlockPos(this.getX(), this.getY() - 1, this.getZ());
        BlockPos posentity = new BlockPos(this.getX(), this.getY(), this.getZ());

        return view.intersectsEntities(this) && this.world.isNight() && !world.containsFluid(this.getBoundingBox())
                && this.world.getBlockState(posentity).getBlock().canMobSpawnInside()
                && this.world.getBlockState(blockunderentity).allowsSpawning(view, blockunderentity, FrostAndFlame.PUMPKIN_HEAD);
    }

    @Override
    public AnimationFactory getFactory(){
        return this.factory;
    }
}
