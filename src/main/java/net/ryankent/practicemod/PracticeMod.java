package net.ryankent.practicemod;

import net.fabricmc.api.ModInitializer;
import net.ryankent.practicemod.block.ModBlocks;
import net.ryankent.practicemod.item.ModItems;
import net.ryankent.practicemod.registries.ModRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PracticeMod implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("modid");
	public static final String mod_id = "practicemod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModFuels();

		System.out.println("Hello Fabric world!");
	}
}
