package com.serolar.chaoslore.creativetab;

import com.serolar.chaoslore.init.ModItems;
import com.serolar.chaoslore.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabChaosLore 
{
	public static final CreativeTabs CHAOSLORE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
		@Override
		public Item getTabIconItem() {
			return ModItems.wisdomDust;
		}
	};
}
