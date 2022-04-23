package net.cyno.vinculum;

import net.cyno.vinculum.item.VincItemRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VinculumMain implements ModInitializer {

	public static final String MOD_ID = "vinculum";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		VincItemRegistry.printItems();

	}
}
