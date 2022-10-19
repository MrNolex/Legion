package pro.legion.launchserver.auth.core;

public interface UserSession {
    String getID();

    User getUser();

    long getExpireIn();
}
