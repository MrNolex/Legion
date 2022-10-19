package pro.legion.launchserver.socket.response;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launchserver.socket.Client;

public class UnknownResponse extends SimpleResponse {
    @Override
    public String getType() {
        return "unknown";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) {
        sendError("This type of request is not supported");
    }
}
