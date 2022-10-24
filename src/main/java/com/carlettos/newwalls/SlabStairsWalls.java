package com.carlettos.newwalls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ShearsItem;

public class SlabStairsWalls implements ModInitializer {
    public static final String MOD_ID = "newwalls";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        NewBlocks.register();
        NewItems.register();
	}
}
