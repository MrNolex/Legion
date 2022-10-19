package pro.legion.launchserver.socket.response.auth;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.request.FetchClientProfileKeyRequestEvent;
import pro.legion.launchserver.auth.core.User;
import pro.legion.launchserver.auth.core.UserSession;
import pro.legion.launchserver.auth.core.interfaces.session.UserSessionSupportKeys;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;

public class FetchClientProfileKeyResponse extends SimpleResponse {
    @Override
    public String getType() {
        return "clientProfileKey";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) throws Exception {
        if (!client.isAuth || client.type != AuthResponse.ConnectTypes.CLIENT) {
            sendError("Permissions denied");
            return;
        }
        UserSession session = client.sessionObject;
        UserSessionSupportKeys.ClientProfileKeys keys;
        if(session instanceof UserSessionSupportKeys support) {
            keys = support.getClientProfileKeys();
        } else {
            keys = server.authManager.createClientProfileKeys(client.uuid);
        }
        sendResult(new FetchClientProfileKeyRequestEvent(keys.publicKey(), keys.privateKey(), keys.signature(), keys.expiresAt(), keys.refreshedAfter()));
    }
}
