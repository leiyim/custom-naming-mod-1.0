package customnames;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.friendly.human.HumanMob;
import java.util.ArrayList;
import java.util.List;

public class NameManager {
    public static void applyCustomNames() {
        try {
            String[] elderNames = getNamesFromLang("elder");
            String[] maleNames = getNamesFromLang("male");
            String[] femaleNames = getNamesFromLang("female");
            String[] neutralNames = getNamesFromLang("neutral");
            String[] lastNames = getNamesFromLang("last");
            if (elderNames.length > 0) {
                HumanMob.elderNames = elderNames;
            }
            if (maleNames.length > 0) {
                HumanMob.maleNames = maleNames;
            }
            if (femaleNames.length > 0) {
                HumanMob.femaleNames = femaleNames;
            }
            if (neutralNames.length > 0) {
                HumanMob.neutralNames = neutralNames;
            }
            if (lastNames.length > 0) {
                HumanMob.lastNames = lastNames;
            }
        } catch (Exception e) {
        }
    }

    private static String[] getNamesFromLang(String category) {
        List<String> names = new ArrayList<>();
        try {
            String namesText = Localization.translate("names", category);
            if (!namesText.equals("names." + category)) {
                String[] nameArray = namesText.split(",");
                for (String name : nameArray) {
                    String trimmedName = name.trim();
                    if (!trimmedName.isEmpty()) {
                        names.add(trimmedName);
                    }
                }
            }
        } catch (Exception e) {
        }
        return names.toArray(new String[0]);
    }
}
