package org.theplaceholder.mooojaaang;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class MooojaaangFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mooojaaang.SOUND_EVENT = () -> SoundEvent.of(new Identifier(Mooojaaang.MODID, Mooojaaang.MODID));
        Registry.register(Registries.SOUND_EVENT, new Identifier(Mooojaaang.MODID, Mooojaaang.MODID), Mooojaaang.SOUND_EVENT.get());
    }
}
