package pro.legion.launchserver.socket.response.management;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.request.GetPublicKeyRequestEvent;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;

public class GetPublicKeyResponse extends SimpleResponse {
    @Override
    public String getType() {
        return "getPublicKey";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) throws Exception {
        sendResult(new GetPublicKeyRequestEvent(server.keyAgreementManager.rsaPublicKey, server.keyAgreementManager.ecdsaPublicKey));
    }
}
