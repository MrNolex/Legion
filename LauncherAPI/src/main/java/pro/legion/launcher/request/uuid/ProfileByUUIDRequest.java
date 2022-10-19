package pro.legion.launcher.request.uuid;

import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launcher.events.request.ProfileByUUIDRequestEvent;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.websockets.WebSocketRequest;

import java.util.Objects;
import java.util.UUID;

public final class ProfileByUUIDRequest extends Request<ProfileByUUIDRequestEvent> implements WebSocketRequest {
    @LauncherNetworkAPI
    public final UUID uuid;


    public ProfileByUUIDRequest(UUID uuid) {
        this.uuid = Objects.requireNonNull(uuid, "uuid");
    }

    @Override
    public String getType() {
        return "profileByUUID";
    }
}
