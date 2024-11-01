package com.delishoes.intergalacticraft;

import com.delishoes.intergalacticraft.registries.BlockRegistry;
import com.delishoes.intergalacticraft.registries.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Intergalacticraft implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("intergalacticraft");
	public static final String MOD_ID = "intergalacticraft";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Intergalacticraft initialized!");

		BlockRegistry.init();
		ItemRegistry.init();

	}
	public static ResourceLocation identifier(String path){
		return new ResourceLocation(MOD_ID, path);
	}
}