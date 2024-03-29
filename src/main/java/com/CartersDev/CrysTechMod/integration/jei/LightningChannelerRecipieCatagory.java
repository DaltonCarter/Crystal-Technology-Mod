package com.CartersDev.CrysTechMod.integration.jei;


import com.CartersDev.CrysTechMod.CrystalTech;
import com.CartersDev.CrysTechMod.block.ModBlocks;
import com.CartersDev.CrysTechMod.data.recipes.LightningChannelerRecipe;
import com.mojang.blaze3d.matrix.MatrixStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class LightningChannelerRecipieCatagory implements IRecipeCategory<LightningChannelerRecipe> {

    public final static ResourceLocation UID = new ResourceLocation(CrystalTech.MOD_ID, "lightning");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(CrystalTech.MOD_ID, "textures/gui/lightning_channeler_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawable lightningBolt;

    public LightningChannelerRecipieCatagory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(new ItemStack(ModBlocks.LIGHTNING_CHANNELER.get()));
        this.lightningBolt = helper.createDrawable(TEXTURE, 176, 0, 13, 17);
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends LightningChannelerRecipe> getRecipeClass() {
        return LightningChannelerRecipe.class;
    }

    @Override
    public String getTitle() {
        return ModBlocks.LIGHTNING_CHANNELER.get().getTranslatedName().getString();
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setIngredients(LightningChannelerRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, LightningChannelerRecipe recipe, IIngredients ingredients) {
        recipeLayout.getItemStacks().init(0, true, 79, 30);
        recipeLayout.getItemStacks().init(1, true, 79, 52);

        recipeLayout.getItemStacks().init(2, false, 102, 42);
        recipeLayout.getItemStacks().set(ingredients);
    }

    @Override
    public void draw(LightningChannelerRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) {
        if(recipe.getWeather() == LightningChannelerRecipe.Weather.THUNDERING) {
            this.lightningBolt.draw(matrixStack, 82, 9);
        }
    }
}
