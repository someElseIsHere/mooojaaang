package org.theplaceholder.mooojaaang;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class Mooojaaang {
    public static Supplier<SoundEvent> SOUND_EVENT;
    public static final String MODID = "mooojaaang";

    public static void init() {
        Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MODID));
        Registrar<SoundEvent> SOUNDS = MANAGER.get().get(Registries.SOUND_EVENT);
        SOUND_EVENT = SOUNDS.register(ResourceLocation.fromNamespaceAndPath(MODID, MODID), () -> SoundEvent.createFixedRangeEvent(ResourceLocation.fromNamespaceAndPath(MODID, MODID), 1.0f));
    }
}
