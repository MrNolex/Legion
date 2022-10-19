package pro.legion.launcher.request.secure;

import pro.legion.launcher.events.request.GetSecureLevelInfoRequestEvent;
import pro.legion.launcher.request.Request;

public class GetSecureLevelInfoRequest extends Request<GetSecureLevelInfoRequestEvent> {
    @Override
    public String getType() {
        return "getSecureLevelInfo";
    }
}
