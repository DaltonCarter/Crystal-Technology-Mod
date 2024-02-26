package com.CartersDev.CrysTechMod.block.custom;

import com.CartersDev.CrysTechMod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class IchorSoil extends Block {
    public IchorSoil(Properties properties) { super(properties);}

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand){
        super.tick(state, worldIn, pos, rand);

        if (!worldIn.isRemote()) {
            BlockPos abovePos = pos.up();
            BlockState aboveState = worldIn.getBlockState(abovePos);
            Block aboveBlock = aboveState.getBlock();


            if (aboveBlock == Blocks.AIR) {
                Random random = new Random();
                int number = random.nextInt(20);

                if(number >10 && number < 15 ){
                    System.out.println("A patch of Vinifera Tiberium has sprouted!.");
                    worldIn.setBlockState(abovePos, ModBlocks.BLUE_TIBERIUM_CROP.get().getDefaultState());
                }else if (number > 14 && number < 18) {
                    System.out.println("A patch of Cruentus Tiberium has sprouted!.");
                    worldIn.setBlockState(abovePos, ModBlocks.RED_TIBERIUM_CROP.get().getDefaultState());
                }else if (number > 17 && number <= 20) {
                    System.out.println("A patch of Aboreus Tiberium has sprouted!.");
                    worldIn.setBlockState(abovePos, ModBlocks.PURPLE_TIBERIUM_CROP.get().getDefaultState());
                }else {
                    System.out.println("A patch of Riparius Tiberium has sprouted!.");
                    worldIn.setBlockState(abovePos, ModBlocks.GREEN_TIBERIUM_CROP.get().getDefaultState());
                }
                //Chance to grow Blue Strain, Red Strain, and Purple Strain


            }

        }
    }


    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction dir, IPlantable plantable) {
        return true;
    }
}
