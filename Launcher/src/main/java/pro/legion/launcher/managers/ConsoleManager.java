package pro.legion.launcher.managers;

import pro.legion.launcher.Launcher;
import pro.legion.launcher.LauncherEngine;
import pro.legion.launcher.client.events.ClientUnlockConsoleEvent;
import pro.legion.launcher.console.UnlockCommand;
import pro.legion.launcher.console.test.PrintHardwareInfoCommand;
import pro.legion.utils.command.CommandHandler;
import pro.legion.utils.command.JLineCommandHandler;
import pro.legion.utils.command.StdCommandHandler;
import pro.legion.utils.command.basic.ClearCommand;
import pro.legion.utils.command.basic.DebugCommand;
import pro.legion.utils.command.basic.GCCommand;
import pro.legion.utils.command.basic.HelpCommand;
import pro.legion.utils.helper.CommonHelper;
import pro.legion.utils.helper.LogHelper;

import java.io.IOException;

public class ConsoleManager {
    public static CommandHandler handler;
    public static Thread thread;
    public static boolean isConsoleUnlock = false;

    public static void initConsole() throws IOException {
        CommandHandler localCommandHandler;
        try {
            Class.forName("org.jline.terminal.Terminal");

            // JLine2 available
            localCommandHandler = new JLineCommandHandler();
            LogHelper.info("JLine2 terminal enabled");
        } catch (ClassNotFoundException ignored) {
            localCommandHandler = new StdCommandHandler(true);
            LogHelper.warning("JLine2 isn't in classpath, using std");
        }
        handler = localCommandHandler;
        registerCommands();
        thread = CommonHelper.newThread("Launcher Console", true, handler);
        thread.start();
    }

    public static void registerCommands() {
        handler.registerCommand("help", new HelpCommand(handler));
        handler.registerCommand("gc", new GCCommand());
        handler.registerCommand("clear", new ClearCommand(handler));
        handler.registerCommand("unlock", new UnlockCommand());
        handler.registerCommand("printhardware", new PrintHardwareInfoCommand());
    }

    public static boolean checkUnlockKey(String key) {
        return key.equals(Launcher.getConfig().unlockSecret);
    }

    public static boolean unlock() {
        if (isConsoleUnlock) return true;
        ClientUnlockConsoleEvent event = new ClientUnlockConsoleEvent(handler);
        LauncherEngine.modulesManager.invokeEvent(event);
        if (event.isCancel()) return false;
        handler.registerCommand("debug", new DebugCommand());
        handler.unregisterCommand("unlock");
        isConsoleUnlock = true;
        return true;
    }
}
