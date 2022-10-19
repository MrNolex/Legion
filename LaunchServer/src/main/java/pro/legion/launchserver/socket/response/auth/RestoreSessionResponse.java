package pro.legion.launchserver.socket.response.auth;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.LauncherNetworkAPI;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;

import java.util.UUID;

public class RestoreSessionResponse extends SimpleResponse {
    @LauncherNetworkAPI
    public UUID session;
    public boolean needUserInfo;

    @Override
    public String getType() {
        return "restoreSession";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) throws Exception {
        sendError("Legacy session system removed");
    }
}
