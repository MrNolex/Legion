package pro.legion.launcher.client.events.client;

import pro.legion.launcher.client.ClientLauncherProcess;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.profiles.ClientProfile;

import java.util.Collection;

public class ClientProcessPreInvokeMainClassEvent extends LauncherModule.Event {
    public final ClientLauncherProcess.ClientParams params;
    public final ClientProfile profile;
    public final Collection<String> args;

    public ClientProcessPreInvokeMainClassEvent(ClientLauncherProcess.ClientParams params, ClientProfile profile, Collection<String> args) {
        this.params = params;
        this.profile = profile;
        this.args = args;
    }
}
