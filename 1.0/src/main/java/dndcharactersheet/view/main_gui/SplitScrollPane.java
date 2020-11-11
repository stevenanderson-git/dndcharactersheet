package dndcharactersheet.view.main_gui;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SplitScrollPane extends JSplitPane {
    private JScrollPane leftPane;
    private JScrollPane rightPane;

    public SplitScrollPane() {
        super();
        buildLeft();
        buildRight();
        
    }

    private void buildLeft() {
        leftPane = new JScrollPane();
        leftPane.add(new JTextArea("Testing tacos"));
        setLeftComponent(leftPane);
    }

    private void buildRight() {
        rightPane = new JScrollPane();
        rightPane.add(new JButton("Button 3"));
        rightPane.add(new JTextField("Hello World"));
        setRightComponent(rightPane);
    }

    public void addToLeftPane() {
        // TODO
    }

    public void addToRightPane() {
        // TODO
    }

}
