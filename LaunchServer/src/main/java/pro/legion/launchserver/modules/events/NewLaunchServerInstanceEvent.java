package pro.legion.launchserver.modules.events;

import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launchserver.LaunchServer;

public class NewLaunchServerInstanceEvent extends LauncherModule.Event {
    public final LaunchServer launchServer;

    public NewLaunchServerInstanceEvent(LaunchServer launchServer) {
        this.launchServer = launchServer;
    }
}
