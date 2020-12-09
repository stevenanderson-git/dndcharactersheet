package dndcharactersheet.view.main_gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import dndcharactersheet.App;
import dndcharactersheet.model.CharacterStat;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class CharacterStatView extends JPanel {

    public CharacterStatView() {
        CharacterStat[] characterStat = App.makeStatArrays();
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.5;
        c.gridx = 0;
        c.fill = GridBagConstraints.BOTH;
        for (int i = 0; i < characterStat.length; ++i) {
            add(addPanel(characterStat[i].getStatName(), characterStat[i].getStatScore()), c);
            c.gridy = i;
        }
    }

    private JPanel addPanel(String statName, int statScore) {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.5;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        JLabel label = new JLabel(statName);
        panel.add(label, c);
        c.gridx = 0;
        c.gridy = 1;
        JTextArea textArea = new JTextArea("[" + statScore + "]");
        panel.add(textArea, c);
        return panel;
    }

}
