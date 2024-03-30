package org.theplaceholder.mooojaaang;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.sound.SoundEvent;

import java.util.function.Supplier;

public class Mooojaaang {
    public static Supplier<SoundEvent> SOUND_EVENT;
    public static final String MODID = "mooojaaang";

    private static boolean isLaunching = true;
    public static void tryToPlay() {
        SoundManager soundManager = MinecraftClient.getInstance().getSoundManager();
        if (isLaunching && soundManager.soundSystem.started) {
            soundManager.play(PositionedSoundInstance.master(SOUND_EVENT.get(), 1.0F));
            isLaunching = false;
        }
    }
}
