package pro.legion.launcher.request.auth.details;

import pro.legion.launcher.events.request.GetAvailabilityAuthRequestEvent;

public class AuthPasswordDetails implements GetAvailabilityAuthRequestEvent.AuthAvailabilityDetails {
    @Override
    public String getType() {
        return "password";
    }


}
