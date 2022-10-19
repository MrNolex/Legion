package pro.legion.launcher.request.management;

import pro.legion.launcher.events.request.FeaturesRequestEvent;
import pro.legion.launcher.request.Request;

public class FeaturesRequest extends Request<FeaturesRequestEvent> {
    @Override
    public String getType() {
        return "features";
    }
}
