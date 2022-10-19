package pro.legion.launcher.request.management;

import pro.legion.launcher.events.request.ServerStatusRequestEvent;
import pro.legion.launcher.request.Request;

public class ServerStatusRequest extends Request<ServerStatusRequestEvent> {
    @Override
    public String getType() {
        return "serverStatus";
    }
}
