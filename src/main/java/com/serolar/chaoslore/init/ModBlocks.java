package com.serolar.chaoslore.init;

import com.serolar.chaoslore.block.BlockChaosLore;
import com.serolar.chaoslore.block.BlockWisdom;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static final BlockChaosLore wisdomBlock = new BlockWisdom();
	
	public static void init()
	{
		GameRegistry.registerBlock(wisdomBlock, "wisdomBlock");
	}
}
