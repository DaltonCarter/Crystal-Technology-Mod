package com.CartersDev.CrysTechMod.item;


import com.CartersDev.CrysTechMod.CrystalTech;
import com.CartersDev.CrysTechMod.block.ModBlocks;
import com.CartersDev.CrysTechMod.fluid.ModFluids;
import com.CartersDev.CrysTechMod.item.custom.Firestone;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, CrystalTech.MOD_ID);

    //Minerals
    public static final RegistryObject<Item> TIBERIUM = ITEMS.register("tiberium",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> TIBERIUM_BLUE = ITEMS.register("tiberium_blue",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> TIBERIUM_RED = ITEMS.register("tiberium_red",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> TIBERIUM_PURPLE = ITEMS.register("tiberium_purple",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> AERIES_CRYSTAL = ITEMS.register("aeries_crystal",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> ILLUMINA_CRYSTAL = ITEMS.register("illumina_crystal",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> KRYON_CRYSTAL = ITEMS.register("kryon_crystal",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> ENIGMA_CRYSTAL = ITEMS.register("enigma_crystal",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> RAW_QUALRITE = ITEMS.register("raw_qualrite",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));
    //End Minerals


    //Metals
    public static final RegistryObject<Item> GUNDANIUM_INGOT = ITEMS.register("gundanium_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> ALYTHUM_INGOT = ITEMS.register("alythum_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> ILLYRIM_INGOT = ITEMS.register("illyrim_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> LG_CORE_INGOT = ITEMS.register("lg_core_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> MG_CORE_INGOT = ITEMS.register("mg_core_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> HG_CORE_INGOT = ITEMS.register("hg_core_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));
    //End Metals


    //Dust
    public static final RegistryObject<Item> GREEN_TIBERIUM_DUST = ITEMS.register("green_tiberium_dust",
            () -> new BlockItem(ModBlocks.GREEN_TIBERIUM_CROP.get(), new Item.Properties()
                    .food(new Food.Builder().fastToEat().effect(() -> new EffectInstance(Effects.POISON, 100, 0), 1f)
                            .build()).group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> BLUE_TIBERIUM_DUST = ITEMS.register("blue_tiberium_dust",
            () -> new BlockItem(ModBlocks.BLUE_TIBERIUM_CROP.get(), new Item.Properties()
                    .food(new Food.Builder().fastToEat().effect(() -> new EffectInstance(Effects.POISON, 100, 2), 1f)
                            .build()).group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> RED_TIBERIUM_DUST = ITEMS.register("red_tiberium_dust",
            () -> new BlockItem(ModBlocks.RED_TIBERIUM_CROP.get(), new Item.Properties()
                    .food(new Food.Builder().fastToEat().effect(() -> new EffectInstance(Effects.POISON, 100, 0), 1f)
                            .build()).group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> PURPLE_TIBERIUM_DUST = ITEMS.register("purple_tiberium_dust",
            () -> new BlockItem(ModBlocks.PURPLE_TIBERIUM_CROP.get(), new Item.Properties()
                    .food(new Food.Builder().fastToEat().effect(() -> new EffectInstance(Effects.POISON, 100, 2), 1f)
                            .build()).group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> QUALRIM_COMPOUND = ITEMS.register("qualrim_compound",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> GUNDANIUM_DUST = ITEMS.register("gundanium_dust",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> ALYTHUM_DUST = ITEMS.register("alythum_dust",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> ILLYRIM_BLEND = ITEMS.register("illyrim_blend",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> LG_CORE_BLEND = ITEMS.register("lg_core_blend",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> MG_CORE_BLEND = ITEMS.register("mg_core_blend",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> HG_CORE_BLEND = ITEMS.register("hg_core_blend",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));
    //End Dust


    //Buckets
    public static final RegistryObject<Item> TIBERIUM_BUCKET = ITEMS.register("tiberium_bucket",
            () -> new BucketItem(() -> ModFluids.TIBERIUM_FLUID.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> BLUE_TIBERIUM_BUCKET = ITEMS.register("blue_tiberium_bucket",
            () -> new BucketItem(() -> ModFluids.BLUE_TIBERIUM_FLUID.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> RED_TIBERIUM_BUCKET = ITEMS.register("red_tiberium_bucket",
            () -> new BucketItem(() -> ModFluids.RED_TIBERIUM_FLUID.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> PURPLE_TIBERIUM_BUCKET = ITEMS.register("purple_tiberium_bucket",
            () -> new BucketItem(() -> ModFluids.PURPLE_TIBERIUM_FLUID.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> TIBERIUM_WATER_BUCKET = ITEMS.register("tiberium_water_bucket",
            () -> new BucketItem(() -> ModFluids.TIBERIUM_WATER_FLUID.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.CRYS_TECH)));
    //End Buckets


    //Tools
    public static final RegistryObject<Item> PLAGUED_SWORD = ITEMS.register("plagued_sword",
            () -> new SwordItem(ModitemTier.PLAGUED, 2, 3f,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> PLAGUED_AXE = ITEMS.register("plagued_axe",
            () -> new AxeItem(ModitemTier.PLAGUED, 4, -6f,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> PLAGUED_PICKAXE = ITEMS.register("plagued_pickaxe",
            () -> new PickaxeItem(ModitemTier.PLAGUED, 0, -1f,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> PLAGUED_SHOVEL = ITEMS.register("plagued_shovel",
            () -> new ShovelItem(ModitemTier.PLAGUED, 0, -1f,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> PLAGUED_HOE = ITEMS.register("plagued_hoe",
            () -> new HoeItem(ModitemTier.PLAGUED, 0, 0f,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));
    //End Tools


    //Armors

    public static final RegistryObject<Item> GUNDANIUM_HELMET = ITEMS.register("gundanium_helmet",
            () -> new ArmorItem(ModArmorMaterial.GUNDANIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> GUNDANIUM_CHESTPLATE = ITEMS.register("gundanium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.GUNDANIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> GUNDANIUM_LEGGINGS = ITEMS.register("gundanium_leggings",
            () -> new ArmorItem(ModArmorMaterial.GUNDANIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> GUNDANIUM_BOOTS = ITEMS.register("gundanium_boots",
            () -> new ArmorItem(ModArmorMaterial.GUNDANIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));

    public static final RegistryObject<Item> GUNDANIUM_HORSE_ARMOR = ITEMS.register("gundanium_horse_armor",
            () -> new HorseArmorItem(9, "gundanium",
                    new Item.Properties().group(ModItemGroup.CRYS_TECH)));
    //End Armors


    //Signs
    public static final RegistryObject<Item> CORE_STEEL_SIGN = ITEMS.register("core_steel_sign",
            () -> new SignItem(new Item.Properties().maxStackSize(16).group(ModItemGroup.CRYS_TECH),
                    ModBlocks.CORE_STEEL_SIGN.get(), ModBlocks.CORE_STEEL_WALL_SIGN.get()));
    //End Signs


    //Food
    public static final RegistryObject<Item> TIBERIUM_FRUIT = ITEMS.register("tiberium_fruit",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(4).saturation(0.1f)
                    .fastToEat().effect(() -> new EffectInstance(Effects.WEAKNESS, 100, 2), 1f)
                    .build()).group(ModItemGroup.CRYS_TECH)));
    //End Food


    //Misc
    public static final RegistryObject<Item> FIRESTONE = ITEMS.register("firestone",
            () -> new Firestone(new Item.Properties().setNoRepair().group(ModItemGroup.CRYS_TECH).maxDamage(8)));

    public static final RegistryObject<Item> PLAGUED_STICK = ITEMS.register("plagued_stick",
            () -> new Item(new Item.Properties().group(ModItemGroup.CRYS_TECH)));
    //end Misc


    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
