package pro.legion.launchserver.modules.events;

import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launchserver.LaunchServer;

public class LaunchServerUpdatesSyncEvent extends LauncherModule.Event {
    public final LaunchServer server;

    public LaunchServerUpdatesSyncEvent(LaunchServer server) {
        this.server = server;
    }
}
