package org.theplaceholder.mooojaaang;

import net.minecraft.sound.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static org.theplaceholder.mooojaaang.Mooojaaang.*;
@Mod(modid)
public class MooojaaangForge {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, modid);
    private static final RegistryObject<SoundEvent> SOUND_EVENT = SOUND_EVENTS.register("mooojaaang", () -> SoundEvent.of(soundEventLocation));
    public MooojaaangForge() {
        SOUND_EVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        soundEvent = SOUND_EVENT;
    }
}