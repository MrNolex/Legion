package pro.legion.launcher.request.auth;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.events.request.JoinServerRequestEvent;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.websockets.WebSocketRequest;
import pro.legion.utils.helper.VerifyHelper;

public final class JoinServerRequest extends Request<JoinServerRequestEvent> implements WebSocketRequest {

    // Instance
    @LauncherNetworkAPI
    public final String username;
    @LauncherNetworkAPI
    public final String accessToken;
    @LauncherNetworkAPI
    public final String serverID;


    public JoinServerRequest(String username, String accessToken, String serverID) {
        this.username = username;
        this.accessToken = accessToken;
        this.serverID = VerifyHelper.verifyServerID(serverID);
    }

    @Override
    public String getType() {
        return "joinServer";
    }
}
