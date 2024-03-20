package com.CartersDev.CrysTechMod.block.custom;

import com.CartersDev.CrysTechMod.block.ModBlocks;
import com.CartersDev.CrysTechMod.fluid.ModFluids;
import com.CartersDev.CrysTechMod.util.CrysTechTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class BlossomTreeSpout extends RotatedPillarBlock {
    public BlossomTreeSpout(Properties properties) {
        super(properties);
    }


    @Override
    public void animateTick(BlockState state, World world, BlockPos pos, Random rand) {
        super.animateTick(state, world, pos, rand);

        double x = pos.getX();
        double y = pos.getY();
        double z = pos.getZ();
        float chance = 0.97f;

        if(chance < rand.nextFloat()) {
            world.playSound(x, y, z, SoundEvents.ENTITY_CREEPER_PRIMED, SoundCategory.BLOCKS, 1.0f, 1.0f, false);

            world.addParticle(ParticleTypes.COMPOSTER, pos.getX() + rand.nextDouble(),
                    pos.getY() + 1.5D, pos.getZ() + rand.nextDouble(),
                    0d, 0.05d, 0d);

            world.addParticle(ParticleTypes.LARGE_SMOKE, pos.getX() + rand.nextDouble(),
                    pos.getY() + 1.0D, pos.getZ() + rand.nextDouble(),
                    0d, 0.05d, 0d);
        }
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand){
        super.tick(state, worldIn, pos, rand);

        Random random = new Random();
        int x = random.nextInt(10) - random.nextInt(10);
        int y = random.nextInt(15) - random.nextInt(15);
        int z = random.nextInt(10) - random.nextInt(10);

//        BlockPos.get
        if(!worldIn.isRemote){
         BlockPos target = pos.add(x, y - 4, z);
         worldIn.getBlockState(target).getBlock();

//            System.out.println("Spread Statement reached!" + target);

         if (worldIn.getBlockState(target).getBlock().isIn(CrysTechTags.Blocks.TIBERIUM_VIABLE_BLOCKS)) {
//             System.out.println("Found a Block that can host Tiberium!");
             if(worldIn.getBlockState(target).getBlock() == ModBlocks.YELLOW_ZONE_CRACKED_DIRT.get()) {
                 System.out.println("Yellow Zone Cracked Dirt has been Seeded!");
                 worldIn.setBlockState(target, ModBlocks.SEEDED_YELLOW_ZONE_CRACKED_DIRT.get().getDefaultState());
             } else if (worldIn.getBlockState(target).getBlock() == ModBlocks.RED_ZONE_DIRT.get()) {
                 System.out.println("Red Zone Dirt has been Seeded!");
                 worldIn.setBlockState(target, ModBlocks.SEEDED_RED_ZONE_DIRT.get().getDefaultState());
             }else if (worldIn.getBlockState(target).getBlock() == Blocks.DIRT) {
                 System.out.println("Dirt has been Seeded!");
                 worldIn.setBlockState(target, ModBlocks.SEEDED_DIRT.get().getDefaultState());
             }else if (worldIn.getBlockState(target).getBlock() == Blocks.STONE) {
                 System.out.println("Stone has been Infested!");
                 worldIn.setBlockState(target, ModBlocks.INFESTED_STONE.get().getDefaultState());
             }else if (worldIn.getBlockState(target).getBlock() == Blocks.STONE_BRICKS) {
                 System.out.println("Stone Bricks have been Infested!");
                 worldIn.setBlockState(target, ModBlocks.INFESTED_STONE_BRICKS.get().getDefaultState());
             }else if (worldIn.getBlockState(target).getBlock() == Blocks.ANDESITE) {
                 System.out.println("Andesite has been Infested!");
                 worldIn.setBlockState(target, ModBlocks.INFESTED_ANDESITE.get().getDefaultState());
             }else if (worldIn.getBlockState(target).getBlock() == Blocks.GRANITE) {
                 System.out.println("Granite has been Infested!");
                 worldIn.setBlockState(target, ModBlocks.INFESTED_GRANITE.get().getDefaultState());
             }else if (worldIn.getBlockState(target).getBlock() == Blocks.DIORITE) {
                 System.out.println("Diorite has been Infested!");
                 worldIn.setBlockState(target, ModBlocks.INFESTED_DIORITE.get().getDefaultState());
             }else if (worldIn.getBlockState(target).getBlock() == Blocks.COBBLESTONE) {
                 System.out.println("Cobblestone has been Infested!");
                 worldIn.setBlockState(target, ModBlocks.INFESTED_COBBLE.get().getDefaultState());
             }
         } else if (worldIn.getBlockState(target).getBlock().isIn(CrysTechTags.Blocks.TIBERIUM_SEED_BLOCKS)) {
//             System.out.println("Seeded soil has been found!");
             int SoilChance = random.nextInt(10);
             if(SoilChance >= 9){
                 System.out.println("Ichor Soil has been created!");
                 worldIn.setBlockState(target, ModBlocks.ICHOR_SOIL.get().getDefaultState());
             }else {
                 System.out.println("Tiberium Soil has been created!");
                 worldIn.setBlockState(target, ModBlocks.TIBERIUM_SOIL.get().getDefaultState());
             }

         } else if (worldIn.getBlockState(target).getBlock() == Blocks.WATER) {
             System.out.println("Water has been infected with Tiberium!");
             worldIn.setBlockState(target, ModFluids.TIBERIUM_WATER_BLOCK.get().getDefaultState());
         }

        }

    }
}
