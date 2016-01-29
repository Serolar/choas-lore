package com.serolar.chaoslore;

import com.serolar.chaoslore.proxy.IProxy;
import com.serolar.chaoslore.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
public class ChaosLore 
{
	@Mod.Instance(Reference.MOD_ID)
	public static ChaosLore instance;
	
	@SidedProxy(clientSide="com.serolar.chaoslore.proxy.ClientProxy", serverSide="com.serolar.chaoslore.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	};
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	};
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
