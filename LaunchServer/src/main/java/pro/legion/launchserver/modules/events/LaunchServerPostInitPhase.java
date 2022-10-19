package pro.legion.launchserver.modules.events;

import pro.legion.launcher.modules.events.PostInitPhase;
import pro.legion.launchserver.LaunchServer;

public class LaunchServerPostInitPhase extends PostInitPhase {
    public final LaunchServer server;

    public LaunchServerPostInitPhase(LaunchServer server) {
        this.server = server;
    }
}
