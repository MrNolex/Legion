package pro.legion.launcher.request.update;

import pro.legion.launcher.events.request.ProfilesRequestEvent;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.websockets.WebSocketRequest;

public final class ProfilesRequest extends Request<ProfilesRequestEvent> implements WebSocketRequest {

    @Override
    public String getType() {
        return "profiles";
    }
}
