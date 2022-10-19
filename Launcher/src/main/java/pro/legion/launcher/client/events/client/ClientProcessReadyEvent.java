package pro.legion.launcher.client.events.client;

import pro.legion.launcher.LauncherEngine;
import pro.legion.launcher.client.ClientLauncherProcess;
import pro.legion.launcher.modules.events.PostInitPhase;

public class ClientProcessReadyEvent extends PostInitPhase {
    public final LauncherEngine clientInstance;
    public final ClientLauncherProcess.ClientParams params;

    public ClientProcessReadyEvent(LauncherEngine clientInstance, ClientLauncherProcess.ClientParams params) {
        this.clientInstance = clientInstance;
        this.params = params;
    }
}
