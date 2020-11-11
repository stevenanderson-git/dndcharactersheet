package dndcharactersheet.view.main_gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import java.awt.Dimension;

public class MainGUI extends JFrame {
    private boolean isVisible = false;
    private JSplitPane splitPane;
    private JScrollPane leftScrollPane;
    private JScrollPane rightScrollPane;

    public MainGUI() {
        buildFrame();
        pack();
    }

    private void buildFrame() {
        // add and create a menubar
        setJMenuBar(new MainMenuBar(this));
        // set default close operationa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set Window Size
        setMinimumSize(new Dimension(1200, 800));
        // fill screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Set the layout
        setLayout(new BorderLayout());
        // Left Scroll Pane
        leftScrollPane = new JScrollPane();
        leftScrollPane.add(new JTextArea("Walrus"));
        // TODO: viewpoint does not work

        // Right Scroll Pane
        rightScrollPane = new JScrollPane();


        // Create the split Pane
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftScrollPane, rightScrollPane);
        // add split pane to center border layout
        add(splitPane, BorderLayout.CENTER);
    }



    /**
     * Toggles the display visible/not depending on isVisible boolean
     */
    public void toggleDisplay() {
        setVisible(!isVisible);
    }
}
