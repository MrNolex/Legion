package pro.legion.launchserver.auth.core.interfaces.provider;

import pro.legion.launchserver.auth.core.User;
import pro.legion.launchserver.auth.core.interfaces.user.UserSupportBanInfo;

import java.time.LocalDateTime;

public interface AuthSupportUserBan extends AuthSupport {
    UserSupportBanInfo.UserBanInfo banUser(User user, String reason, String moderator, LocalDateTime startTime, LocalDateTime endTime);

    default UserSupportBanInfo.UserBanInfo banUser(User user) {
        return banUser(user, null, null, LocalDateTime.now(), null);
    }

    void unbanUser(User user);

    default UserSupportBanInfo fetchUserBanInfo(User user) {
        return (UserSupportBanInfo) user;
    }
}
