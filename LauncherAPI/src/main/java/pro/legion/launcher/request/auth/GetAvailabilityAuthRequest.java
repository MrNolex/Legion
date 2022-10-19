package pro.legion.launcher.request.auth;

import pro.legion.launcher.events.request.GetAvailabilityAuthRequestEvent;
import pro.legion.launcher.request.Request;
import pro.legion.launcher.request.auth.details.AuthLoginOnlyDetails;
import pro.legion.launcher.request.auth.details.AuthPasswordDetails;
import pro.legion.launcher.request.auth.details.AuthTotpDetails;
import pro.legion.launcher.request.auth.details.AuthWebViewDetails;
import pro.legion.launcher.request.websockets.WebSocketRequest;
import pro.legion.utils.ProviderMap;

public class GetAvailabilityAuthRequest extends Request<GetAvailabilityAuthRequestEvent> implements WebSocketRequest {

    public static final ProviderMap<GetAvailabilityAuthRequestEvent.AuthAvailabilityDetails> providers = new ProviderMap<>();
    private static boolean registeredProviders = false;

    public static void registerProviders() {
        if (!registeredProviders) {
            providers.register("password", AuthPasswordDetails.class);
            providers.register("webview", AuthWebViewDetails.class);
            providers.register("totp", AuthTotpDetails.class);
            providers.register("loginonly", AuthLoginOnlyDetails.class);
            registeredProviders = true;
        }
    }

    @Override
    public String getType() {
        return "getAvailabilityAuth";
    }
}
