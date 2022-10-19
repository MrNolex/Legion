package pro.legion.launcher.modules.events;

import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.request.RequestService;

public class OfflineModeEvent extends LauncherModule.Event {
    public RequestService service;

    public OfflineModeEvent(RequestService service) {
        this.service = service;
    }
}
