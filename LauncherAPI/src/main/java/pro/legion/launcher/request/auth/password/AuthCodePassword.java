package pro.legion.launcher.request.auth.password;

import pro.legion.launcher.request.auth.AuthRequest;

public class AuthCodePassword implements AuthRequest.AuthPasswordInterface {
    public final String code;

    public AuthCodePassword(String code) {
        this.code = code;
    }

    @Override
    public boolean check() {
        return true;
    }
}
