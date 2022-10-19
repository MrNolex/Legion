package pro.legion.launcher.request.auth;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.events.request.CheckServerRequestEvent;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.websockets.WebSocketRequest;
import pro.legion.utils.helper.VerifyHelper;

public final class CheckServerRequest extends Request<CheckServerRequestEvent> implements WebSocketRequest {
    @LauncherNetworkAPI
    public final String username;
    @LauncherNetworkAPI
    public final String serverID;


    public CheckServerRequest(String username, String serverID) {
        this.username = username;
        this.serverID = VerifyHelper.verifyServerID(serverID);
    }

    @Override
    public String getType() {
        return "checkServer";
    }
}
