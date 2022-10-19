package pro.legion.launchserver.modules.events;

import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launchserver.LaunchServer;

public class LaunchServerProfilesSyncEvent extends LauncherModule.Event {
    public final LaunchServer server;

    public LaunchServerProfilesSyncEvent(LaunchServer server) {
        this.server = server;
    }
}
