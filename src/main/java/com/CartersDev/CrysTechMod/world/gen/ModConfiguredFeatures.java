package com.CartersDev.CrysTechMod.world.gen;

import com.CartersDev.CrysTechMod.block.ModBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLAGUED =
            register("plagued", Feature.TREE.withConfiguration((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.PLAGUED_LOG.get().getDefaultState()),
                            new SimpleBlockStateProvider(ModBlocks.PLAGUED_LEAVES.get().getDefaultState()),
                            new BlobFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0), 3),
//                            new StraightTrunkPlacer(6, 4, 3),
                            new FancyTrunkPlacer(8, 4, 3),
                            new TwoLayerFeature(2, 0, 1))).setIgnoreVines().build()));


    public static final ConfiguredFeature<?, ?> HYACINTH_CONFIG =  Feature.FLOWER.withConfiguration((
                    new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HYACINTH.get().getDefaultState()
                    ), SimpleBlockPlacer.PLACER)).tries(12).build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5);

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?>
            configuredFeature) {

        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }

}