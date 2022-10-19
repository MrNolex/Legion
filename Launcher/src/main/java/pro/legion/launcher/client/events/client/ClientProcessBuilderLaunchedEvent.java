package pro.legion.launcher.client.events.client;

import pro.legion.launcher.client.ClientLauncherProcess;
import pro.legion.launcher.modules.LauncherModule;

public class ClientProcessBuilderLaunchedEvent extends LauncherModule.Event {
    public final ClientLauncherProcess processBuilder;

    public ClientProcessBuilderLaunchedEvent(ClientLauncherProcess processBuilder) {
        this.processBuilder = processBuilder;
    }
}
