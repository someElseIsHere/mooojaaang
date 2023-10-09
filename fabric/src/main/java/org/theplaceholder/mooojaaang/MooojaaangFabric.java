package org.theplaceholder.mooojaaang;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import static org.theplaceholder.mooojaaang.Mooojaaang.*;

public class MooojaaangFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        soundEvent = () -> SoundEvent.of(soundEventLocation);
        Registry.register(Registries.SOUND_EVENT, soundEventLocation, soundEvent.get());
    }
}
