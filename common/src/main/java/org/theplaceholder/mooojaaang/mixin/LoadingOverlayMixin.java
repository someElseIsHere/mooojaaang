package org.theplaceholder.mooojaaang.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.client.sound.PositionedSoundInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.theplaceholder.mooojaaang.Mooojaaang;

@Mixin(SplashOverlay.class)
public class LoadingOverlayMixin {
    @Shadow private float progress;
    private boolean mjg$HasPlayed = false;
    private static boolean mjg$IsLaunching = true;


    @Inject(method = "render", at = @At("TAIL"))
    private void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!mjg$HasPlayed && mjg$IsLaunching && this.progress >= 0.5F && MinecraftClient.getInstance().getSoundManager().soundSystem.started) {
            MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance.master(Mooojaaang.soundEvent, 1.0F));
            mjg$HasPlayed = true;
            mjg$IsLaunching = false;
        }
    }
}
