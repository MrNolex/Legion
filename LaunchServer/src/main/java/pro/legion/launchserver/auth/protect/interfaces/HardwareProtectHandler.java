package pro.legion.launchserver.auth.protect.interfaces;

import pro.legion.launchserver.socket.Client;
import pro.legion.launchserver.socket.response.secure.HardwareReportResponse;

public interface HardwareProtectHandler {
    void onHardwareReport(HardwareReportResponse response, Client client);
}
