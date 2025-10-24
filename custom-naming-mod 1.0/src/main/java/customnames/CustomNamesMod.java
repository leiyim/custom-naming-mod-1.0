package customnames;

import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.save.LoadData;
import necesse.engine.save.SaveData;

@ModEntry
public class CustomNamesMod {
    private boolean enabled = true;
    public void init() {
        if (enabled) {
            NameManager.applyCustomNames();
        }
    }
    public void onWorldLoaded() {
        if (enabled) {
            NameManager.applyCustomNames();
        }
    }
    public void addSaveData(SaveData save) {
        SaveData config = new SaveData("config");
        config.addBoolean("enabled", enabled);
        save.addSaveData(config);
    }
    public void applyLoadData(LoadData save) {
        LoadData config = save.getFirstLoadDataByName("config");
        if (config != null) {
            enabled = config.getBoolean("enabled", enabled);
        }
    }
    public void onModUnload() {
    }
}