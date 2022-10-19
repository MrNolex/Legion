package pro.legion.launchserver.auth.core.interfaces.provider;

import pro.legion.launchserver.auth.Feature;
import pro.legion.launchserver.auth.core.User;

@Feature("users")
public interface AuthSupportGetAllUsers extends AuthSupport {
    Iterable<User> getAllUsers();
}
