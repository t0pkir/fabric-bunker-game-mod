package com.bunker;

import net.fabricmc.api.client.ModInitializer;
import net.fabricmc.fabric.api.client.screenregistry.v1.ScreenRegistry;
import com.bunker.registry.BunkerScreenHandlers;
import com.bunker.client.screen.BunkerControllerScreen;

/**
 * Client-side entry point for the Bunker Game mod.
 * Registers client-specific features like screens.
 */
public class BunkerClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BunkerMod.LOGGER.info("Initializing Bunker Game Mod Client...");

        // Register screens
        ScreenRegistry.register(BunkerScreenHandlers.BUNKER_CONTROLLER_SCREEN_HANDLER, BunkerControllerScreen::new);

        BunkerMod.LOGGER.info("Bunker Game Mod Client initialized!");
    }
}