package pro.legion.launchserver.manangers;

import com.google.gson.GsonBuilder;
import marcono1234.gson.recordadapter.RecordTypeAdapterFactory;
import pro.legion.launcher.events.request.GetAvailabilityAuthRequestEvent;
import pro.legion.launcher.managers.GsonManager;
import pro.legion.launcher.modules.events.PreGsonPhase;
import pro.legion.launcher.profiles.optional.actions.OptionalAction;
import pro.legion.launcher.profiles.optional.triggers.OptionalTrigger;
import pro.legion.launcher.request.JsonResultSerializeAdapter;
import pro.legion.launcher.request.WebSocketEvent;
import pro.legion.launcher.request.auth.AuthRequest;
import pro.legion.launcher.request.auth.GetAvailabilityAuthRequest;
import pro.legion.launchserver.auth.core.AuthCoreProvider;
import pro.legion.launchserver.auth.password.PasswordVerifier;
import pro.legion.launchserver.auth.protect.ProtectHandler;
import pro.legion.launchserver.auth.texture.TextureProvider;
import pro.legion.launchserver.components.Component;
import pro.legion.launchserver.modules.impl.LaunchServerModulesManager;
import pro.legion.launchserver.socket.WebSocketService;
import pro.legion.launchserver.socket.response.UnknownResponse;
import pro.legion.launchserver.socket.response.WebSocketServerResponse;
import pro.legion.utils.UniversalJsonAdapter;

public class LaunchServerGsonManager extends GsonManager {
    private final LaunchServerModulesManager modulesManager;

    public LaunchServerGsonManager(LaunchServerModulesManager modulesManager) {
        this.modulesManager = modulesManager;
    }

    @Override
    public void registerAdapters(GsonBuilder builder) {
        super.registerAdapters(builder);
        builder.registerTypeAdapterFactory(RecordTypeAdapterFactory.builder()
                        .allowMissingComponentValues()
                        .create());
        builder.registerTypeAdapter(TextureProvider.class, new UniversalJsonAdapter<>(TextureProvider.providers));
        builder.registerTypeAdapter(AuthCoreProvider.class, new UniversalJsonAdapter<>(AuthCoreProvider.providers));
        builder.registerTypeAdapter(PasswordVerifier.class, new UniversalJsonAdapter<>(PasswordVerifier.providers));
        builder.registerTypeAdapter(Component.class, new UniversalJsonAdapter<>(Component.providers));
        builder.registerTypeAdapter(ProtectHandler.class, new UniversalJsonAdapter<>(ProtectHandler.providers));
        builder.registerTypeAdapter(WebSocketServerResponse.class, new UniversalJsonAdapter<>(WebSocketService.providers, UnknownResponse.class));
        builder.registerTypeAdapter(WebSocketEvent.class, new JsonResultSerializeAdapter());
        builder.registerTypeAdapter(AuthRequest.AuthPasswordInterface.class, new UniversalJsonAdapter<>(AuthRequest.providers));
        builder.registerTypeAdapter(GetAvailabilityAuthRequestEvent.AuthAvailabilityDetails.class, new UniversalJsonAdapter<>(GetAvailabilityAuthRequest.providers));
        builder.registerTypeAdapter(OptionalAction.class, new UniversalJsonAdapter<>(OptionalAction.providers));
        builder.registerTypeAdapter(OptionalTrigger.class, new UniversalJsonAdapter<>(OptionalTrigger.providers));
        modulesManager.invokeEvent(new PreGsonPhase(builder));
        //ClientWebSocketService.appendTypeAdapters(builder);
    }
}
