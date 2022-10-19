package pro.legion.launcher.client.events.client;

import pro.legion.launcher.LauncherEngine;
import pro.legion.launcher.client.ClientLauncherProcess;
import pro.legion.launcher.modules.LauncherModule;

public class ClientProcessLaunchEvent extends LauncherModule.Event {
    public final LauncherEngine clientInstance;
    public final ClientLauncherProcess.ClientParams params;

    public ClientProcessLaunchEvent(LauncherEngine clientInstance, ClientLauncherProcess.ClientParams params) {
        this.clientInstance = clientInstance;
        this.params = params;
    }
}
