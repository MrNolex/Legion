package pro.legion.launchserver.socket.response.management;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.request.FeaturesRequestEvent;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;

public class FeaturesResponse extends SimpleResponse {
    @Override
    public String getType() {
        return "features";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) {
        sendResult(new FeaturesRequestEvent(server.featuresManager.getMap()));
    }
}
