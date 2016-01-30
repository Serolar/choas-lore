package com.serolar.chaoslore.init;

import com.serolar.chaoslore.item.ItemChaosLore;
import com.serolar.chaoslore.item.ItemWisdomDust;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemChaosLore wisdomDust = new ItemWisdomDust();
	
	public static void init()
	{
		GameRegistry.registerItem(wisdomDust, "wisdomDust");
	}
}
