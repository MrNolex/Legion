package pro.legion.launchserver.modules.events.security;

import pro.legion.launcher.events.request.SecurityReportRequestEvent;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.secure.SecurityReportResponse;

public class SecurityReportModuleEvent extends LauncherModule.Event {
    public final SecurityReportRequestEvent event;
    public final SecurityReportResponse response;
    public final Client client;

    public SecurityReportModuleEvent(SecurityReportRequestEvent event, SecurityReportResponse response, Client client) {
        this.event = event;
        this.response = response;
        this.client = client;
    }
}
