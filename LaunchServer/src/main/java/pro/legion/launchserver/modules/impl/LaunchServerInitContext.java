package pro.legion.launchserver.modules.impl;

import pro.legion.launcher.modules.LauncherInitContext;
import pro.legion.launchserver.LaunchServer;

public class LaunchServerInitContext implements LauncherInitContext {
    public final LaunchServer server;

    public LaunchServerInitContext(LaunchServer server) {
        this.server = server;
    }
}
