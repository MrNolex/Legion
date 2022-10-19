package pro.legion.launcher.managers;

import com.google.gson.GsonBuilder;
import pro.legion.launcher.client.ClientModuleManager;
import pro.legion.launcher.client.UserSettings;
import pro.legion.launcher.modules.events.PreGsonPhase;
import pro.legion.launcher.request.websockets.ClientWebSocketService;
import pro.legion.utils.UniversalJsonAdapter;

public class ClientGsonManager extends GsonManager {
    private final ClientModuleManager moduleManager;

    public ClientGsonManager(ClientModuleManager moduleManager) {
        this.moduleManager = moduleManager;
    }

    @Override
    public void registerAdapters(GsonBuilder builder) {
        super.registerAdapters(builder);
        builder.registerTypeAdapter(UserSettings.class, new UniversalJsonAdapter<>(UserSettings.providers));
        ClientWebSocketService.appendTypeAdapters(builder);
        moduleManager.invokeEvent(new PreGsonPhase(builder));
    }
}
