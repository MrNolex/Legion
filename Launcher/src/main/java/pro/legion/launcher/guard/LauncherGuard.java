package pro.legion.launcher.guard;

import pro.legion.launcher.client.ClientLauncherProcess;

public interface LauncherGuard {
    String getName();

    void applyGuardParams(ClientLauncherProcess process);
}
