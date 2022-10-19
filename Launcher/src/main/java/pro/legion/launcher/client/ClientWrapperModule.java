package pro.legion.launcher.client;

import pro.legion.launcher.ClientLauncherWrapper;

public interface ClientWrapperModule {
    void wrapperPhase(ClientLauncherWrapper.ClientLauncherWrapperContext context);
}
