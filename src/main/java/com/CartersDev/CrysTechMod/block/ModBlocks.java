package com.CartersDev.CrysTechMod.block;

import com.CartersDev.CrysTechMod.CrystalTech;
import com.CartersDev.CrysTechMod.block.custom.*;
import com.CartersDev.CrysTechMod.item.ModItemGroup;
import com.CartersDev.CrysTechMod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {

    public static ToIntFunction<BlockState> tiberiumglow = BlockState -> 7;

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CrystalTech.MOD_ID);

    //Ordinary Blocks:

    public static final RegistryObject<Block> TIBERIUM_SOIL = registerBlock("tiberium_soil",
            () -> new TiberiumSoil(AbstractBlock.Properties.create(Material.EARTH)
                    .harvestLevel(3).harvestTool(ToolType.SHOVEL).tickRandomly()
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> FIRESTONE_BLOCK = registerBlock("firestone_block",
            () -> new FirestoneBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AERIES_BLOCK = registerBlock("aeries_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ILLUMINA_BLOCK = registerBlock("illumina_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ENIGMA_BLOCK = registerBlock("enigma_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> KRYON_BLOCK = registerBlock("kryon_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GUNDANIUM_BLOCK = registerBlock("gundanium_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ALYTHUM_BLOCK = registerBlock("alythum_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ILLYRIM_BLOCK = registerBlock("illyrim_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LG_CORE_BLOCK = registerBlock("lg_core_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> MG_CORE_BLOCK = registerBlock("mg_core_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> HG_CORE_BLOCK = registerBlock("hg_core_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TIBERIUM_BLOCK = registerBlock("tiberium_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TIBERIUM_BLUE_BLOCK = registerBlock("tiberium_blue_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));
    //End Ordinary Blocks

    //Wood:

    public static final RegistryObject<Block> PLAGUED_LOG = registerBlock("plagued_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)) {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> PLAGUED_WOOD = registerBlock("plagued_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)) {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> STRIPPED_PLAGUED_LOG = registerBlock("stripped_plagued_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)) {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> STRIPPED_PLAGUED_WOOD = registerBlock("stripped_plagued_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)) {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });


    public static final RegistryObject<Block> PLAGUED_PLANKS = registerBlock("plagued_planks",
            () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)) {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> PLAGUED_LEAVES = registerBlock("plagued_leaves",
            () -> new PlaguedLeaves((AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f).tickRandomly().sound(SoundType.PLANT)
                    .notSolid().setLightLevel(tiberiumglow)))
            {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });
    //End Wood

    //Deco Blocks:

    public static final RegistryObject<Block> PLAGUED_STAIRS = registerBlock("plagued_stairs",
            () -> new StairsBlock(() -> PLAGUED_PLANKS.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.WOOD).harvestLevel(3)
                            .harvestTool(ToolType.AXE).setRequiresTool()));

    public static final RegistryObject<Block> PLAGUED_FENCE = registerBlock("plagued_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).harvestTool(ToolType.AXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PLAGUED_FENCE_GATE = registerBlock("plagued_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).harvestTool(ToolType.AXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PLAGUED_SLAB = registerBlock("plagued_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).harvestTool(ToolType.AXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PLAGUED_BUTTON = registerBlock("plagued_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).harvestTool(ToolType.AXE)
                    .setRequiresTool().hardnessAndResistance(5f)
                    .doesNotBlockMovement()));

    public static final RegistryObject<Block> PLAGUED_PRESSURE_PLATE = registerBlock("plagued_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties
                    .create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PLAGUED_DOOR = registerBlock("plagued_door",
            () -> new DoorBlock( AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2)
                    .harvestTool(ToolType.AXE).setRequiresTool().hardnessAndResistance(5f)
                    .notSolid()));

    public static final RegistryObject<Block> PLAGUED_TRAPDOOR = registerBlock("plagued_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2)
                    .harvestTool(ToolType.AXE).setRequiresTool().hardnessAndResistance(5f)
                    .notSolid()));

    public static final RegistryObject<Block> LIGHT_GRAY_TIBERCRETE = registerBlock("light_gray_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.LIGHT_GRAY)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> YELLOW_TIBERCRETE = registerBlock("yellow_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.YELLOW)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GRAY_TIBERCRETE = registerBlock("gray_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.GRAY)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLUE_TIBERCRETE = registerBlock("blue_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.BLUE)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLACK_TIBERCRETE = registerBlock("black_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.BLACK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BROWN_TIBERCRETE = registerBlock("brown_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.BROWN)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> CYAN_TIBERCRETE = registerBlock("cyan_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.CYAN)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GREEN_TIBERCRETE = registerBlock("green_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.GREEN)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIGHT_BLUE_TIBERCRETE = registerBlock("light_blue_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.BLUE)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIME_TIBERCRETE = registerBlock("lime_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.LIME)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> MAGENTA_TIBERCRETE = registerBlock("magenta_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.MAGENTA)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ORANGE_TIBERCRETE = registerBlock("orange_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.ORANGE)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PINK_TIBERCRETE = registerBlock("pink_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.PINK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PURPLE_TIBERCRETE = registerBlock("purple_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.PURPLE)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RED_TIBERCRETE = registerBlock("red_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.RED)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> WHITE_TIBERCRETE = registerBlock("white_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, DyeColor.WHITE)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLACK_TIBERCRETE_POWDER = registerBlock("black_tibercrete_powder",
            () -> new ConcretePowderBlock(BLACK_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.BLACK)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLUE_TIBERCRETE_POWDER = registerBlock("blue_tibercrete_powder",
            () -> new ConcretePowderBlock(BLUE_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.BLUE)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BROWN_TIBERCRETE_POWDER = registerBlock("brown_tibercrete_powder",
            () -> new ConcretePowderBlock(BROWN_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.BROWN)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> CYAN_TIBERCRETE_POWDER = registerBlock("cyan_tibercrete_powder",
            () -> new ConcretePowderBlock(CYAN_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.CYAN)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GRAY_TIBERCRETE_POWDER = registerBlock("gray_tibercrete_powder",
            () -> new ConcretePowderBlock(GRAY_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.GRAY)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GREEN_TIBERCRETE_POWDER = registerBlock("green_tibercrete_powder",
            () -> new ConcretePowderBlock(GREEN_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.GREEN)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIGHT_BLUE_TIBERCRETE_POWDER = registerBlock("light_blue_tibercrete_powder",
            () -> new ConcretePowderBlock(LIGHT_BLUE_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.LIGHT_BLUE)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIGHT_GRAY_TIBERCRETE_POWDER = registerBlock("light_gray_tibercrete_powder",
            () -> new ConcretePowderBlock(LIGHT_GRAY_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.LIGHT_GRAY)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIME_TIBERCRETE_POWDER = registerBlock("lime_tibercrete_powder",
            () -> new ConcretePowderBlock(LIME_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.LIME)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> MAGENTA_TIBERCRETE_POWDER = registerBlock("magenta_tibercrete_powder",
            () -> new ConcretePowderBlock(MAGENTA_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.MAGENTA)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ORANGE_TIBERCRETE_POWDER = registerBlock("orange_tibercrete_powder",
            () -> new ConcretePowderBlock(ORANGE_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.ORANGE)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PINK_TIBERCRETE_POWDER = registerBlock("pink_tibercrete_powder",
            () -> new ConcretePowderBlock(PINK_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.PINK)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PURPLE_TIBERCRETE_POWDER = registerBlock("purple_tibercrete_powder",
            () -> new ConcretePowderBlock(PURPLE_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.PURPLE)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RED_TIBERCRETE_POWDER = registerBlock("red_tibercrete_powder",
            () ->new ConcretePowderBlock(RED_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.RED)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> WHITE_TIBERCRETE_POWDER = registerBlock("white_tibercrete_powder",
            () -> new ConcretePowderBlock(WHITE_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.WHITE)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> YELLOW_TIBERCRETE_POWDER = registerBlock("yellow_tibercrete_powder",
            () -> new ConcretePowderBlock(YELLOW_TIBERCRETE.get(), AbstractBlock.Properties.create(Material.SAND, DyeColor.YELLOW)
                    .sound(SoundType.SAND).harvestLevel(2).harvestTool(ToolType.SHOVEL)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLACK_TIBERCRETE_STAIRS = registerBlock("black_tibercrete_stairs",
            () -> new StairsBlock(() -> BLACK_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLUE_TIBERCRETE_STAIRS = registerBlock("blue_tibercrete_stairs",
            () -> new StairsBlock(() -> BLUE_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool()));

    public static final RegistryObject<Block> BROWN_TIBERCRETE_STAIRS = registerBlock("brown_tibercrete_stairs",
            () -> new StairsBlock(() -> BROWN_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> CYAN_TIBERCRETE_STAIRS = registerBlock("cyan_tibercrete_stairs",
            () -> new StairsBlock(() -> CYAN_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GRAY_TIBERCRETE_STAIRS = registerBlock("gray_tibercrete_stairs",
            () -> new StairsBlock(() -> GRAY_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GREEN_TIBERCRETE_STAIRS = registerBlock("green_tibercrete_stairs",
            () -> new StairsBlock(() -> GREEN_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIGHT_BLUE_TIBERCRETE_STAIRS = registerBlock("light_blue_tibercrete_stairs",
            () -> new StairsBlock(() -> LIGHT_BLUE_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIGHT_GRAY_TIBERCRETE_STAIRS = registerBlock("light_gray_tibercrete_stairs",
            () -> new StairsBlock(() -> LIGHT_GRAY_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool()));

    public static final RegistryObject<Block> LIME_TIBERCRETE_STAIRS = registerBlock("lime_tibercrete_stairs",
            () -> new StairsBlock(() -> LIME_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> MAGENTA_TIBERCRETE_STAIRS = registerBlock("magenta_tibercrete_stairs",
            () -> new StairsBlock(() -> MAGENTA_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ORANGE_TIBERCRETE_STAIRS = registerBlock("orange_tibercrete_stairs",
            () -> new StairsBlock(() -> ORANGE_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PINK_TIBERCRETE_STAIRS = registerBlock("pink_tibercrete_stairs",
            () -> new StairsBlock(() -> PINK_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PURPLE_TIBERCRETE_STAIRS = registerBlock("purple_tibercrete_stairs",
            () -> new StairsBlock(() -> PURPLE_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RED_TIBERCRETE_STAIRS = registerBlock("red_tibercrete_stairs",
            () -> new StairsBlock(() -> RED_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> WHITE_TIBERCRETE_STAIRS = registerBlock("white_tibercrete_stairs",
            () -> new StairsBlock(() -> WHITE_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> YELLOW_TIBERCRETE_STAIRS = registerBlock("yellow_tibercrete_stairs",
            () -> new StairsBlock(() -> YELLOW_TIBERCRETE.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    //end Deco Blocks

    //Ores:
    public static final RegistryObject<Block> AERIES_ORE = registerBlock("aeries_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ILLUMINA_ORE = registerBlock("illumina_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> KRYON_ORE = registerBlock("kryon_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ENIGMA_ORE = registerBlock("enigma_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GUNDANIUM_ORE = registerBlock("gundanium_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ALYTHUM_ORE = registerBlock("alythum_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> QUALRITE_ORE = registerBlock("qualrite_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));
    //End Ores


    //Flowers:
    public static final RegistryObject<Block> FLOWER_OF_LIFE = registerBlock("flower_of_life",
            () -> new FlowerBlock(Effects.REGENERATION, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HYACINTH = registerBlock("hyacinth",
            () -> new FlowerBlock(Effects.HASTE, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));
    //End Flowers


    //Crops:

    public static final RegistryObject<Block> GREEN_TIBERIUM_CROP = BLOCKS.register("green_tiberium_crop",
            () -> new GreenTiberiumCrystalBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).doesNotBlockMovement().harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f).setLightLevel(tiberiumglow)));

    public static final RegistryObject<Block> BLUE_TIBERIUM_CROP = BLOCKS.register("blue_tiberium_crop",
            () -> new BlueTiberiumCrystalBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).doesNotBlockMovement().harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f).setLightLevel(tiberiumglow)));
    //End Crops


    //Tile Entities and Machines:
    
    public static final RegistryObject<Block> LIGHTNING_CHANNELER = registerBlock("lightning_channeler",
            () -> new LightningChannelerBlock(AbstractBlock.Properties.create(Material.IRON)));
    //End Tile Entities and Machines




    //Reference Entries

//    public static final RegistryObject<Block> PLAGUED_SIGN = BLOCKS.register("PLAGUED_sign",
//            () -> new ModStandingSignBlock(AbstractBlock.Properties.create(Material.IRON), ModWoodTypes.PLAGUED));
//
//    public static final RegistryObject<Block> PLAGUED_WALL_SIGN = BLOCKS.register("PLAGUED_wall_sign",
//            () -> new ModWallSignBlock(AbstractBlock.Properties.create(Material.IRON), ModWoodTypes.PLAGUED));
    
    //end Reference Entries
    
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.CRYS_TECH)));
    }

    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
    }

}