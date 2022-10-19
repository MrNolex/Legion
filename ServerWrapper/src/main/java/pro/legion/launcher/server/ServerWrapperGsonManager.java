package pro.legion.launcher.server;

import com.google.gson.GsonBuilder;
import pro.legion.launcher.managers.GsonManager;
import pro.legion.launcher.modules.events.PreGsonPhase;
import pro.legion.launcher.request.websockets.ClientWebSocketService;

public class ServerWrapperGsonManager extends GsonManager {

    public ServerWrapperGsonManager() {
    }

    @Override
    public void registerAdapters(GsonBuilder builder) {
        super.registerAdapters(builder);
        ClientWebSocketService.appendTypeAdapters(builder);
    }
}
