package pro.legion.launcher.request.auth.details;

import pro.legion.launcher.events.request.GetAvailabilityAuthRequestEvent;

public class AuthLoginOnlyDetails implements GetAvailabilityAuthRequestEvent.AuthAvailabilityDetails {
    @Override
    public String getType() {
        return "loginonly";
    }
}
