package dndcharactersheet.view.main_gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import java.awt.Dimension;

public class MainGUI extends JFrame {
    private boolean isVisible = false;

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
        addSplitContent();
    }

    /**
     * Create a new Split Scroll pane
     */
    private void addSplitContent() {
        SplitScrollPane splitScrollPane = new SplitScrollPane();
        // Add it to the current layout
        add(splitScrollPane, BorderLayout.CENTER);
    }

    /**
     * Toggles the display visible/not depending on isVisible boolean
     */
    public void toggleDisplay() {
        setVisible(!isVisible);
    }
}
