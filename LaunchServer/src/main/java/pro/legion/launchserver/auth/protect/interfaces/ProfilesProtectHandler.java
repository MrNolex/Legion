package pro.legion.launchserver.auth.protect.interfaces;

import pro.legion.launcher.profiles.ClientProfile;
import pro.legion.launchserver.socket.Client;

public interface ProfilesProtectHandler {
    default boolean canGetProfiles(Client client) {
        return true;
    }

    default boolean canGetProfile(ClientProfile profile, Client client) {
        return true;
    }

    default boolean canChangeProfile(ClientProfile profile, Client client) {
        return client.isAuth;
    }

    default boolean canGetUpdates(String updatesDirName, Client client) {
        return true;
    }
}
