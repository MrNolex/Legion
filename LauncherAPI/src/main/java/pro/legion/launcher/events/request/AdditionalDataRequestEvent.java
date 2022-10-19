package pro.legion.launcher.events.request;

import pro.legion.launcher.events.RequestEvent;

import java.util.Map;

public class AdditionalDataRequestEvent extends RequestEvent {
    public Map<String, String> data;

    public AdditionalDataRequestEvent() {
    }

    public AdditionalDataRequestEvent(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public String getType() {
        return "additionalData";
    }
}
