package com.CartersDev.CrysTechMod.block;

import com.CartersDev.CrysTechMod.CrystalTech;
import com.CartersDev.CrysTechMod.block.custom.*;
import com.CartersDev.CrysTechMod.item.ModItemGroup;
import com.CartersDev.CrysTechMod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
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

    public static final RegistryObject<Block> YOKARITE_BLOCK = registerBlock("yokarite_block",
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
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> YELLOW_TIBERCRETE = registerBlock("yellow_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GRAY_TIBERCRETE = registerBlock("gray_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLUE_TIBERCRETE = registerBlock("blue_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLACK_TIBERCRETE = registerBlock("black_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BROWN_TIBERCRETE = registerBlock("brown_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> CYAN_TIBERCRETE = registerBlock("cyan_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GREEN_TIBERCRETE = registerBlock("green_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIGHT_BLUE_TIBERCRETE = registerBlock("light_blue_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> LIME_TIBERCRETE = registerBlock("lime_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> MAGENTA_TIBERCRETE = registerBlock("magenta_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ORANGE_TIBERCRETE = registerBlock("orange_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PINK_TIBERCRETE = registerBlock("pink_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PURPLE_TIBERCRETE = registerBlock("purple_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RED_TIBERCRETE = registerBlock("red_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> WHITE_TIBERCRETE = registerBlock("white_tibercrete",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    //end Deco Blocks

    //Ores:
    public static final RegistryObject<Block> YOKARITE_ORE = registerBlock("yokarite_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TIBERIUM_ORE = registerBlock("tiberium_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
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