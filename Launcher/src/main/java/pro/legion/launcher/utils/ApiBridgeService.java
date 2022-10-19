package pro.legion.launcher.utils;

import pro.legion.launcher.Launcher;
import pro.legion.launcher.LauncherTrustManager;
import pro.legion.launcher.client.ClientClassLoader;

import java.security.cert.X509Certificate;

public class ApiBridgeService {
    public static LauncherTrustManager.CheckClassResult checkCertificates(X509Certificate[] certs) {
        LauncherTrustManager trustManager = Launcher.getConfig().trustManager;
        return trustManager.checkCertificates(certs, trustManager::stdCertificateChecker);
    }

    public static void checkCertificatesSuccess(X509Certificate[] certs) throws Exception {
        LauncherTrustManager trustManager = Launcher.getConfig().trustManager;
        trustManager.checkCertificatesSuccess(certs, trustManager::stdCertificateChecker);
    }

    public static String findLibrary(ClassLoader classLoader, String library) {
        if(classLoader instanceof ClientClassLoader) {
            ClientClassLoader clientClassLoader = (ClientClassLoader) classLoader;
            return clientClassLoader.findLibrary(library);
        }
        return null;
    }
}
