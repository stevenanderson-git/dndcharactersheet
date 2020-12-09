package dndcharactersheet.view.main_gui;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class SplitScrollPane extends JPanel {
    private JSplitPane splitScrollPane;
    private JScrollPane leftPane;
    private JScrollPane rightPane;
    private JTabbedPane leftTabbedPane;
    private JTabbedPane rightTabbedPane;

    public SplitScrollPane() {
        splitScrollPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, getLeftScrollPane(), getRightScrollPane());
    }

    public Component getSplitScrollPane() {
        return splitScrollPane;
    }

    private JScrollPane getLeftScrollPane() {
        leftTabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        leftPane = new JScrollPane(leftTabbedPane);
        return leftPane;
    }

    private JScrollPane getRightScrollPane() {
        rightTabbedPane = new JTabbedPane(JTabbedPane.TOP);
        rightPane = new JScrollPane(rightTabbedPane);
        return rightPane;
    }

    public void addToLeftPane(Component component) {
        leftTabbedPane.add(component);
    }

    public void addToRightPane(Component component) {
        rightTabbedPane.add(component);
    }

}
