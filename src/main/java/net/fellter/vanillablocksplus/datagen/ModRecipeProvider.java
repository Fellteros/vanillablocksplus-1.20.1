package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.util.ModRecipes;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;


import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        //oak
        ModRecipes.createStairsRecipe(ModBlocks.OAK_WOOD_STAIRS, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_SLAB, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.OAK_WOOD_DOOR, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.OAK_WOOD_FENCE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.OAK_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.OAK_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.OAK_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_BUTTON, Blocks.OAK_WOOD, 8)
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);

        //str oak
        ModRecipes.createStairsRecipe(ModBlocks.STR_OAK_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_OAK_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_OAK_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_OAK_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_OAK_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_BUTTON, Blocks.STRIPPED_OAK_WOOD, 8)
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);

        //spruce
        ModRecipes.createStairsRecipe(ModBlocks.SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_SLAB, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.SPRUCE_WOOD_DOOR, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.SPRUCE_WOOD_FENCE, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.SPRUCE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SPRUCE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_BUTTON, Blocks.SPRUCE_WOOD, 8)
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);

        //str spruce
        ModRecipes.createStairsRecipe(ModBlocks.STR_SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_SPRUCE_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_BUTTON, Blocks.STRIPPED_SPRUCE_WOOD, 8)
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);

        //birch
        ModRecipes.createStairsRecipe(ModBlocks.BIRCH_WOOD_STAIRS, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_SLAB, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.BIRCH_WOOD_DOOR, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.BIRCH_WOOD_FENCE, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.BIRCH_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BIRCH_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_BUTTON, Blocks.BIRCH_WOOD, 8)
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);

        //str birch
        ModRecipes.createStairsRecipe(ModBlocks.STR_BIRCH_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_BIRCH_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_BUTTON, Blocks.STRIPPED_BIRCH_WOOD, 8)
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);

        //jungle
        ModRecipes.createStairsRecipe(ModBlocks.JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_SLAB, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.JUNGLE_WOOD_DOOR, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.JUNGLE_WOOD_FENCE, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.JUNGLE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.JUNGLE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_BUTTON, Blocks.JUNGLE_WOOD, 8)
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);

        //str jungle
        ModRecipes.createStairsRecipe(ModBlocks.STR_JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_JUNGLE_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_BUTTON, Blocks.STRIPPED_JUNGLE_WOOD, 8)
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);

        //acacia
        ModRecipes.createStairsRecipe(ModBlocks.ACACIA_WOOD_STAIRS, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_SLAB, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.ACACIA_WOOD_DOOR, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.ACACIA_WOOD_FENCE, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.ACACIA_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ACACIA_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_BUTTON, Blocks.ACACIA_WOOD, 8)
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);

        //str acacia
        ModRecipes.createStairsRecipe(ModBlocks.STR_ACACIA_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_ACACIA_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_BUTTON, Blocks.STRIPPED_ACACIA_WOOD, 8)
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);

        //dark oak
        ModRecipes.createStairsRecipe(ModBlocks.DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_SLAB, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.DARK_OAK_WOOD_DOOR, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.DARK_OAK_WOOD_FENCE, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DARK_OAK_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_BUTTON, Blocks.DARK_OAK_WOOD, 8)
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);

        //str dark oak
        ModRecipes.createStairsRecipe(ModBlocks.STR_DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_BUTTON, Blocks.STRIPPED_DARK_OAK_WOOD, 8)
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);

        //mangrove
        ModRecipes.createStairsRecipe(ModBlocks.MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_SLAB, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.MANGROVE_WOOD_DOOR, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.MANGROVE_WOOD_FENCE, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.MANGROVE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MANGROVE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_BUTTON, Blocks.MANGROVE_WOOD, 8)
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);

        //str mangrove
        ModRecipes.createStairsRecipe(ModBlocks.STR_MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_MANGROVE_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_BUTTON, Blocks.STRIPPED_MANGROVE_WOOD, 8)
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);

        //cherry
        ModRecipes.createStairsRecipe(ModBlocks.CHERRY_WOOD_STAIRS, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_SLAB, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.CHERRY_WOOD_DOOR, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.CHERRY_WOOD_FENCE, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.CHERRY_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CHERRY_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_BUTTON, Blocks.CHERRY_WOOD, 8)
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);

        //str cherry
        ModRecipes.createStairsRecipe(ModBlocks.STR_CHERRY_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_CHERRY_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_BUTTON, Blocks.STRIPPED_CHERRY_WOOD, 8)
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);

        //bamboo
        ModRecipes.createStairsRecipe(ModBlocks.BAMBOO_BLOCK_STAIRS, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_SLAB, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.BAMBOO_BLOCK_DOOR, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.BAMBOO_BLOCK_FENCE, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.BAMBOO_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BAMBOO_BLOCK_TRAPDOOR, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_BUTTON, Blocks.BAMBOO_BLOCK, 8)
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);

        //bamboo
        ModRecipes.createStairsRecipe(ModBlocks.STR_BAMBOO_BLOCK_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_SLAB, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_DOOR, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_BUTTON, Blocks.STRIPPED_BAMBOO_BLOCK, 8)
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);

        //crimson hyphae
        ModRecipes.createStairsRecipe(ModBlocks.CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_SLAB, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.CRIMSON_HYPHAE_DOOR, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_BUTTON, Blocks.CRIMSON_HYPHAE, 8)
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);

        //str crimson hyphae
        ModRecipes.createStairsRecipe(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_SLAB, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_DOOR, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_BUTTON, Blocks.STRIPPED_CRIMSON_HYPHAE, 8)
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);

        //warped hyphae
        ModRecipes.createStairsRecipe(ModBlocks.WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_SLAB, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.WARPED_HYPHAE_DOOR, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.WARPED_HYPHAE_FENCE, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.WARPED_HYPHAE_FENCE_GATE, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WARPED_HYPHAE_TRAPDOOR, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_BUTTON, Blocks.WARPED_HYPHAE, 8)
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);

        //str warped hyphae
        ModRecipes.createStairsRecipe(ModBlocks.STR_WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_SLAB, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_WARPED_HYPHAE_DOOR, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.offer2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_BUTTON, Blocks.STRIPPED_WARPED_HYPHAE, 8)
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);

        //stone
        ModRecipes.createDoorRecipe(ModBlocks.STONE_DOOR, Ingredient.ofItems(Blocks.STONE))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.STONE_FENCE, Ingredient.ofItems(Blocks.STONE), Ingredient.ofItems(Blocks.STONE_SLAB), 3)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.STONE_FENCE_GATE, Ingredient.ofItems(Blocks.STONE), Ingredient.ofItems(Blocks.STONE_SLAB), 1)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STONE_TRAPDOOR, Ingredient.ofItems(Blocks.STONE_SLAB))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Ingredient.ofItems(Blocks.STONE))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);

        //cobblestone
        ModRecipes.createDoorRecipe(ModBlocks.COBBLESTONE_DOOR, Ingredient.ofItems(Blocks.COBBLESTONE))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.COBBLESTONE_FENCE, Ingredient.ofItems(Blocks.COBBLESTONE), Ingredient.ofItems(Blocks.COBBLESTONE_SLAB), 3)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.COBBLESTONE_FENCE_GATE, Ingredient.ofItems(Blocks.COBBLESTONE), Ingredient.ofItems(Blocks.COBBLESTONE_SLAB), 1)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.COBBLESTONE_TRAPDOOR, Ingredient.ofItems(Blocks.COBBLESTONE_SLAB))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter);


        //mossy cobblestone
        ModRecipes.createDoorRecipe(ModBlocks.MOSSY_COBBLESTONE_DOOR, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE))
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE), Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE_SLAB), 3)
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE), Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE_SLAB), 1)
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE_SLAB))
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE))
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_BUTTON, Blocks.MOSSY_COBBLESTONE, 1)
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);

        //smooth stone
        ModRecipes.createStairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.SMOOTH_STONE_DOOR, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SMOOTH_STONE_FENCE, Ingredient.ofItems(Blocks.SMOOTH_STONE), Ingredient.ofItems(Blocks.SMOOTH_STONE_SLAB), 3)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SMOOTH_STONE_FENCE_GATE, Ingredient.ofItems(Blocks.SMOOTH_STONE), Ingredient.ofItems(Blocks.SMOOTH_STONE_SLAB), 1)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SMOOTH_STONE_TRAPDOOR, Ingredient.ofItems(Blocks.SMOOTH_STONE_SLAB))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_BUTTON, Blocks.SMOOTH_STONE, 1)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);

        //stone bricks
        ModRecipes.createDoorRecipe(ModBlocks.STONE_BRICKS_DOOR, Ingredient.ofItems(Blocks.STONE_BRICKS))
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.STONE_BRICKS_FENCE, Ingredient.ofItems(Blocks.STONE_BRICKS), Ingredient.ofItems(Blocks.STONE_BRICK_SLAB), 3)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.STONE_BRICKS_FENCE_GATE, Ingredient.ofItems(Blocks.STONE_BRICKS), Ingredient.ofItems(Blocks.STONE_BRICK_SLAB), 1)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STONE_BRICKS_TRAPDOOR, Ingredient.ofItems(Blocks.STONE_BRICK_SLAB))
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STONE_BRICKS))
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_BUTTON, Blocks.STONE_BRICKS, 1)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);

        //cracked stone bricks
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_DOOR, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_SLAB, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_STONE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS), Ingredient.ofItems(ModBlocks.CRACKED_STONE_BRICKS_SLAB), 3)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS), Ingredient.ofItems(ModBlocks.CRACKED_STONE_BRICKS_SLAB), 1)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR, Ingredient.ofItems(ModBlocks.CRACKED_STONE_BRICKS_SLAB))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_BUTTON, Blocks.CRACKED_STONE_BRICKS, 1)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_WALL, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);

        //granite
        ModRecipes.createDoorRecipe(ModBlocks.GRANITE_DOOR, Ingredient.ofItems(Blocks.GRANITE))
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRANITE_FENCE, Ingredient.ofItems(Blocks.GRANITE), Ingredient.ofItems(Blocks.GRANITE_SLAB), 3)
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRANITE_FENCE_GATE, Ingredient.ofItems(Blocks.GRANITE), Ingredient.ofItems(Blocks.GRANITE_SLAB), 1)
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRANITE_TRAPDOOR, Ingredient.ofItems(Blocks.GRANITE_SLAB))
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.GRANITE))
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BUTTON, Blocks.GRANITE, 1)
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);

        //polished granite
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_GRANITE_DOOR, Ingredient.ofItems(Blocks.POLISHED_GRANITE))
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_GRANITE_FENCE, Ingredient.ofItems(Blocks.POLISHED_GRANITE), Ingredient.ofItems(Blocks.POLISHED_GRANITE_SLAB), 3)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_GRANITE_FENCE_GATE, Ingredient.ofItems(Blocks.POLISHED_GRANITE), Ingredient.ofItems(Blocks.POLISHED_GRANITE_SLAB), 1)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_GRANITE_TRAPDOOR, Ingredient.ofItems(Blocks.POLISHED_GRANITE_SLAB))
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.POLISHED_GRANITE))
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE, 1)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, Ingredient.ofItems(Blocks.POLISHED_GRANITE))
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);

        //diorite
        ModRecipes.createDoorRecipe(ModBlocks.DIORITE_DOOR, Ingredient.ofItems(Blocks.DIORITE))
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DIORITE_FENCE, Ingredient.ofItems(Blocks.DIORITE), Ingredient.ofItems(Blocks.DIORITE_SLAB), 3)
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DIORITE_FENCE_GATE, Ingredient.ofItems(Blocks.DIORITE), Ingredient.ofItems(Blocks.DIORITE_SLAB), 1)
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DIORITE_TRAPDOOR, Ingredient.ofItems(Blocks.DIORITE_SLAB))
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DIORITE))
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BUTTON, Blocks.DIORITE, 1)
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);

        //polished diorite
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_DIORITE_DOOR, Ingredient.ofItems(Blocks.POLISHED_DIORITE))
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_DIORITE_FENCE, Ingredient.ofItems(Blocks.POLISHED_DIORITE), Ingredient.ofItems(Blocks.POLISHED_DIORITE_SLAB), 3)
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_DIORITE_FENCE_GATE, Ingredient.ofItems(Blocks.POLISHED_DIORITE), Ingredient.ofItems(Blocks.POLISHED_DIORITE_SLAB), 1)
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_DIORITE_TRAPDOOR, Ingredient.ofItems(Blocks.POLISHED_DIORITE_SLAB))
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.POLISHED_DIORITE))
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE, 1)
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, Ingredient.ofItems(Blocks.POLISHED_DIORITE))
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);

        //andesite
        ModRecipes.createDoorRecipe(ModBlocks.ANDESITE_DOOR, Ingredient.ofItems(Blocks.ANDESITE))
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ANDESITE_FENCE, Ingredient.ofItems(Blocks.ANDESITE), Ingredient.ofItems(Blocks.ANDESITE_SLAB), 3)
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ANDESITE_FENCE_GATE, Ingredient.ofItems(Blocks.ANDESITE), Ingredient.ofItems(Blocks.ANDESITE_SLAB), 1)
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ANDESITE_TRAPDOOR, Ingredient.ofItems(Blocks.ANDESITE_SLAB))
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.ANDESITE))
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BUTTON, Blocks.ANDESITE, 1)
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);

        //polished andesite
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_ANDESITE_DOOR, Ingredient.ofItems(Blocks.POLISHED_ANDESITE))
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_ANDESITE_FENCE, Ingredient.ofItems(Blocks.POLISHED_ANDESITE), Ingredient.ofItems(Blocks.POLISHED_ANDESITE_SLAB), 3)
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_ANDESITE_FENCE_GATE, Ingredient.ofItems(Blocks.POLISHED_ANDESITE), Ingredient.ofItems(Blocks.POLISHED_ANDESITE_SLAB), 1)
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_ANDESITE_TRAPDOOR, Ingredient.ofItems(Blocks.POLISHED_ANDESITE_SLAB))
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.POLISHED_ANDESITE))
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE, 1)
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, Ingredient.ofItems(Blocks.POLISHED_ANDESITE))
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);

        //deepslate
        ModRecipes.createDoorRecipe(ModBlocks.DEEPSLATE_DOOR, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_SLAB, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.DEEPSLATE_STAIRS, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DEEPSLATE_FENCE, Ingredient.ofItems(Blocks.DEEPSLATE), Ingredient.ofItems(ModBlocks.DEEPSLATE_SLAB), 3)
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DEEPSLATE_FENCE_GATE, Ingredient.ofItems(Blocks.DEEPSLATE), Ingredient.ofItems(ModBlocks.DEEPSLATE_SLAB), 1)
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DEEPSLATE_TRAPDOOR, Ingredient.ofItems(ModBlocks.DEEPSLATE_SLAB))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BUTTON, Blocks.DEEPSLATE, 1)
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);

        //cobbled deepslate
        ModRecipes.createDoorRecipe(ModBlocks.COBBLED_DEEPSLATE_DOOR, Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE))
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.COBBLED_DEEPSLATE_FENCE, Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE), Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE_SLAB), 3)
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE, Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE), Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE_SLAB), 1)
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR, Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE_SLAB))
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE))
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_BUTTON, Blocks.COBBLED_DEEPSLATE, 1)
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter);

        //chiseled deepslate
        ModRecipes.createDoorRecipe(ModBlocks.CHISELED_DEEPSLATE_DOOR, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE))
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_SLAB, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE))
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CHISELED_DEEPSLATE_STAIRS, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE))
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CHISELED_DEEPSLATE_FENCE, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE), Ingredient.ofItems(ModBlocks.CHISELED_DEEPSLATE_SLAB), 3)
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE), Ingredient.ofItems(ModBlocks.CHISELED_DEEPSLATE_SLAB), 1)
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CHISELED_DEEPSLATE_TRAPDOOR, Ingredient.ofItems(ModBlocks.CHISELED_DEEPSLATE_SLAB))
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE))
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_BUTTON, Blocks.CHISELED_DEEPSLATE, 1)
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_WALL, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE))
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE), conditionsFromItem(Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);

        //polished deepslate
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_DEEPSLATE_DOOR, Ingredient.ofItems(Blocks.POLISHED_DEEPSLATE))
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_DEEPSLATE_FENCE, Ingredient.ofItems(Blocks.POLISHED_DEEPSLATE), Ingredient.ofItems(Blocks.POLISHED_DEEPSLATE_SLAB), 3)
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE, Ingredient.ofItems(Blocks.POLISHED_DEEPSLATE), Ingredient.ofItems(Blocks.POLISHED_DEEPSLATE_SLAB), 1)
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR, Ingredient.ofItems(Blocks.POLISHED_DEEPSLATE_SLAB))
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.POLISHED_DEEPSLATE))
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE, 1)
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);

        //deepslate bricks
        ModRecipes.createDoorRecipe(ModBlocks.DEEPSLATE_BRICKS_DOOR, Ingredient.ofItems(Blocks.DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.DEEPSLATE_BRICKS), conditionsFromItem(Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DEEPSLATE_BRICKS_FENCE, Ingredient.ofItems(Blocks.DEEPSLATE_BRICKS), Ingredient.ofItems(Blocks.DEEPSLATE_BRICK_SLAB), 3)
                .criterion(hasItem(Blocks.DEEPSLATE_BRICKS), conditionsFromItem(Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE, Ingredient.ofItems(Blocks.DEEPSLATE_BRICKS), Ingredient.ofItems(Blocks.DEEPSLATE_BRICK_SLAB), 1)
                .criterion(hasItem(Blocks.DEEPSLATE_BRICKS), conditionsFromItem(Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DEEPSLATE_BRICKS_TRAPDOOR, Ingredient.ofItems(Blocks.DEEPSLATE_BRICK_SLAB))
                .criterion(hasItem(Blocks.DEEPSLATE_BRICKS), conditionsFromItem(Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.DEEPSLATE_BRICKS), conditionsFromItem(Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BRICKS_BUTTON, Blocks.DEEPSLATE_BRICKS, 1)
                .criterion(hasItem(Blocks.DEEPSLATE_BRICKS), conditionsFromItem(Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter);

        //cracked deepslate bricks
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS), Ingredient.ofItems(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB), 3)
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS), Ingredient.ofItems(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB), 1)
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TRAPDOOR, Ingredient.ofItems(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON, Blocks.CRACKED_DEEPSLATE_BRICKS, 1)
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);

        //deepslate bricks
        ModRecipes.createDoorRecipe(ModBlocks.DEEPSLATE_TILES_DOOR, Ingredient.ofItems(Blocks.DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.DEEPSLATE_TILES), conditionsFromItem(Blocks.DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DEEPSLATE_TILES_FENCE, Ingredient.ofItems(Blocks.DEEPSLATE_TILES), Ingredient.ofItems(Blocks.DEEPSLATE_TILE_SLAB), 3)
                .criterion(hasItem(Blocks.DEEPSLATE_TILES), conditionsFromItem(Blocks.DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DEEPSLATE_TILES_FENCE_GATE, Ingredient.ofItems(Blocks.DEEPSLATE_TILES), Ingredient.ofItems(Blocks.DEEPSLATE_TILE_SLAB), 1)
                .criterion(hasItem(Blocks.DEEPSLATE_TILES), conditionsFromItem(Blocks.DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DEEPSLATE_TILES_TRAPDOOR, Ingredient.ofItems(Blocks.DEEPSLATE_TILE_SLAB))
                .criterion(hasItem(Blocks.DEEPSLATE_TILES), conditionsFromItem(Blocks.DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.DEEPSLATE_TILES), conditionsFromItem(Blocks.DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_BUTTON, Blocks.DEEPSLATE_TILES, 1)
                .criterion(hasItem(Blocks.DEEPSLATE_TILES), conditionsFromItem(Blocks.DEEPSLATE_TILES))
                .offerTo(exporter);

        //cracked deepslate tiles
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES), Ingredient.ofItems(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB), 3)
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES), Ingredient.ofItems(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB), 1)
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_TRAPDOOR, Ingredient.ofItems(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON, Blocks.CRACKED_DEEPSLATE_TILES, 1)
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_WALL, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES), conditionsFromItem(Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);

        //bricks
        ModRecipes.createDoorRecipe(ModBlocks.BRICK_DOOR, Ingredient.ofItems(Blocks.BRICKS))
                .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BRICK_FENCE, Ingredient.ofItems(Blocks.BRICKS), Ingredient.ofItems(Blocks.BRICK_SLAB), 3)
                .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BRICK_FENCE_GATE, Ingredient.ofItems(Blocks.BRICKS), Ingredient.ofItems(Blocks.BRICK_SLAB), 1)
                .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BRICK_TRAPDOOR, Ingredient.ofItems(Blocks.BRICK_SLAB))
                .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BRICK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.BRICKS))
                .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BRICK_BUTTON, Blocks.BRICKS, 1)
                .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                .offerTo(exporter);

        //packed mud
        ModRecipes.createDoorRecipe(ModBlocks.PACKED_MUD_DOOR, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_SLAB, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PACKED_MUD_STAIRS, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PACKED_MUD_FENCE, Ingredient.ofItems(Blocks.PACKED_MUD), Ingredient.ofItems(ModBlocks.PACKED_MUD_SLAB), 3)
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PACKED_MUD_FENCE_GATE, Ingredient.ofItems(Blocks.PACKED_MUD), Ingredient.ofItems(ModBlocks.PACKED_MUD_SLAB), 1)
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PACKED_MUD_TRAPDOOR, Ingredient.ofItems(ModBlocks.PACKED_MUD_SLAB))
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_BUTTON, Blocks.PACKED_MUD, 1)
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_WALL, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter);

        //mud bricks
        ModRecipes.createDoorRecipe(ModBlocks.MUD_BRICK_DOOR, Ingredient.ofItems(Blocks.MUD_BRICKS))
                .criterion(hasItem(Blocks.MUD_BRICKS), conditionsFromItem(Blocks.MUD_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MUD_BRICK_FENCE, Ingredient.ofItems(Blocks.MUD_BRICKS), Ingredient.ofItems(Blocks.MUD_BRICK_SLAB), 3)
                .criterion(hasItem(Blocks.MUD_BRICKS), conditionsFromItem(Blocks.MUD_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MUD_BRICK_FENCE_GATE, Ingredient.ofItems(Blocks.MUD_BRICKS), Ingredient.ofItems(Blocks.MUD_BRICK_SLAB), 1)
                .criterion(hasItem(Blocks.MUD_BRICKS), conditionsFromItem(Blocks.MUD_BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MUD_BRICK_TRAPDOOR, Ingredient.ofItems(Blocks.MUD_BRICK_SLAB))
                .criterion(hasItem(Blocks.MUD_BRICKS), conditionsFromItem(Blocks.MUD_BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BRICK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.MUD_BRICKS))
                .criterion(hasItem(Blocks.MUD_BRICKS), conditionsFromItem(Blocks.MUD_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BRICK_BUTTON, Blocks.MUD_BRICKS, 1)
                .criterion(hasItem(Blocks.MUD_BRICKS), conditionsFromItem(Blocks.MUD_BRICKS))
                .offerTo(exporter);

        //sandstone
        ModRecipes.createDoorRecipe(ModBlocks.SANDSTONE_DOOR, Ingredient.ofItems(Blocks.SANDSTONE))
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SANDSTONE_FENCE, Ingredient.ofItems(Blocks.SANDSTONE), Ingredient.ofItems(Blocks.SANDSTONE_SLAB), 3)
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SANDSTONE_FENCE_GATE, Ingredient.ofItems(Blocks.SANDSTONE), Ingredient.ofItems(Blocks.SANDSTONE_SLAB), 1)
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SANDSTONE_TRAPDOOR, Ingredient.ofItems(Blocks.SANDSTONE_SLAB))
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.SANDSTONE))
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BUTTON, Blocks.SANDSTONE, 1)
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter);

        //smooth sandstone
        ModRecipes.createDoorRecipe(ModBlocks.SMOOTH_SANDSTONE_DOOR, Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE))
                .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SMOOTH_SANDSTONE_FENCE, Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE), Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE_SLAB), 3)
                .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE, Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE), Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE_SLAB), 1)
                .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR, Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE_SLAB))
                .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE))
                .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_BUTTON, Blocks.SMOOTH_SANDSTONE, 1)
                .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_WALL, Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE))
                .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);

        //cut sandstone
        ModRecipes.createStairsRecipe(ModBlocks.CUT_SANDSTONE_STAIRS, Ingredient.ofItems(Blocks.CUT_SANDSTONE))
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.CUT_SANDSTONE_DOOR, Ingredient.ofItems(Blocks.CUT_SANDSTONE))
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CUT_SANDSTONE_FENCE, Ingredient.ofItems(Blocks.CUT_SANDSTONE), Ingredient.ofItems(Blocks.CUT_SANDSTONE_SLAB), 3)
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CUT_SANDSTONE_FENCE_GATE, Ingredient.ofItems(Blocks.CUT_SANDSTONE), Ingredient.ofItems(Blocks.CUT_SANDSTONE_SLAB), 1)
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CUT_SANDSTONE_TRAPDOOR, Ingredient.ofItems(Blocks.CUT_SANDSTONE_SLAB))
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CUT_SANDSTONE))
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_BUTTON, Blocks.CUT_SANDSTONE, 1)
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, Ingredient.ofItems(Blocks.CUT_SANDSTONE))
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter);

        //red sandstone
        ModRecipes.createDoorRecipe(ModBlocks.RED_SANDSTONE_DOOR, Ingredient.ofItems(Blocks.RED_SANDSTONE))
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_SANDSTONE_FENCE, Ingredient.ofItems(Blocks.RED_SANDSTONE), Ingredient.ofItems(Blocks.RED_SANDSTONE_SLAB), 3)
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_SANDSTONE_FENCE_GATE, Ingredient.ofItems(Blocks.RED_SANDSTONE), Ingredient.ofItems(Blocks.RED_SANDSTONE_SLAB), 1)
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_SANDSTONE_TRAPDOOR, Ingredient.ofItems(Blocks.RED_SANDSTONE_SLAB))
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.RED_SANDSTONE))
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BUTTON, Blocks.RED_SANDSTONE, 1)
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter);

        //red smooth sandstone
        ModRecipes.createDoorRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR, Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE))
                .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE, Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE), Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE_SLAB), 3)
                .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE, Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE), Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE_SLAB), 1)
                .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR, Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE_SLAB))
                .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE))
                .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON, Blocks.SMOOTH_RED_SANDSTONE, 1)
                .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE))
                .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);

        //red cut sandstone
        ModRecipes.createStairsRecipe(ModBlocks.CUT_RED_SANDSTONE_STAIRS, Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE))
                .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.CUT_RED_SANDSTONE_DOOR, Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE))
                .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CUT_RED_SANDSTONE_FENCE, Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE), Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE_SLAB), 3)
                .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE, Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE), Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE_SLAB), 1)
                .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CUT_RED_SANDSTONE_TRAPDOOR, Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE_SLAB))
                .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE))
                .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_BUTTON, Blocks.CUT_RED_SANDSTONE, 1)
                .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, Ingredient.ofItems(Blocks.CUT_RED_SANDSTONE))
                .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);

        //sea lantern
        ModRecipes.createDoorRecipe(ModBlocks.SEA_LANTERN_DOOR, Ingredient.ofItems(Blocks.SEA_LANTERN))
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_SLAB, Ingredient.ofItems(Blocks.SEA_LANTERN))
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.SEA_LANTERN_STAIRS, Ingredient.ofItems(Blocks.SEA_LANTERN))
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SEA_LANTERN_FENCE, Ingredient.ofItems(Blocks.SEA_LANTERN), Ingredient.ofItems(ModBlocks.SEA_LANTERN_SLAB), 3)
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SEA_LANTERN_FENCE_GATE, Ingredient.ofItems(Blocks.SEA_LANTERN), Ingredient.ofItems(ModBlocks.SEA_LANTERN_SLAB), 1)
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SEA_LANTERN_TRAPDOOR, Ingredient.ofItems(ModBlocks.SEA_LANTERN_SLAB))
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_PRESSURE_PLATE, Ingredient.ofItems(Blocks.SEA_LANTERN))
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_BUTTON, Blocks.SEA_LANTERN, 1)
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_WALL, Ingredient.ofItems(Blocks.SEA_LANTERN))
                .criterion(hasItem(Blocks.SEA_LANTERN), conditionsFromItem(Blocks.SEA_LANTERN))
                .offerTo(exporter);

        //prismarine
        ModRecipes.createDoorRecipe(ModBlocks.PRISMARINE_DOOR, Ingredient.ofItems(Blocks.PRISMARINE))
                .criterion(hasItem(Blocks.PRISMARINE), conditionsFromItem(Blocks.PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PRISMARINE_FENCE, Ingredient.ofItems(Blocks.PRISMARINE), Ingredient.ofItems(Blocks.PRISMARINE_SLAB), 3)
                .criterion(hasItem(Blocks.PRISMARINE), conditionsFromItem(Blocks.PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PRISMARINE_FENCE_GATE, Ingredient.ofItems(Blocks.PRISMARINE), Ingredient.ofItems(Blocks.PRISMARINE_SLAB), 1)
                .criterion(hasItem(Blocks.PRISMARINE), conditionsFromItem(Blocks.PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PRISMARINE_TRAPDOOR, Ingredient.ofItems(Blocks.PRISMARINE_SLAB))
                .criterion(hasItem(Blocks.PRISMARINE), conditionsFromItem(Blocks.PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.PRISMARINE))
                .criterion(hasItem(Blocks.PRISMARINE), conditionsFromItem(Blocks.PRISMARINE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BUTTON, Blocks.PRISMARINE, 1)
                .criterion(hasItem(Blocks.PRISMARINE), conditionsFromItem(Blocks.PRISMARINE))
                .offerTo(exporter);

        //prismarine bricks
        ModRecipes.createDoorRecipe(ModBlocks.PRISMARINE_BRICK_DOOR, Ingredient.ofItems(Blocks.PRISMARINE_BRICKS))
                .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PRISMARINE_BRICK_FENCE, Ingredient.ofItems(Blocks.PRISMARINE_BRICKS), Ingredient.ofItems(Blocks.PRISMARINE_BRICK_SLAB), 3)
                .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PRISMARINE_BRICK_FENCE_GATE, Ingredient.ofItems(Blocks.PRISMARINE_BRICKS), Ingredient.ofItems(Blocks.PRISMARINE_BRICK_SLAB), 1)
                .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PRISMARINE_BRICK_TRAPDOOR, Ingredient.ofItems(Blocks.PRISMARINE_BRICK_SLAB))
                .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.PRISMARINE_BRICKS))
                .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_BUTTON, Blocks.PRISMARINE_BRICKS, 1)
                .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_WALL, Ingredient.ofItems(Blocks.PRISMARINE_BRICKS))
                .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);

        //prismarine
        ModRecipes.createDoorRecipe(ModBlocks.DARK_PRISMARINE_DOOR, Ingredient.ofItems(Blocks.DARK_PRISMARINE))
                .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DARK_PRISMARINE_FENCE, Ingredient.ofItems(Blocks.DARK_PRISMARINE), Ingredient.ofItems(Blocks.DARK_PRISMARINE_SLAB), 3)
                .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DARK_PRISMARINE_FENCE_GATE, Ingredient.ofItems(Blocks.DARK_PRISMARINE), Ingredient.ofItems(Blocks.DARK_PRISMARINE_SLAB), 1)
                .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DARK_PRISMARINE_TRAPDOOR, Ingredient.ofItems(Blocks.DARK_PRISMARINE_SLAB))
                .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DARK_PRISMARINE))
                .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_BUTTON, Blocks.DARK_PRISMARINE, 1)
                .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_WALL, Ingredient.ofItems(Blocks.DARK_PRISMARINE))
                .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                .offerTo(exporter);

        //netherrack
        ModRecipes.createDoorRecipe(ModBlocks.NETHERRACK_DOOR, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_SLAB, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.NETHERRACK_FENCE, Ingredient.ofItems(Blocks.NETHERRACK), Ingredient.ofItems(ModBlocks.NETHERRACK_SLAB), 3)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.NETHERRACK_FENCE_GATE, Ingredient.ofItems(Blocks.NETHERRACK), Ingredient.ofItems(ModBlocks.NETHERRACK_SLAB), 1)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.NETHERRACK_TRAPDOOR, Ingredient.ofItems(ModBlocks.NETHERRACK_SLAB))
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BUTTON, Blocks.NETHERRACK, 1)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter);


        //nether bricks
        ModRecipes.createDoorRecipe(ModBlocks.NETHER_BRICK_DOOR, Ingredient.ofItems(Blocks.NETHER_BRICKS))
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.NETHER_BRICK_FENCE_GATE, Ingredient.ofItems(Blocks.NETHER_BRICKS), Ingredient.ofItems(Blocks.NETHER_BRICK_SLAB), 1)
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.NETHER_BRICK_TRAPDOOR, Ingredient.ofItems(Blocks.NETHER_BRICK_SLAB))
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_BRICK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.NETHER_BRICKS))
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_BRICK_BUTTON, Blocks.NETHER_BRICKS, 1)
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter);

        //cracked nether bricks
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_NETHER_BRICK_DOOR, Ingredient.ofItems(Blocks.CRACKED_NETHER_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Ingredient.ofItems(Blocks.CRACKED_NETHER_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Ingredient.ofItems(Blocks.CRACKED_NETHER_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_NETHER_BRICK_FENCE, Ingredient.ofItems(Blocks.CRACKED_NETHER_BRICKS), Ingredient.ofItems(ModBlocks.CRACKED_NETHER_BRICK_SLAB), 3)
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_NETHER_BRICK_FENCE_GATE, Ingredient.ofItems(Blocks.CRACKED_NETHER_BRICKS), Ingredient.ofItems(ModBlocks.CRACKED_NETHER_BRICK_SLAB), 1)
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_NETHER_BRICK_TRAPDOOR, Ingredient.ofItems(ModBlocks.CRACKED_NETHER_BRICK_SLAB))
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CRACKED_NETHER_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_BUTTON, Blocks.CRACKED_NETHER_BRICKS, 1)
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Ingredient.ofItems(Blocks.CRACKED_NETHER_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);



    }









}

