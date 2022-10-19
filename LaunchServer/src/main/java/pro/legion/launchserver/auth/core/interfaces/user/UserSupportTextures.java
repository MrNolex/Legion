package pro.legion.launchserver.auth.core.interfaces.user;

import pro.legion.launcher.profiles.ClientProfile;
import pro.legion.launcher.profiles.Texture;

import java.util.HashMap;
import java.util.Map;

public interface UserSupportTextures {
    Texture getSkinTexture();

    Texture getCloakTexture();

    default Texture getSkinTexture(ClientProfile profile) {
        return getSkinTexture();
    }

    default Texture getCloakTexture(ClientProfile profile) {
        return getCloakTexture();
    }

    default Map<String, Texture> getUserAssets() {
        var skin = getSkinTexture();
        var cape = getCloakTexture();
        Map<String, Texture> map = new HashMap<>();
        if(skin != null) {
            map.put("SKIN", skin);
        }
        if(cape != null) {
            map.put("CAPE", cape);
        }
        return map;
    }
}
