package pro.legion.launcher.modules.events;

import com.google.gson.GsonBuilder;
import pro.legion.launcher.modules.LauncherModule;

public class PreGsonPhase extends LauncherModule.Event {
    public final GsonBuilder gsonBuilder;

    public PreGsonPhase(GsonBuilder gsonBuilder) {
        this.gsonBuilder = gsonBuilder;
    }
}
