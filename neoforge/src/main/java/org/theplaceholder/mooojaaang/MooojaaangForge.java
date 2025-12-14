package org.theplaceholder.mooojaaang;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = Mooojaaang.MODID, dist = Dist.CLIENT)
public class MooojaaangForge {
   public MooojaaangForge() {
       Mooojaaang.init();
   }
}