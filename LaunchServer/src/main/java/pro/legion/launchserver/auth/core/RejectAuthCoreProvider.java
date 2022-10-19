package pro.legion.launchserver.auth.core;

import pro.legion.launcher.request.auth.AuthRequest;
import pro.legion.launchserver.LaunchServer;
import pro.legion.launchserver.auth.AuthException;
import pro.legion.launchserver.manangers.AuthManager;
import pro.legion.launchserver.socket.response.auth.AuthResponse;

import java.io.IOException;
import java.util.UUID;

public class RejectAuthCoreProvider extends AuthCoreProvider {
    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public User getUserByUUID(UUID uuid) {
        return null;
    }

    @Override
    public UserSession getUserSessionByOAuthAccessToken(String accessToken) throws OAuthAccessTokenExpired {
        return null;
    }

    @Override
    public AuthManager.AuthReport refreshAccessToken(String refreshToken, AuthResponse.AuthContext context) {
        return null;
    }

    @Override
    public void verifyAuth(AuthResponse.AuthContext context) throws AuthException {
        throw new AuthException("Please configure AuthCoreProvider");
    }

    @Override
    public AuthManager.AuthReport authorize(String login, AuthResponse.AuthContext context, AuthRequest.AuthPasswordInterface password, boolean minecraftAccess) throws IOException {
        throw new AuthException("Please configure AuthCoreProvider");
    }

    @Override
    public void init(LaunchServer server) {

    }

    @Override
    protected boolean updateServerID(User user, String serverID) throws IOException {
        return false;
    }

    @Override
    public void close() throws IOException {

    }
}
