package pro.legion.launcher.profiles.optional.triggers;

import pro.legion.launcher.ClientPermissions;
import pro.legion.launcher.profiles.ClientProfile;
import pro.legion.launcher.profiles.PlayerProfile;
import pro.legion.utils.helper.JavaHelper;

public interface OptionalTriggerContext {
    ClientProfile getProfile();

    String getUsername();

    JavaHelper.JavaVersion getJavaVersion();

    default ClientPermissions getPermissions() {
        return ClientPermissions.DEFAULT;
    }

    default PlayerProfile getPlayerProfile() {
        return null;
    }
}
