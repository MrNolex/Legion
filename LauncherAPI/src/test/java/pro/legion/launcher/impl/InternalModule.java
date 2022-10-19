package pro.legion.launcher.impl;

import pro.legion.launcher.modules.LauncherInitContext;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.modules.LauncherModuleInfo;

public class InternalModule extends LauncherModule {
    public InternalModule() {
        super(new LauncherModuleInfo("internal"));
    }

    @Override
    public void init(LauncherInitContext initContext) {
    }
}
