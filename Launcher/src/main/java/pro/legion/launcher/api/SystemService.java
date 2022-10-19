package pro.legion.launcher.api;

import pro.legion.launcher.LauncherEngine;
import pro.legion.launcher.profiles.ClientProfile;
import pro.legion.utils.helper.LogHelper;

public class SystemService {
    private SystemService() {
        throw new UnsupportedOperationException();
    }

    public static void exit(int code) {
        LauncherEngine.exitLauncher(code);
    }
}
