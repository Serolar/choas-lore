package com.serolar.chaoslore.client.handler;

import com.serolar.chaoslore.client.settings.KeyBindings;
import com.serolar.chaoslore.reference.Key;
import com.serolar.chaoslore.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
	private static Key getPressedKeyBinding(){
		if (KeyBindings.learn.isPressed()){
			return Key.LEARN;
		}
		
		else {
		return Key.UNKNOWN;
		}
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
		LogHelper.info(getPressedKeyBinding());
	}
}
