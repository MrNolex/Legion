package pro.legion.launcher.api;

import pro.legion.launcher.utils.ApiBridgeService;

import java.lang.instrument.Instrumentation;
import java.net.URL;

public class ClientService {
    public static Instrumentation instrumentation;
    public static ClassLoader classLoader;
    public static String nativePath;
    public static URL[] baseURLs;

    public static ClassLoader getClassLoader() {
        return classLoader;
    }

    public static String findLibrary(String name) {
        return ApiBridgeService.findLibrary(classLoader, name);
    }
}
