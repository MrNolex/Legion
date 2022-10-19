package pro.legion.launchserver.components;

import pro.legion.launchserver.LaunchServer;
import pro.legion.launchserver.manangers.hook.AuthHookManager;
import pro.legion.utils.HookException;

import java.util.ArrayList;
import java.util.List;

public class RegLimiterComponent extends IPLimiter implements AutoCloseable {

    public transient LaunchServer launchServer;
    public String message;

    public List<String> excludeIps = new ArrayList<>();

    @Override
    public void init(LaunchServer launchServer) {
        this.launchServer = launchServer;
        launchServer.authHookManager.registraion.registerHook(this::registerHook);
    }

    public boolean registerHook(AuthHookManager.RegContext context) {
        if (!check(context.ip)) {
            throw new HookException(message);
        }
        return false;
    }

    @Override
    public void close() {
        launchServer.authHookManager.registraion.unregisterHook(this::registerHook);
    }
}
