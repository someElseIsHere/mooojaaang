package org.theplaceholder.mooojaaang;

import net.fabricmc.api.ClientModInitializer;

public class MooojaaangFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Mooojaaang.init();
    }
}
