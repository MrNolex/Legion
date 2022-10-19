package pro.legion.launcher.request.uuid;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.events.request.ProfileByUsernameRequestEvent;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.websockets.WebSocketRequest;
import pro.legion.utils.helper.VerifyHelper;

public final class ProfileByUsernameRequest extends Request<ProfileByUsernameRequestEvent> implements WebSocketRequest {
    @LauncherNetworkAPI
    public final String username;


    public ProfileByUsernameRequest(String username) {
        this.username = username;
    }

    @Override
    public String getType() {
        return "profileByUsername";
    }
}
