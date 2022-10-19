package pro.legion.launchserver.socket.response.auth;

import io.netty.channel.ChannelHandlerContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pro.legion.launcher.events.request.JoinServerRequestEvent;
import pro.legion.launchserver.auth.AuthException;
import pro.legion.launchserver.auth.protect.interfaces.JoinServerProtectHandler;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;
import pro.legion.utils.HookException;

public class JoinServerResponse extends SimpleResponse {
    private transient final Logger logger = LogManager.getLogger();
    public String serverID;
    public String accessToken;
    public String username;

    @Override
    public String getType() {
        return "joinServer";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) {
        if (!client.isAuth || client.type != AuthResponse.ConnectTypes.CLIENT) {
            sendError("Permissions denied");
            return;
        }
        if (username == null || accessToken == null || serverID == null) {
            sendError("Invalid request");
            return;
        }
        boolean success;
        try {
            server.authHookManager.joinServerHook.hook(this, client);
            if (server.config.protectHandler instanceof JoinServerProtectHandler) {
                success = ((JoinServerProtectHandler) server.config.protectHandler).onJoinServer(serverID, username, client);
                if (!success) {
                    sendResult(new JoinServerRequestEvent(false));
                    return;
                }
            }
            success = server.authManager.joinServer(client, username, accessToken, serverID);
            if (success) {
                logger.debug("joinServer: {} accessToken: {} serverID: {}", username, accessToken, serverID);
            }
        } catch (AuthException | HookException | SecurityException e) {
            sendError(e.getMessage());
            return;
        } catch (Exception e) {
            logger.error("Join Server error", e);
            sendError("Internal authHandler error");
            return;
        }
        sendResult(new JoinServerRequestEvent(success));
    }

}
