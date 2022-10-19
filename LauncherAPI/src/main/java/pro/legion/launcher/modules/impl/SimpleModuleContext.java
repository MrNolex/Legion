package pro.legion.launcher.modules.impl;

import pro.legion.launcher.modules.LauncherModulesContext;
import pro.legion.launcher.modules.LauncherModulesManager;
import pro.legion.launcher.modules.ModulesConfigManager;

public class SimpleModuleContext implements LauncherModulesContext {
    public final LauncherModulesManager modulesManager;
    public final ModulesConfigManager configManager;

    public SimpleModuleContext(LauncherModulesManager modulesManager, ModulesConfigManager configManager) {
        this.modulesManager = modulesManager;
        this.configManager = configManager;
    }

    @Override
    public LauncherModulesManager getModulesManager() {
        return modulesManager;
    }

    @Override
    public ModulesConfigManager getModulesConfigManager() {
        return configManager;
    }
}
