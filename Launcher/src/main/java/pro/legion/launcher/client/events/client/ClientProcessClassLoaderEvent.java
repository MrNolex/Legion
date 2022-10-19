package pro.legion.launcher.client.events.client;

import pro.legion.launcher.LauncherEngine;
import pro.legion.launcher.modules.LauncherModule;
import pro.legion.launcher.profiles.ClientProfile;

public class ClientProcessClassLoaderEvent extends LauncherModule.Event {
    public final LauncherEngine clientInstance;
    public final ClassLoader clientClassLoader;
    public final ClientProfile profile;

    public ClientProcessClassLoaderEvent(LauncherEngine clientInstance, ClassLoader clientClassLoader, ClientProfile profile) {
        this.clientInstance = clientInstance;
        this.clientClassLoader = clientClassLoader;
        this.profile = profile;
    }
}
