package pro.legion.launcher.request.update;

import pro.legion.launcher.events.request.UpdateListRequestEvent;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.websockets.WebSocketRequest;

public final class UpdateListRequest extends Request<UpdateListRequestEvent> implements WebSocketRequest {

    @Override
    public String getType() {
        return "updateList";
    }
}
