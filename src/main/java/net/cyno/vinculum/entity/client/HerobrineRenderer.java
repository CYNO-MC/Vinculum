package net.cyno.vinculum.entity.client;

import net.cyno.vinculum.VinculumMain;
import net.cyno.vinculum.entity.custom.HerobrineEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HerobrineRenderer extends GeoEntityRenderer<HerobrineEntity> {

    public HerobrineRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HerobrineModel());
    }


    @Override
    public Identifier getTextureLocation(HerobrineEntity entity) {
        return new Identifier(VinculumMain.MOD_ID, "textures/entity/herobrine/herobrine.png");
    }
}
