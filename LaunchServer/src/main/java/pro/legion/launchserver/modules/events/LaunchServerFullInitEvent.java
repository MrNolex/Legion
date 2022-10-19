package pro.legion.launchserver.modules.events;

import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launchserver.LaunchServer;

public class LaunchServerFullInitEvent extends LauncherModule.Event {
    public final LaunchServer server;

    public LaunchServerFullInitEvent(LaunchServer server) {
        this.server = server;
    }
}
