package pro.legion.launcher.request.auth.password;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.request.auth.AuthRequest;

public class AuthPlainPassword implements AuthRequest.AuthPasswordInterface {
    @LauncherNetworkAPI
    public final String password;

    public AuthPlainPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean check() {
        return true;
    }
}
