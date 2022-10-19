package pro.legion.launchserver.auth.core;

import pro.legion.launcher.ClientPermissions;

import java.util.UUID;

public interface User {
    String getUsername();

    UUID getUUID();

    String getServerId();

    String getAccessToken();

    ClientPermissions getPermissions();

    default boolean isBanned() {
        return false;
    }
}
