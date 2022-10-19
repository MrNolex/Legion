package pro.legion.launcher.request.auth.password;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.request.auth.AuthRequest;

public class AuthAESPassword implements AuthRequest.AuthPasswordInterface {
    @LauncherNetworkAPI
    public final byte[] password;

    public AuthAESPassword(byte[] aesEncryptedPassword) {
        this.password = aesEncryptedPassword;
    }

    @Override
    public boolean check() {
        return true;
    }
}
