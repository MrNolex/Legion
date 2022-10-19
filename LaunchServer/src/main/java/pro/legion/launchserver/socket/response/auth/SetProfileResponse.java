package pro.legion.launchserver.socket.response.auth;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.request.SetProfileRequestEvent;
import pro.legion.launcher.profiles.ClientProfile;
import pro.legion.launchserver.auth.protect.interfaces.ProfilesProtectHandler;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;
import pro.legion.utils.HookException;

import java.util.Collection;

public class SetProfileResponse extends SimpleResponse {
    public String client;

    @Override
    public String getType() {
        return "setProfile";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) {
        try {
            server.authHookManager.setProfileHook.hook(this, client);
        } catch (HookException e) {
            sendError(e.getMessage());
        }
        Collection<ClientProfile> profiles = server.getProfiles();
        for (ClientProfile p : profiles) {
            if (p.getTitle().equals(this.client)) {
                if (server.config.protectHandler instanceof ProfilesProtectHandler &&
                        !((ProfilesProtectHandler) server.config.protectHandler).canChangeProfile(p, client)) {
                    sendError("Access denied");
                    return;
                }
                client.profile = p;
                sendResult(new SetProfileRequestEvent(p));
                return;
            }
        }
        sendError("Profile not found");
    }
}
