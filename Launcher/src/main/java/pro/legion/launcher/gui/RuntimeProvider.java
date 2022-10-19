package pro.legion.launcher.gui;

public interface RuntimeProvider {
    void run(String[] args) throws Exception;

    void preLoad() throws Exception;

    void init(boolean clientInstance);
}
