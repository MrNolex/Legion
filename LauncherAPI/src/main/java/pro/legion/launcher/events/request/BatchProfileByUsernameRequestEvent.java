package pro.legion.launcher.events.request;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.events.RequestEvent;
import pro.legion.launcher.profiles.PlayerProfile;

public class BatchProfileByUsernameRequestEvent extends RequestEvent {
    @LauncherNetworkAPI
    public String error;
    @LauncherNetworkAPI
    public PlayerProfile[] playerProfiles;

    public BatchProfileByUsernameRequestEvent(PlayerProfile[] profiles) {
        this.playerProfiles = profiles;
    }

    public BatchProfileByUsernameRequestEvent() {
    }

    @Override
    public String getType() {
        return "batchProfileByUsername";
    }
}
