package com.CartersDev.CrysTechMod.fluid;


import com.CartersDev.CrysTechMod.CrystalTech;
import com.CartersDev.CrysTechMod.block.ModBlocks;
import com.CartersDev.CrysTechMod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.ToIntFunction;

public class ModFluids {

    public static ToIntFunction<BlockState> liquid_tiberium = BlockState -> 10;
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    //for Tiberium
    public static final ResourceLocation RT_STILL_RL = new ResourceLocation(CrystalTech.MOD_ID, "block/liquid_tiberium_still");
    public static final ResourceLocation RT_FLOWING_RL = new ResourceLocation(CrystalTech.MOD_ID, "block/liquid_tiberium_flowing");
    public static final ResourceLocation VT_STILL_RL = new ResourceLocation(CrystalTech.MOD_ID, "block/vinifera_tiberium_still");
    public static final ResourceLocation VT_FLOWING_RL = new ResourceLocation(CrystalTech.MOD_ID,"block/vinifera_tiberium_flow");
    public static final ResourceLocation LAVA_OVERLAY_RL = new ResourceLocation("block/lava_overlay");
    //end of Tiberium

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CrystalTech.MOD_ID);

public static final RegistryObject<FlowingFluid> TIBERIUM_FLUID =
        FLUIDS.register("tiberium_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_TIBERIUM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> TIBERIUM_FLOWING =
            FLUIDS.register("tiberium_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_TIBERIUM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties LIQUID_TIBERIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> TIBERIUM_FLUID.get(), () -> TIBERIUM_FLOWING.get(), FluidAttributes.builder(RT_STILL_RL, RT_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.ITEM_BUCKET_EMPTY_LAVA).overlay(LAVA_OVERLAY_RL)
            ).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.LIQUID_TIBERIUM_BLOCK.get()).bucket(() -> ModItems.TIBERIUM_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> LIQUID_TIBERIUM_BLOCK = ModBlocks.BLOCKS.register("liquid_tiberium",
            () -> new FlowingFluidBlock(() -> ModFluids.TIBERIUM_FLUID.get(), AbstractBlock.Properties.create(Material.LAVA)
                    .doesNotBlockMovement().hardnessAndResistance(100f).noDrops().setLightLevel(liquid_tiberium)));


    public static final RegistryObject<FlowingFluid> BLUE_TIBERIUM_FLUID =
            FLUIDS.register("blue_tiberium_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_BLUE_TIBERIUM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BLUE_TIBERIUM_FLOWING =
            FLUIDS.register("blue_tiberium_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_BLUE_TIBERIUM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties LIQUID_BLUE_TIBERIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> BLUE_TIBERIUM_FLUID.get(), () -> BLUE_TIBERIUM_FLOWING.get(), FluidAttributes.builder(VT_STILL_RL, VT_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.ITEM_BUCKET_EMPTY_LAVA).overlay(LAVA_OVERLAY_RL)
            ).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.LIQUID_BLUE_TIBERIUM_BLOCK.get()).bucket(() -> ModItems.BLUE_TIBERIUM_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> LIQUID_BLUE_TIBERIUM_BLOCK = ModBlocks.BLOCKS.register("liquid_blue_tiberium",
            () -> new FlowingFluidBlock(() -> ModFluids.BLUE_TIBERIUM_FLUID.get(), AbstractBlock.Properties.create(Material.LAVA)
                    .doesNotBlockMovement().hardnessAndResistance(100f).noDrops().setLightLevel(liquid_tiberium)));


    public static final RegistryObject<FlowingFluid> TIBERIUM_WATER_FLUID =
            FLUIDS.register("tiberium_water_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.TIBERIUM_WATER_PROPERTIES));

    public static final RegistryObject<FlowingFluid> TIBERIUM_WATER_FLOWING =
            FLUIDS.register("tiberium_water_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.TIBERIUM_WATER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties TIBERIUM_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> TIBERIUM_WATER_FLUID.get(), () -> TIBERIUM_WATER_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.ITEM_BUCKET_EMPTY_LAVA).overlay(WATER_OVERLAY_RL)
            .color(0xb809848)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.TIBERIUM_WATER_BLOCK.get()).bucket(() -> ModItems.TIBERIUM_WATER_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> TIBERIUM_WATER_BLOCK = ModBlocks.BLOCKS.register("tiberium_water",
            () -> new FlowingFluidBlock(() -> ModFluids.TIBERIUM_WATER_FLUID.get(), AbstractBlock.Properties.create(Material.WATER)
                    .doesNotBlockMovement().hardnessAndResistance(100f).noDrops().setLightLevel(liquid_tiberium)));



public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }



}
