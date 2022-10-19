package pro.legion.launcher.console;

import pro.legion.launcher.LauncherEngine;
import pro.legion.utils.command.Command;
import pro.legion.utils.helper.LogHelper;

import java.util.Base64;

public class GetPublicKeyCommand extends Command {
    private final LauncherEngine engine;

    public GetPublicKeyCommand(LauncherEngine engine) {
        this.engine = engine;
    }

    @Override
    public String getArgsDescription() {
        return "[]";
    }

    @Override
    public String getUsageDescription() {
        return "print public key in base64 format";
    }

    @Override
    public void invoke(String... args) throws Exception {
        LogHelper.info("PublicKey: %s", Base64.getEncoder().encodeToString(engine.getClientPublicKey().getEncoded()));
    }
}
