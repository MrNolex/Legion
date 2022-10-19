package pro.legion.launcher.request.auth;

import pro.legion.launcher.events.request.GetPublicKeyRequestEvent;
import pro.legion.launcher.request.Request;

public class GetPublicKeyRequest extends Request<GetPublicKeyRequestEvent> {
    public GetPublicKeyRequest() {
    }

    @Override
    public String getType() {
        return "getPublicKey";
    }
}
