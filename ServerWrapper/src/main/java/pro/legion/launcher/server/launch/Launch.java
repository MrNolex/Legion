package pro.legion.launcher.server.launch;

import pro.legion.launcher.server.ServerWrapper;

public interface Launch {
    void run(ServerWrapper.Config config, String[] args) throws Throwable;
}
