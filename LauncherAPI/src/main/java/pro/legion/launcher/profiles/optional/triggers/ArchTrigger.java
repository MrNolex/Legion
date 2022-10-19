package pro.legion.launcher.profiles.optional.triggers;

import pro.legion.launcher.profiles.optional.OptionalFile;
import pro.legion.utils.helper.JVMHelper;

public class ArchTrigger extends OptionalTrigger {
    public JVMHelper.ARCH arch;
    @Override
    protected boolean isTriggered(OptionalFile optional, OptionalTriggerContext context) {
        return context.getJavaVersion().arch == arch;
    }
}
