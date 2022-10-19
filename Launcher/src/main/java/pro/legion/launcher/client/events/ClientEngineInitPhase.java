package pro.legion.launcher.client.events;

import pro.legion.launcher.LauncherEngine;
import pro.legion.launcher.modules.events.InitPhase;

public class ClientEngineInitPhase extends InitPhase {
    public final LauncherEngine engine;

    public ClientEngineInitPhase(LauncherEngine engine) {
        this.engine = engine;
    }
}
