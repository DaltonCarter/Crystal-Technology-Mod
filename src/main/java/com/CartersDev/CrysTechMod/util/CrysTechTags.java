package com.CartersDev.CrysTechMod.util;

import com.CartersDev.CrysTechMod.CrystalTech;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class CrysTechTags {

    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> FIRESTONE_CLICKABLE_BLOCKS =
                createTag("firestone_clickable_blocks");

        public static final Tags.IOptionalNamedTag<Block> TIBERIUM_PROOF_BLOCKS =
                createTag("tiberium_proof_blocks");

        public static final Tags.IOptionalNamedTag<Block> TIBERIUM_SEED_BLOCKS =
                createTag("tiberium_seed_blocks");

        public static final Tags.IOptionalNamedTag<Block> TIBERIUM_VIABLE_BLOCKS =
                createTag("tiberium_viable_blocks");

        public static final Tags.IOptionalNamedTag<Block> TIBERIUM_VULNERABLE_WOOD =
                createTag("tiberium_vulnerable_wood");

        public static final Tags.IOptionalNamedTag<Block> TIBERIUM_VULNERABLE_LEAVES =
                createTag("tiberium_vulnerable_leaves");

        public static final Tags.IOptionalNamedTag<Block> TIBERIUM_VULNERABLE_FLOWERS =
                createTag("tiberium_vulnerable_flowers");

        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(CrystalTech.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }

    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> AMETHYST = createForgeTag("gems/amethyst");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(CrystalTech.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

    }

}
