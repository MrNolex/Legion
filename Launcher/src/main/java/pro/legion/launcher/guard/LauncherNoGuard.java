package pro.legion.launcher.guard;

import pro.legion.launcher.client.ClientLauncherProcess;

public class LauncherNoGuard implements LauncherGuard {
    @Override
    public String getName() {
        return "noGuard";
    }

    @Override
    public void applyGuardParams(ClientLauncherProcess process) {
        //IGNORED
    }
}
