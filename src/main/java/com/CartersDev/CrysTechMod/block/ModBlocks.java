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

    public static ToIntFunction<BlockState> tiberiumglow = BlockState -> 10;

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CrystalTech.MOD_ID);
    
    public static final RegistryObject<Block> FIRESTONE_BLOCK = registerBlock("firestone_block",
            () -> new FirestoneBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> YOKARITE_ORE = registerBlock("yokarite_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TIBERIUM_ORE = registerBlock("tiberium_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
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

    public static final RegistryObject<Block> FLOWER_OF_LIFE = registerBlock("flower_of_life",
            () -> new FlowerBlock(Effects.REGENERATION, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> GREEN_TIBERIUM_CROP = BLOCKS.register("green_tiberium_crop",
            () -> new GreenTiberiumCrystalBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).doesNotBlockMovement().harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f).setLightLevel(tiberiumglow)));

    public static final RegistryObject<Block> TIBERIUM_SOIL = registerBlock("tiberium_soil",
            () -> new TiberiumSoil(AbstractBlock.Properties.create(Material.EARTH)
                    .harvestLevel(3).harvestTool(ToolType.SHOVEL).tickRandomly()
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BLUE_TIBERIUM_CROP = BLOCKS.register("blue_tiberium_crop",
            () -> new BlueTiberiumCrystalBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).doesNotBlockMovement().harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f).setLightLevel(tiberiumglow)));
    
    public static final RegistryObject<Block> HYACINTH = registerBlock("hyacinth",
            () -> new FlowerBlock(Effects.HASTE, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> LIGHTNING_CHANNELER = registerBlock("lightning_channeler",
            () -> new LightningChannelerBlock(AbstractBlock.Properties.create(Material.IRON)));
    
    
    //Reference Entries
//    public static final RegistryObject<Block> AMETHYST_STAIRS = registerBlock("amethyst_stairs",
//            () -> new StairsBlock(() -> AMETHYST_BLOCK.get().getDefaultState(),
//                    AbstractBlock.Properties.create(Material.IRON).harvestLevel(3)
//                            .harvestTool(ToolType.PICKAXE).setRequiresTool()));
//
//    public static final RegistryObject<Block> AMETHYST_FENCE = registerBlock("amethyst_fence",
//            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
//                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
//                    .setRequiresTool().hardnessAndResistance(5f)));
//
//    public static final RegistryObject<Block> AMETHYST_FENCE_GATE = registerBlock("amethyst_fence_gate",
//            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
//                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
//                    .setRequiresTool().hardnessAndResistance(5f)));
//
//    public static final RegistryObject<Block> AMETHYST_SLAB = registerBlock("amethyst_slab",
//            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
//                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
//                    .setRequiresTool().hardnessAndResistance(5f)));
//
//    public static final RegistryObject<Block> AMETHYST_BUTTON = registerBlock("amethyst_button",
//            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON)
//                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
//                    .setRequiresTool().hardnessAndResistance(5f)
//                    .doesNotBlockMovement()));
//
//    public static final RegistryObject<Block> AMETHYST_PRESSURE_PLATE = registerBlock("amethyst_pressure_plate",
//            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties
//                    .create(Material.IRON).harvestLevel(2).harvestTool(ToolType.PICKAXE)
//                    .setRequiresTool().hardnessAndResistance(5f)));
//
//    public static final RegistryObject<Block> AMETHYST_DOOR = registerBlock("amethyst_door",
//            () -> new DoorBlock( AbstractBlock.Properties.create(Material.IRON).harvestLevel(2)
//                    .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)
//                    .notSolid()));
//
//    public static final RegistryObject<Block> AMETHYST_TRAPDOOR = registerBlock("amethyst_trapdoor",
//            () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.IRON).harvestLevel(2)
//                    .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)
//                    .notSolid()));
//    public static final RegistryObject<Block> REDWOOD_SIGN = BLOCKS.register("redwood_sign",
//            () -> new ModStandingSignBlock(AbstractBlock.Properties.create(Material.IRON), ModWoodTypes.REDWOOD));
//
//    public static final RegistryObject<Block> REDWOOD_WALL_SIGN = BLOCKS.register("redwood_wall_sign",
//            () -> new ModWallSignBlock(AbstractBlock.Properties.create(Material.IRON), ModWoodTypes.REDWOOD));
    
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