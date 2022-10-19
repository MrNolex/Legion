package pro.legion.launcher.request.auth;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.events.request.SetProfileRequestEvent;
import pro.legion.launcher.profiles.ClientProfile;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.websockets.WebSocketRequest;

public class SetProfileRequest extends Request<SetProfileRequestEvent> implements WebSocketRequest {
    @LauncherNetworkAPI
    public final String client;

    public SetProfileRequest(ClientProfile profile) {
        this.client = profile.getTitle();
    }

    @Override
    public String getType() {
        return "setProfile";
    }
}
