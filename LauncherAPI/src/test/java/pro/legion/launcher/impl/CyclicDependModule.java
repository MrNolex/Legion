package pro.legion.launcher.impl;

import pro.legion.launcher.modules.LauncherInitContext;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.modules.LauncherModuleInfo;
import pro.legion.utils.Version;

public class CyclicDependModule extends LauncherModule {
    public CyclicDependModule() {
        super(new LauncherModuleInfo("cyclic1",
                new Version(1, 0, 0),
                2, new String[]{"cyclic2"}));
    }

    @Override
    public void init(LauncherInitContext initContext) {

    }
}
