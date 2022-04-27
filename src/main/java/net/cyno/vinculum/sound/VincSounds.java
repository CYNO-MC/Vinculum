package net.cyno.vinculum.sound;

import net.cyno.vinculum.VinculumMain;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VincSounds {

    public static SoundEvent HEROBRINE_HURT_SOUND = registerSoundEvent("herobrine_hurt_sound");

    public VincSounds() {

    }

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(VinculumMain.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
