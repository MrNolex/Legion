package pro.legion.launcher.api;

import pro.legion.launcher.ClientPermissions;
import pro.legion.launcher.profiles.ClientProfile;

import java.util.UUID;

public class AuthService {
    public static String username;
    public static ClientPermissions permissions = new ClientPermissions();
    public static UUID uuid;
    public static ClientProfile profile;

    public static boolean hasPermission(String permission) {
        return permissions.hasPerm(permission);
    }
}
