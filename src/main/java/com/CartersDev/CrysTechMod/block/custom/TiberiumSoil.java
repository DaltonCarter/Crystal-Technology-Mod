package com.CartersDev.CrysTechMod.block.custom;

import com.CartersDev.CrysTechMod.block.ModBlocks;
import com.CartersDev.CrysTechMod.util.CrysTechTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class TiberiumSoil extends Block {
    public TiberiumSoil(Properties properties) { super(properties);}

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand){
        super.tick(state, worldIn, pos, rand);

        if (!worldIn.isRemote()) {
            BlockPos abovePos = pos.up();
            BlockState aboveState = worldIn.getBlockState(abovePos);
            Block aboveBlock = aboveState.getBlock();


            if (aboveBlock == Blocks.AIR) {
                Random random = new Random();
                int number = random.nextInt(10);

                if(number > 7){
                    System.out.println("A patch of Vinifera Tiberium has sprouted!.");
                    worldIn.setBlockState(abovePos, ModBlocks.BLUE_TIBERIUM_CROP.get().getDefaultState());
                }else {
                    System.out.println("A patch of Riparius Tiberium has sprouted!.");
                    worldIn.setBlockState(abovePos, ModBlocks.GREEN_TIBERIUM_CROP.get().getDefaultState());
                }

            }

            //Soil Spread logic

        }
    }



    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction dir, IPlantable plantable) {
        return true;
    }
}
