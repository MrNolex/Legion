package pro.legion.launcher.request.update;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.events.request.UpdateRequestEvent;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.websockets.WebSocketRequest;

public final class UpdateRequest extends Request<UpdateRequestEvent> implements WebSocketRequest {

    // Instance
    @LauncherNetworkAPI
    public final String dirName;

    public UpdateRequest(String dirName) {
        this.dirName = dirName;
    }

    @Override
    public String getType() {
        return "update";
    }
}
