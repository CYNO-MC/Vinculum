package net.cyno.vinculum.entity.client;

import net.cyno.vinculum.VinculumMain;
import net.cyno.vinculum.entity.custom.HerobrineEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HerobrineModel extends AnimatedGeoModel<HerobrineEntity> {


    @Override
    public Identifier getModelLocation(HerobrineEntity entity) {
        return new Identifier(VinculumMain.MOD_ID, "geo/herobrine.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HerobrineEntity entity) {
        return new Identifier(VinculumMain.MOD_ID, "textures/entity/herobrine/herobrine.png");
    }

    @Override
    public Identifier getAnimationFileLocation(HerobrineEntity entity) {
        return new Identifier(VinculumMain.MOD_ID, "animations/herobrine.animations.json");
    }
}
