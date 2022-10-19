package pro.legion.launchserver.auth.core.interfaces.provider;

import pro.legion.launcher.request.auth.AuthRequest;
import pro.legion.launchserver.auth.Feature;
import pro.legion.launchserver.auth.core.User;

import java.util.Map;

@Feature("registration")
public interface AuthSupportRegistration extends AuthSupport {
    User registration(String login, String email, AuthRequest.AuthPasswordInterface password, Map<String, String> properties);
}
