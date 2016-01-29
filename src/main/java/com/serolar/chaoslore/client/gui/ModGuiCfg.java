package com.serolar.chaoslore.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import com.serolar.chaoslore.handler.ConfigurationHandler;
import com.serolar.chaoslore.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiCfg extends GuiConfig
{
	public ModGuiCfg(GuiScreen guiScreen)
	{
		super(guiScreen,
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}

}
