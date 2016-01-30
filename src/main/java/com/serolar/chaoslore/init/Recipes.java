package com.serolar.chaoslore.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wisdomBlock), "sss", "sgs", "sss", 's', "gemLapis", 'g', "blockGold"));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.wisdomBlock), "sss", "s s", "sss", 's', new ItemStack(ModItems.wisdomDust));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.wisdomDust, 8), new ItemStack(ModBlocks.wisdomBlock));
		
	}

}
