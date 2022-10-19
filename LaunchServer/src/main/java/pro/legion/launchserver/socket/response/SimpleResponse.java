package pro.legion.launchserver.socket.response;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.RequestEvent;
import pro.legion.launcher.events.request.ErrorRequestEvent;
import pro.legion.launchserver.LaunchServer;
import pro.legion.launchserver.socket.WebSocketService;

import java.util.UUID;

public abstract class SimpleResponse implements WebSocketServerResponse {
    public UUID requestUUID;
    public transient LaunchServer server;
    public transient WebSocketService service;
    public transient ChannelHandlerContext ctx;
    public transient String ip;

    public void sendResult(RequestEvent result) {
        result.requestUUID = requestUUID;
        service.sendObject(ctx, result);
    }

    public void sendResultAndClose(RequestEvent result) {
        result.requestUUID = requestUUID;
        service.sendObjectAndClose(ctx, result);
    }

    public void sendError(String errorMessage) {
        ErrorRequestEvent event = new ErrorRequestEvent(errorMessage);
        event.requestUUID = requestUUID;
        service.sendObject(ctx, event);
    }
}
