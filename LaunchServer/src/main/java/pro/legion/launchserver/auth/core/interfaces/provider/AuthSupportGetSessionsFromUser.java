package pro.legion.launchserver.auth.core.interfaces.provider;

import pro.legion.launchserver.auth.Feature;
import pro.legion.launchserver.auth.core.User;
import pro.legion.launchserver.auth.core.UserSession;

import java.util.List;

@Feature("sessions")
public interface AuthSupportGetSessionsFromUser extends AuthSupport {
    List<UserSession> getSessionsByUser(User user);
}
