package com.CartersDev.CrysTechMod.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class PlaguedLeaves extends LeavesBlock {
    public PlaguedLeaves(Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        float chance = 0.35f;
        if(chance < rand.nextFloat()) {
            worldIn.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, pos.getX() + rand.nextDouble(),
                    pos.getY() + 0.0D, pos.getZ() + rand.nextDouble(),
                    0d, 0.05d, 0d);

        }


        super.animateTick(stateIn, worldIn, pos, rand);
    }
}
