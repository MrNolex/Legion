package pro.legion.launcher.events.request;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.events.RequestEvent;
import pro.legion.launcher.profiles.PlayerProfile;

import java.util.UUID;


public class ProfileByUUIDRequestEvent extends RequestEvent {
    @SuppressWarnings("unused")
    private static final UUID uuid = UUID.fromString("b9014cf3-4b95-4d38-8c5f-867f190a18a0");
    @LauncherNetworkAPI
    public String error;
    @LauncherNetworkAPI
    public PlayerProfile playerProfile;

    public ProfileByUUIDRequestEvent(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }

    public ProfileByUUIDRequestEvent() {
    }

    @Override
    public String getType() {
        return "profileByUUID";
    }
}
