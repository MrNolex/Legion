package pro.legion.launcher.events.request;

import pro.legion.launcher.events.RequestEvent;

public class HardwareReportRequestEvent extends RequestEvent {
    public String extendedToken;

    public HardwareReportRequestEvent() {
    }

    public HardwareReportRequestEvent(String extendedToken) {
        this.extendedToken = extendedToken;
    }

    @Override
    public String getType() {
        return "hardwareReport";
    }
}
