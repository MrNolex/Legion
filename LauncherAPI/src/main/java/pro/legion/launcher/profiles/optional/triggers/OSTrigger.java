package pro.legion.launcher.profiles.optional.triggers;

import pro.legion.launcher.profiles.optional.OptionalFile;
import pro.legion.utils.helper.JVMHelper;

public class OSTrigger extends OptionalTrigger {
    public JVMHelper.OS os;

    public OSTrigger(JVMHelper.OS os) {
        this.os = os;
    }

    @Override
    public boolean isTriggered(OptionalFile optional, OptionalTriggerContext context) {
        return JVMHelper.OS_TYPE == os;
    }
}
