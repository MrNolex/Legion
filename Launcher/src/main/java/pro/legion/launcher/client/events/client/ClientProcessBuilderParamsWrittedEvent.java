package pro.legion.launcher.client.events.client;

import pro.legion.launcher.client.ClientLauncherProcess;
import pro.legion.launcher.modules.LauncherModule;

public class ClientProcessBuilderParamsWrittedEvent extends LauncherModule.Event {
    public final ClientLauncherProcess process;

    public ClientProcessBuilderParamsWrittedEvent(ClientLauncherProcess process) {
        this.process = process;
    }
}
