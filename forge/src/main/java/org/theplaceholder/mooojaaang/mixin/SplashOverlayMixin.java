package org.theplaceholder.mooojaaang.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraftforge.client.loading.ForgeLoadingOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.theplaceholder.mooojaaang.Mooojaaang;

@Mixin(ForgeLoadingOverlay.class)
public class SplashOverlayMixin {

    @Inject(method = "render", at = @At("TAIL"))
    private void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        Mooojaaang.play();
    }
}