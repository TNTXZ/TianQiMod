package org.eu.tianqi;

import net.fabricmc.api.ModInitializer;

import org.eu.tianqi.registry.ModBlocks;
import org.eu.tianqi.registry.ModItemGroup;
import org.eu.tianqi.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TianQiMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "tianqi-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tianqi-mod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("By TNTXZ");
		ModItemGroup.registerModItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}