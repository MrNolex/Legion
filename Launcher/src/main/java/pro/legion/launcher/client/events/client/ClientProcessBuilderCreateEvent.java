package pro.legion.launcher.client.events.client;

import pro.legion.launcher.client.ClientLauncherProcess;
import pro.legion.launcher.modules.LauncherModule;

public class ClientProcessBuilderCreateEvent extends LauncherModule.Event {
    public final ClientLauncherProcess processBuilder;

    public ClientProcessBuilderCreateEvent(ClientLauncherProcess processBuilder) {
        this.processBuilder = processBuilder;
    }
}
