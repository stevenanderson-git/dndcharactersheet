package dndcharactersheet;

import dndcharactersheet.model.CharacterStat;
import dndcharactersheet.view.main_gui.MainGUI;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        MainGUI mainGUI = new MainGUI();
        mainGUI.displayGUI();
    }

    public static CharacterStat[] makeStatArrays() {
        CharacterStat[] characterStats = { new CharacterStat("Strength", 20), new CharacterStat("Dexterity", 20),
                new CharacterStat("Constitution", 20), new CharacterStat("Intelligence", 20),
                new CharacterStat("Wisdom", 20), new CharacterStat("Charisma", 20) };
        return characterStats;
    }

}
