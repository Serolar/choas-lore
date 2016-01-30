package com.serolar.chaoslore;

import com.serolar.chaoslore.client.handler.KeyInputEventHandler;
import com.serolar.chaoslore.handler.ConfigurationHandler;
import com.serolar.chaoslore.init.ModBlocks;
import com.serolar.chaoslore.init.ModItems;
import com.serolar.chaoslore.init.Recipes;
import com.serolar.chaoslore.proxy.IProxy;
import com.serolar.chaoslore.reference.Reference;
import com.serolar.chaoslore.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class ChaosLore {
	@Mod.Instance(Reference.MOD_ID)
	public static ChaosLore instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		proxy.registerKeyBindings();
		ModItems.init();
		ModBlocks.init();
		
		LogHelper.info("Loremen! Attention! Time to bring it all out!");
	};
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
	
		Recipes.init();
		
		LogHelper.info("Just a little more! The world shall know the Lore's Chaos!");
	};
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		LogHelper.info("That's it, Loremen! We have succeeded! On to the adventures!");
	}
	
}
