package net.cyno.vinculum.entity.custom;

import net.cyno.vinculum.sound.VincSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;


public class HerobrineEntity extends PathAwareEntity implements IAnimatable {
    public HerobrineEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }


    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 150.00D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.10000000149011612d)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.00D);


    }

    protected void initGoals() {
        this.goalSelector.add(0, new StopAndLookAtEntityGoal(this, PlayerEntity.class, 50.0f, 1));
        this.initCustomGoals();
    }

    private void initCustomGoals() {
        this.targetSelector.add(1, new ActiveTargetGoal(this, PlayerEntity.class, true));
    }



    @Override
    public boolean isOnFire() {
        return false;
    }

    @Override
    public boolean isFireImmune() {
        return true;
    }


    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_GENERIC_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_PLAYER_DEATH;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_ZOMBIE_STEP, 0.25f, 0.75f);
    }

    @Override
    public void onDeath(DamageSource source) {
        super.onDeath(source);
    }

    private AnimationFactory factory = new AnimationFactory(this);

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.herobrine.walk", true));
        } else {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.herobrine.idle", true));
        }

        return PlayState.CONTINUE;
    }
}
