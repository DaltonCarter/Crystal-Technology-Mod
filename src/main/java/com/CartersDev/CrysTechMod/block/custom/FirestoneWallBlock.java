package com.CartersDev.CrysTechMod.block.custom;

import com.CartersDev.CrysTechMod.item.custom.Firestone;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class FirestoneWallBlock extends WallBlock {

    public FirestoneWallBlock(Properties properties) {
        super(properties);
    }


    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        float chance = 0.35f;
        if(chance < rand.nextFloat()) {
            worldIn.addParticle(ParticleTypes.FLAME, pos.getX() + rand.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + rand.nextDouble(),
                    0d, 0.05d, 0d);

            worldIn.addParticle(new BlockParticleData(ParticleTypes.BLOCK, stateIn), pos.getX() + rand.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + rand.nextDouble(),
                    0.0D, 0.05D, 0.0D);
        }


        super.animateTick(stateIn, worldIn, pos, rand);
    }


    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        Firestone.lightEntityOnFire(entityIn, 5);
        super.onEntityWalk(worldIn, pos, entityIn);
    }


    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entity) {
        Firestone.lightEntityOnFire(entity, 5);
        super.onEntityCollision(state, worldIn, pos, entity);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader blockReader,  List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("tooltip.crystechmod.firestone_wall_shift"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.crystechmod.firestone_wall"));
        }
        super.addInformation(stack, blockReader, tooltip, flagIn);
    }
}
