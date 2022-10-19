package pro.legion.launchserver.socket.response.auth;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.request.CurrentUserRequestEvent;
import pro.legion.launchserver.LaunchServer;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;

import java.io.IOException;

public class CurrentUserResponse extends SimpleResponse {

    public static CurrentUserRequestEvent.UserInfo collectUserInfoFromClient(LaunchServer server, Client client) throws IOException {
        CurrentUserRequestEvent.UserInfo result = new CurrentUserRequestEvent.UserInfo();
        if (client.auth != null && client.isAuth && client.username != null) {
            result.playerProfile = server.authManager.getPlayerProfile(client);
        }
        result.permissions = client.permissions;
        return result;
    }

    @Override
    public String getType() {
        return "currentUser";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) throws Exception {
        sendResult(new CurrentUserRequestEvent(collectUserInfoFromClient(server, client)));
    }
}
