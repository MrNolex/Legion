package pro.gravit.launcher.guard;

import pro.gravit.launcher.client.ClientLauncherProcess;

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
