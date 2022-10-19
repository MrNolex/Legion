package pro.legion.launchserver.socket.response;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.request.websockets.WebSocketRequest;
import pro.legion.launchserver.socket.Client;

public interface WebSocketServerResponse extends WebSocketRequest {
    String getType();

    void execute(ChannelHandlerContext ctx, Client client) throws Exception;
}
