package pro.legion.launcher.client.events.client;

import pro.legion.launcher.client.ClientLauncherProcess;
import pro.legion.launcher.modules.LauncherModule;

public class ClientProcessBuilderPreLaunchEvent extends LauncherModule.Event {
    public final ClientLauncherProcess processBuilder;

    public ClientProcessBuilderPreLaunchEvent(ClientLauncherProcess processBuilder) {
        this.processBuilder = processBuilder;
    }
}
