package com.strikebyte.bca;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrocraftCobblemonadditions implements ModInitializer {
	public static final String MOD_ID = "bca";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Brocraft Cobblemon Additions mod has been loaded!");
	}
}