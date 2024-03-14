package com.CartersDev.CrysTechMod.block.custom.Trees;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

import java.util.Random;

public class FlowerofLifeBlock extends FlowerBlock {
    public FlowerofLifeBlock(Effect effect, int num, Properties properties) {

        super(effect, num, properties);
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        float chance = 0.35f;
        if(chance < rand.nextFloat()) {
            worldIn.addParticle(ParticleTypes.REVERSE_PORTAL, pos.getX() + rand.nextDouble(),
                    pos.getY() + 0.7D, pos.getZ() + rand.nextDouble(),
                    0d, 0.05d, 0d);

        }


        super.animateTick(stateIn, worldIn, pos, rand);
    }

    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entity) {
        if(!worldIn.isRemote && worldIn.getDifficulty() != Difficulty.PEACEFUL) {
            if(entity instanceof LivingEntity) {
            LivingEntity target = (LivingEntity) entity;
            target.addPotionEffect(new EffectInstance(Effects.NAUSEA, 200));
            }
        }
    }
}
