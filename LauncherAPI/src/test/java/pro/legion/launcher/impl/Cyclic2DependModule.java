package pro.legion.launcher.impl;

import pro.legion.launcher.modules.LauncherInitContext;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.modules.LauncherModuleInfo;
import pro.legion.utils.Version;

public class Cyclic2DependModule extends LauncherModule {
    public Cyclic2DependModule() {
        super(new LauncherModuleInfo("cyclic2",
                new Version(1, 0, 0),
                2, new String[]{"cyclic1"}));
    }

    @Override
    public void init(LauncherInitContext initContext) {

    }
}
