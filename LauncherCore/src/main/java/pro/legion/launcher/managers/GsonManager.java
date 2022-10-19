package pro.legion.launcher.managers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import pro.legion.launcher.hasher.HashedEntry;
import pro.legion.launcher.hasher.HashedEntryAdapter;
import pro.legion.utils.helper.CommonHelper;

public class GsonManager {
    public GsonBuilder gsonBuilder;
    public Gson gson;
    public GsonBuilder configGsonBuilder;
    public Gson configGson;

    public void initGson() {
        gsonBuilder = CommonHelper.newBuilder();
        configGsonBuilder = CommonHelper.newBuilder();
        configGsonBuilder.setPrettyPrinting().disableHtmlEscaping();
        registerAdapters(gsonBuilder);
        registerAdapters(configGsonBuilder);
        preConfigGson(configGsonBuilder);
        preGson(gsonBuilder);
        gson = gsonBuilder.create();
        configGson = configGsonBuilder.create();
    }

    public void registerAdapters(GsonBuilder builder) {
        builder.registerTypeAdapter(HashedEntry.class, new HashedEntryAdapter());
    }

    public void preConfigGson(GsonBuilder gsonBuilder) {
        //skip
    }

    public void preGson(GsonBuilder gsonBuilder) {
        //skip
    }
}
