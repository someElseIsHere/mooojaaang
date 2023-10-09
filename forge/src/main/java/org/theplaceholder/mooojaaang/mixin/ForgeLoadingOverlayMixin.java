package org.theplaceholder.mooojaaang.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraftforge.client.loading.ForgeLoadingOverlay;
import net.minecraftforge.fml.loading.progress.ProgressMeter;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.theplaceholder.mooojaaang.Mooojaaang;

@Mixin(ForgeLoadingOverlay.class)
public class ForgeLoadingOverlayMixin {

    @Shadow(remap = false) @Final private ProgressMeter progress;

    @Inject(method = "render", at = @At("TAIL"))
    private void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if(progress.progress() >= 0.99f)
            Mooojaaang.play();
    }
}