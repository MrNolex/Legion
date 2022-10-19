package pro.legion.launcher.client.events;

import pro.legion.launcher.gui.RuntimeProvider;
import pro.legion.launcher.modules.LauncherModule;

public class ClientGuiPhase extends LauncherModule.Event {
    public final RuntimeProvider runtimeProvider;

    public ClientGuiPhase(RuntimeProvider runtimeProvider) {
        this.runtimeProvider = runtimeProvider;
    }
}
