package com.CartersDev.CrysTechMod.block.custom;

import com.CartersDev.CrysTechMod.block.ModBlocks;
import com.CartersDev.CrysTechMod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Objects;

public class BlueTiberiumCrystalBlock extends CropsBlock {

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{

            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public BlueTiberiumCrystalBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState());

    }


    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.BLUE_TIBERIUM_DUST.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
    }

    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entity) {
        if(!worldIn.isRemote && worldIn.getDifficulty() != Difficulty.PEACEFUL) {
            if(entity instanceof LivingEntity) {
                LivingEntity target = (LivingEntity) entity;
                boolean entityIsPoisoned = !Objects.equals(target.getActivePotionEffect(Effects.POISON), null);
                if(!entityIsPoisoned) {
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 160, 1));
                }

            }
        }
    }

//    @Override
//    public void onPlayerDestroy(IWorld world, BlockPos pos, BlockState state) {
//
//
//
//        super.onPlayerDestroy(world, pos, state);
//    }
}
