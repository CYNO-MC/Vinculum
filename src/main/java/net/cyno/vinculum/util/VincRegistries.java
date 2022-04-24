package net.cyno.vinculum.util;

import net.cyno.vinculum.entity.VincEntities;
import net.cyno.vinculum.entity.custom.HerobrineEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class VincRegistries {

    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(VincEntities.HEROBRINE, HerobrineEntity.setAttributes());
    }
}
