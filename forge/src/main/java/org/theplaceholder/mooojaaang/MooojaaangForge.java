package org.theplaceholder.mooojaaang;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Mooojaaang.MODID)
public class MooojaaangForge {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mooojaaang.MODID);
    private static final RegistryObject<SoundEvent> SOUND_EVENT = SOUND_EVENTS.register(Mooojaaang.MODID, () -> SoundEvent.of(new Identifier(Mooojaaang.MODID, Mooojaaang.MODID)));
    public MooojaaangForge() {
        SOUND_EVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Mooojaaang.SOUND_EVENT = SOUND_EVENT;
    }
}