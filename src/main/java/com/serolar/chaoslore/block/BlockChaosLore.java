package com.serolar.chaoslore.block;

import com.serolar.chaoslore.creativetab.CreativeTabChaosLore;
import com.serolar.chaoslore.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockChaosLore extends Block {
	// This is the framework Block Class for this mod.
	public BlockChaosLore(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabChaosLore.CHAOSLORE_TAB);
	}
	
	public BlockChaosLore() {
		this(Material.rock);
		this.setCreativeTab(CreativeTabChaosLore.CHAOSLORE_TAB);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
