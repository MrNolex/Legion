package pro.legion.launchserver.command.handler;

import pro.legion.launchserver.LaunchServer;
import pro.legion.launchserver.command.basic.*;
import pro.legion.launchserver.command.hash.*;
import pro.legion.launchserver.command.modules.LoadModuleCommand;
import pro.legion.launchserver.command.modules.ModulesCommand;
import pro.legion.launchserver.command.service.*;
import pro.legion.utils.command.BaseCommandCategory;
import pro.legion.utils.command.basic.ClearCommand;
import pro.legion.utils.command.basic.GCCommand;
import pro.legion.utils.command.basic.HelpCommand;

public abstract class CommandHandler extends pro.legion.utils.command.CommandHandler {
    @SuppressWarnings("deprecation")
    public static void registerCommands(pro.legion.utils.command.CommandHandler handler, LaunchServer server) {
        BaseCommandCategory basic = new BaseCommandCategory();
        // Register basic commands
        basic.registerCommand("help", new HelpCommand(handler));
        basic.registerCommand("version", new VersionCommand(server));
        basic.registerCommand("build", new BuildCommand(server));
        basic.registerCommand("stop", new StopCommand(server));
        basic.registerCommand("restart", new RestartCommand(server));
        basic.registerCommand("debug", new DebugCommand(server));
        basic.registerCommand("clear", new ClearCommand(handler));
        basic.registerCommand("gc", new GCCommand());
        basic.registerCommand("loadModule", new LoadModuleCommand(server));
        basic.registerCommand("modules", new ModulesCommand(server));
        Category basicCategory = new Category(basic, "basic", "Base LaunchServer commands");
        handler.registerCategory(basicCategory);

        // Register sync commands
        BaseCommandCategory updates = new BaseCommandCategory();
        updates.registerCommand("indexAsset", new IndexAssetCommand(server));
        updates.registerCommand("unindexAsset", new UnindexAssetCommand(server));
        updates.registerCommand("downloadAsset", new DownloadAssetCommand(server));
        updates.registerCommand("downloadClient", new DownloadClientCommand(server));
        updates.registerCommand("syncBinaries", new SyncBinariesCommand(server));
        updates.registerCommand("syncUpdates", new SyncUpdatesCommand(server));
        updates.registerCommand("syncProfiles", new SyncProfilesCommand(server));
        updates.registerCommand("syncUP", new SyncUPCommand(server));
        updates.registerCommand("saveProfiles", new SaveProfilesCommand(server));
        updates.registerCommand("makeProfile", new MakeProfileCommand(server));
        Category updatesCategory = new Category(updates, "updates", "Update and Sync Management");
        handler.registerCategory(updatesCategory);

        //Register service commands
        BaseCommandCategory service = new BaseCommandCategory();
        service.registerCommand("config", new ConfigCommand(server));
        service.registerCommand("serverStatus", new ServerStatusCommand(server));
        service.registerCommand("notify", new NotifyCommand(server));
        service.registerCommand("component", new ComponentCommand(server));
        service.registerCommand("clients", new ClientsCommand(server));
        service.registerCommand("signJar", new SignJarCommand(server));
        service.registerCommand("signDir", new SignDirCommand(server));
        service.registerCommand("securitycheck", new SecurityCheckCommand(server));
        service.registerCommand("token", new TokenCommand(server));
        Category serviceCategory = new Category(service, "service", "Managing LaunchServer Components");
        handler.registerCategory(serviceCategory);
    }
}
