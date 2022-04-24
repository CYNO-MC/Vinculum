package net.cyno.vinculum.entity;

import net.cyno.vinculum.VinculumMain;
import net.cyno.vinculum.entity.custom.HerobrineEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VincEntities {
    public static final EntityType<HerobrineEntity> HEROBRINE = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(VinculumMain.MOD_ID, "herobrine"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HerobrineEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f,1.8f)).build());


}
