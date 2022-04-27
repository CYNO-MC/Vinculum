package net.cyno.vinculum;

import net.cyno.vinculum.block.VincBlocks;
import net.cyno.vinculum.item.VincItems;
import net.cyno.vinculum.sound.VincSounds;
import net.cyno.vinculum.util.VincRegistries;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class VinculumMain implements ModInitializer {

	public static final String MOD_ID = "vinculum";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GeckoLib.initialize();
		VincItems.registerVincItems();
		VincBlocks.registerVincBlocks();
		VincRegistries.registerModStuffs();
	}
}
