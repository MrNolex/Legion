package pro.legion.launcher.request.auth;

import pro.legion.launcher.events.request.FetchClientProfileKeyRequestEvent;
import pro.legion.launcher.request.Request;

public class FetchClientProfileKeyRequest extends Request<FetchClientProfileKeyRequestEvent> {
    public FetchClientProfileKeyRequest() {
    }

    @Override
    public String getType() {
        return "clientProfileKey";
    }
}
