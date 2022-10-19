package pro.legion.launcher.client.events;

import pro.legion.launcher.modules.LauncherModule;
import pro.legion.utils.command.CommandHandler;

public class ClientUnlockConsoleEvent extends LauncherModule.Event {
    public final CommandHandler handler;

    public ClientUnlockConsoleEvent(CommandHandler handler) {
        this.handler = handler;
    }
}
