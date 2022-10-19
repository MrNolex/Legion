package pro.legion.launcher.request.auth.password;

import pro.legion.launcher.request.auth.AuthRequest;

public class AuthTOTPPassword implements AuthRequest.AuthPasswordInterface {
    public String totp;

    @Override
    public boolean check() {
        return true;
    }
}
