package pro.legion.launchserver;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import pro.legion.launcher.Launcher;
import pro.legion.launchserver.config.LaunchServerConfig;
import pro.legion.launchserver.config.LaunchServerRuntimeConfig;
import pro.legion.launchserver.impl.TestLaunchServerConfigManager;
import pro.legion.launchserver.manangers.CertificateManager;
import pro.legion.launchserver.manangers.LaunchServerGsonManager;
import pro.legion.launchserver.modules.impl.LaunchServerModulesManager;
import pro.legion.utils.command.StdCommandHandler;

import java.nio.file.Path;
import java.security.Security;

public class StartLaunchServerTest {
    @TempDir
    public static Path modulesDir;
    @TempDir
    public static Path configDir;
    @TempDir
    public static Path dir;
    public static LaunchServer launchServer;

    @BeforeAll
    public static void prepare() throws Throwable {
        if (Security.getProvider("BC") == null) Security.addProvider(new BouncyCastleProvider());
        LaunchServerModulesManager modulesManager = new LaunchServerModulesManager(modulesDir, configDir, null);
        LaunchServerConfig config = LaunchServerConfig.getDefault(LaunchServer.LaunchServerEnv.TEST);
        Launcher.gsonManager = new LaunchServerGsonManager(modulesManager);
        Launcher.gsonManager.initGson();
        LaunchServerRuntimeConfig runtimeConfig = new LaunchServerRuntimeConfig();
        LaunchServerBuilder builder = new LaunchServerBuilder();
        builder.setDir(dir)
                .setEnv(LaunchServer.LaunchServerEnv.TEST)
                .setConfig(config)
                .setRuntimeConfig(runtimeConfig)
                .setCertificateManager(new CertificateManager())
                .setLaunchServerConfigManager(new TestLaunchServerConfigManager())
                .setModulesManager(modulesManager)
                .setCommandHandler(new StdCommandHandler(false));
        launchServer = builder.build();
    }

    @AfterAll
    public static void complete() throws Throwable {
        launchServer.close();
    }

    @Test
    public void start() {
        launchServer.run();
    }
}
