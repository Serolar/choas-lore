package com.serolar.chaoslore.proxy;

import com.serolar.chaoslore.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerKeyBindings()
	{
		ClientRegistry.registerKeyBinding(KeyBindings.learn);
	}
}
