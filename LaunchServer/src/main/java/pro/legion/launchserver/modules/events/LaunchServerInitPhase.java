package pro.legion.launchserver.modules.events;

import pro.legion.launcher.modules.events.InitPhase;
import pro.legion.launchserver.LaunchServer;

public class LaunchServerInitPhase extends InitPhase {
    public final LaunchServer server;

    public LaunchServerInitPhase(LaunchServer server) {
        this.server = server;
    }
}
