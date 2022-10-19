package pro.legion.launchserver.command.basic;

import pro.legion.launchserver.LaunchServer;
import pro.legion.launchserver.command.Command;

public final class RestartCommand extends Command {
    public RestartCommand(LaunchServer server) {
        super(server);
    }

    @Override
    public String getArgsDescription() {
        return null;
    }

    @Override
    public String getUsageDescription() {
        return "Restart LaunchServer";
    }

    @Override
    public void invoke(String... args) {
        server.fullyRestart();
    }
}