package pro.legion.launchserver.socket.response.management;

import io.netty.channel.ChannelHandlerContext;
import pro.legion.launcher.events.request.ServerStatusRequestEvent;
import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.SimpleResponse;
import pro.legion.utils.helper.JVMHelper;

public class ServerStatusResponse extends SimpleResponse {
    @Override
    public String getType() {
        return "serverStatus";
    }

    @Override
    public void execute(ChannelHandlerContext ctx, Client client) {
        ServerStatusRequestEvent event = new ServerStatusRequestEvent(server.config.projectName);
        event.totalJavaMemory = JVMHelper.RUNTIME.totalMemory();
        event.freeJavaMemory = JVMHelper.RUNTIME.freeMemory();
        event.shortLatency = (service.shortRequestLatency.get() / service.shortRequestCounter.get()) / 1_000_000;
        event.middleLatency = (service.middleRequestLatency.get() / service.middleRequestCounter.get()) / 1_000_000;
        event.longLatency = (service.longRequestLatency.get() / service.longRequestCounter.get()) / 1_000_000;
        event.latency = ((service.shortRequestLatency.get() + service.middleRequestLatency.get() + service.longRequestLatency.get()) /
                (service.shortRequestCounter.get() + service.middleRequestCounter.get() + service.longRequestCounter.get())) / 1_000_000;
        sendResult(event);
    }
}
