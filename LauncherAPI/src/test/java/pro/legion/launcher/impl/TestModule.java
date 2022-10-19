package pro.legion.launcher.impl;

import pro.legion.launcher.impl.event.CancelEvent;
import pro.legion.launcher.impl.event.NormalEvent;
import pro.legion.launcher.modules.LauncherInitContext;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.modules.LauncherModuleInfo;

public class TestModule extends LauncherModule {

    public TestModule() {
        super(new LauncherModuleInfo("testModule"));
    }

    @Override
    public void init(LauncherInitContext initContext) {
        registerEvent(this::testevent, NormalEvent.class);
        registerEvent(this::testevent2, CancelEvent.class);
    }

    public void testevent(NormalEvent event) {
        event.passed = true;
    }

    public void testevent2(CancelEvent cancelEvent) {
        cancelEvent.cancel();
    }
}
