package pro.legion.launchserver.socket.response.auth;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.request.ProfilesRequestEvent;
import pro.legion.launcher.profiles.ClientProfile;
import pro.legion.launchserver.auth.protect.interfaces.ProfilesProtectHandler;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProfilesResponse extends SimpleResponse {
    @Override
    public String getType() {
        return "profiles";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) {
        if (server.config.protectHandler instanceof ProfilesProtectHandler && !((ProfilesProtectHandler) server.config.protectHandler).canGetProfiles(client)) {
            sendError("Access denied");
            return;
        }

        List<ClientProfile> profileList;
        Set<ClientProfile> serverProfiles = server.getProfiles();
        if (server.config.protectHandler instanceof ProfilesProtectHandler protectHandler) {
            profileList = new ArrayList<>(4);
            for (ClientProfile profile : serverProfiles) {
                if (protectHandler.canGetProfile(profile, client)) {
                    profileList.add(profile);
                }
            }
        } else {
            profileList = List.copyOf(serverProfiles);
        }
        sendResult(new ProfilesRequestEvent(profileList));
    }
}
