package pro.legion.launcher.events.request;

import pro.legion.launcher.ClientPermissions;
import pro.legion.launcher.events.RequestEvent;
import pro.legion.launcher.profiles.PlayerProfile;

public class CurrentUserRequestEvent extends RequestEvent {
    public final UserInfo userInfo;

    public CurrentUserRequestEvent(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String getType() {
        return "currentUser";
    }

    public static class UserInfo {
        public ClientPermissions permissions;
        public String accessToken;
        public PlayerProfile playerProfile;
    }
}
