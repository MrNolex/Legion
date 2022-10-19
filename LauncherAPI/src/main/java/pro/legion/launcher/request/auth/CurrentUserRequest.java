package pro.legion.launcher.request.auth;

import pro.legion.launcher.events.request.CurrentUserRequestEvent;
import pro.legion.launcher.request.Request;

public class CurrentUserRequest extends Request<CurrentUserRequestEvent> {
    @Override
    public String getType() {
        return "currentUser";
    }
}
