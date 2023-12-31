package org.theplaceholder.mooojaaang;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class Mooojaaang {
    public static Supplier<SoundEvent> soundEvent;
    public static final String modid = "mooojaaang";
    public static Identifier soundEventLocation = new Identifier(modid, "mooojaaang");
    private static boolean isLaunching = true;
    public static void play() {
        SoundManager soundManager = MinecraftClient.getInstance().getSoundManager();
        if (isLaunching && soundManager.soundSystem.started) {
            soundManager.play(PositionedSoundInstance.master(soundEvent.get(), 1.0F));
            isLaunching = false;
        }
    }
}
