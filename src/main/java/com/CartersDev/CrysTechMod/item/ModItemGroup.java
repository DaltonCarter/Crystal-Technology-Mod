package com.CartersDev.CrysTechMod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CRYS_TECH = new ItemGroup("CrysTechTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TIBERIUM.get());
        }
    };

}
