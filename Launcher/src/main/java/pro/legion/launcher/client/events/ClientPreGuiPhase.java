package pro.legion.launcher.client.events;

import pro.legion.launcher.gui.RuntimeProvider;
import pro.legion.launcher.modules.LauncherModule;

public class ClientPreGuiPhase extends LauncherModule.Event {
    public RuntimeProvider runtimeProvider;

    public ClientPreGuiPhase(RuntimeProvider runtimeProvider) {
        this.runtimeProvider = runtimeProvider;
    }
}
