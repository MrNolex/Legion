package pro.legion.launchserver.modules.impl;

import pro.legion.launcher.modules.LauncherInitContext;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.modules.LauncherModuleInfo;
import pro.legion.launcher.modules.events.InitPhase;
import pro.legion.utils.Version;

public class LaunchServerCoreModule extends LauncherModule {
    public LaunchServerCoreModule() {
        super(new LauncherModuleInfo("LaunchServerCore", Version.getVersion()));
    }

    @Override
    public void init(LauncherInitContext initContext) {
        registerEvent(this::testEvent, InitPhase.class);
    }

    public void testEvent(InitPhase event) {
        //LogHelper.debug("[LaunchServerCore] Event LaunchServerInitPhase passed");
    }

    @Override
    public <T extends Event> boolean registerEvent(EventHandler<T> handle, Class<T> tClass) {
        return super.registerEvent(handle, tClass);
    }
}
