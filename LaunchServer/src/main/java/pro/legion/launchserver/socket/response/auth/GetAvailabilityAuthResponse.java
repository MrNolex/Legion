package pro.legion.launchserver.socket.response.auth;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.request.GetAvailabilityAuthRequestEvent;
import pro.legion.launchserver.auth.AuthProviderPair;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;

import java.util.ArrayList;
import java.util.List;

public class GetAvailabilityAuthResponse extends SimpleResponse {
    @Override
    public String getType() {
        return "getAvailabilityAuth";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) {
        List<GetAvailabilityAuthRequestEvent.AuthAvailability> list = new ArrayList<>();
        for (AuthProviderPair pair : server.config.auth.values()) {
            list.add(new GetAvailabilityAuthRequestEvent.AuthAvailability(pair.name, pair.displayName,
                    pair.core.getDetails(client)));
        }
        sendResult(new GetAvailabilityAuthRequestEvent(list));
    }
}
