package org.theplaceholder.mooojaaang.mixin;

import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.sounds.SoundEngine;
import net.minecraft.client.sounds.SoundManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.theplaceholder.mooojaaang.Mooojaaang;

@Mixin(SoundEngine.class)
public class SoundEngineMixin {
    @Shadow @Final private SoundManager soundManager;

    @Inject(method = "reload", at = @At("TAIL"))
    private void reload(CallbackInfo ci) {
        this.soundManager.play(SimpleSoundInstance.forUI(Mooojaaang.SOUND_EVENT.get(), 1.0f));
    }
}
