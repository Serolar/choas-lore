package com.serolar.chaoslore.handler;

import java.io.File;
import com.serolar.chaoslore.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static Configuration configuration;
	public static boolean oreGens = false;
	
	public static void init(File configFile)
	{
		// Create the configuration object from the given configuration file
		
		
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
			loadConfig();
		}
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
			loadConfig();
		}
	}
	private static void loadConfig()
	{
		oreGens = configuration.getBoolean("oreGens", Configuration.CATEGORY_GENERAL, true, "Does this mod's ores generate?");
		
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
