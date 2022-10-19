package pro.legion.launcher.impl;

import pro.legion.launcher.modules.LauncherInitContext;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.modules.LauncherModuleInfo;
import pro.legion.utils.Version;

public class ProvidedModule extends LauncherModule implements VirtualInterface {
    public ProvidedModule() {
        super(new LauncherModuleInfo("provided", new Version(1, 0, 0),
                0, new String[]{}, new String[]{"virtual"}));
    }

    @Override
    public void init(LauncherInitContext initContext) {

    }
}
