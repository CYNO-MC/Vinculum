package net.cyno.vinculum;

import net.cyno.vinculum.entity.VincEntities;
import net.cyno.vinculum.entity.client.HerobrineRenderer;
import net.cyno.vinculum.entity.custom.HerobrineEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class VinculumClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(VincEntities.HEROBRINE, HerobrineRenderer::new);

    }
}
