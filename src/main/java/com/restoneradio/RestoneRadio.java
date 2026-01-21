package com.restoneradio;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestoneRadio implements ModInitializer {
    public static final String MOD_ID = "restone-radio";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Restone Radio initializing...");
        ModItems.initialize();
        LOGGER.info("Restone Radio initialized!");
    }
}
