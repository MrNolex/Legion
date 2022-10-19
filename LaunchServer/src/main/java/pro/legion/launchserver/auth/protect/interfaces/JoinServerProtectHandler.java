package pro.legion.launchserver.auth.protect.interfaces;

import pro.legion.launchserver.socket.Client;

public interface JoinServerProtectHandler {
    default boolean onJoinServer(String serverID, String username, Client client) {
        return true;
    }
}
