package org.theplaceholder.mooojaaang;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;

public class MooojaaangFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mooojaaang.soundEvent = () -> SoundEvent.of(Mooojaaang.soundEventLocation);
        Registry.register(Registries.SOUND_EVENT, Mooojaaang.soundEventLocation, Mooojaaang.soundEvent.get());
    }
}
