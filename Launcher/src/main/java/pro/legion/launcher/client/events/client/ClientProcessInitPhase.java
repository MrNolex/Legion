package pro.legion.launcher.client.events.client;

import pro.legion.launcher.LauncherEngine;
import pro.legion.launcher.client.ClientLauncherProcess;
import pro.legion.launcher.modules.events.InitPhase;

public class ClientProcessInitPhase extends InitPhase {
    public final LauncherEngine clientInstance;
    public final ClientLauncherProcess.ClientParams params;

    public ClientProcessInitPhase(LauncherEngine clientInstance, ClientLauncherProcess.ClientParams params) {
        this.clientInstance = clientInstance;
        this.params = params;
    }
}
