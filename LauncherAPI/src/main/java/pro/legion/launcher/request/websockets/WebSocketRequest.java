package pro.legion.launcher.request.websockets;

import pro.legion.utils.TypeSerializeInterface;

public interface WebSocketRequest extends TypeSerializeInterface {
    String getType();
}
