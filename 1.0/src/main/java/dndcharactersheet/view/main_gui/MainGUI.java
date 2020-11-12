package dndcharactersheet.view.main_gui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainGUI extends JFrame {
    private JScrollPane leftScrollPane;
    private JScrollPane rightScrollPane;

    /**
     * Call toggle display after creation in order to show the window.
     */
    public MainGUI() {
        super("Dungeons and Dragons Character Sheet");
        // add and create a menubar
        setJMenuBar(new MainMenuBar(this));
        // set default close operationa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set Window Size
        setMinimumSize(new Dimension(1200, 800));
        // fill screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Fills the frame with the needed panes
        buildContentGridBag();
    }

    // private void buildContentSplit() {
    // splitScrollPane = new SplitScrollPane();
    // CharacterStatView statView = new CharacterStatView();
    // splitScrollPane.addToLeftPane(statView);
    // getContentPane().add(splitScrollPane.getSplitScrollPane());

    // // // Set the layout
    // // setLayout(new GridBagLayout());
    // // // build the general view
    // // // buildSplitPane();
    // // buildGridBag();

    // }

    /**
     * testing grid bag instead of split pane
     */
    private void buildContentGridBag() {
        setLayout(new GridBagLayout());
        GridBagConstraints cleft = new GridBagConstraints();
        cleft.fill = GridBagConstraints.BOTH;
        cleft.gridx = 0;
        cleft.gridy = 0;
        leftScrollPane = new JScrollPane();
        JTabbedPane leftTabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        CharacterStatView characterStatView = new CharacterStatView();
        leftTabbedPane.addTab("Character Stats", characterStatView);
        leftScrollPane.setViewportView(leftTabbedPane);
        leftScrollPane.setViewportBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),
                BorderFactory.createLoweredBevelBorder()));
        add(leftScrollPane, cleft);

        GridBagConstraints cright = new GridBagConstraints();
        cright.fill = GridBagConstraints.BOTH;
        cright.gridx = 1;
        cright.gridy = 0;
        rightScrollPane = new JScrollPane();
        add(rightScrollPane, cright);
    }

    /**
     * // * Builds the split panel and populates it with the left and right scroll
     * panes //
     */
    // private void buildSplitPane() {
    // // Create the split Pane
    // splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, makeLeftScrollPane(),
    // makeRightScrollPane());
    // // add split pane to center border layout
    // add(splitPane, BorderLayout.CENTER);
    // }

    // private JScrollPane makeLeftScrollPane() {
    // // Create the panel that will be viewed in the scroll pane
    // leftPanel = new JPanel(new BorderLayout());
    // // TODO: created for testing, change later
    // JTextArea leftArea = new JTextArea();
    // leftArea = fillTextArea(leftArea);
    // leftPanel.add(leftArea, BorderLayout.CENTER);

    // // Create the Scrollpane
    // // leftScrollPane = new JScrollPane(leftPanel);
    // return new JScrollPane(leftPanel);
    // }

    // private JScrollPane makeRightScrollPane() {
    // // Create the panel that will be viewed in the scroll pane
    // rightPanel = new JPanel(new BorderLayout());
    // // TODO: created for testing, change later
    // JTextArea rightArea = new JTextArea();
    // rightArea = fillTextArea(rightArea);
    // rightPanel.add(rightArea, BorderLayout.CENTER);

    // // rightScrollPane = new JScrollPane(rightPanel);
    // return new JScrollPane(rightPanel);
    // }

    /**
     * Read file and write to a JTextArea //
     */
    private JTextArea fillTextArea(JTextArea textArea) {
        // Demo from Stack Overflow:
        // https: // stackoverflow.com/questions/5880169/loading-a-text-file-into-a-textarea
        try {
            FileReader reader = new FileReader(getFile());
            BufferedReader br = new BufferedReader(reader);
            textArea.read(br, null);
            br.close();
        } catch (Exception e2) {
            System.out.println(e2);
        }
        return textArea;
    }

    /**
     * Toggles the display visible/not depending on isVisible boolean
     */
    public void displayGUI() {
        validate(); // Probably not needed
        pack();
        setVisible(true);
    }

    // Opens GUI to select file
    public String getFile() {
        // import javax.swing.*; to open
        File file = null;
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        // displays the file window
        int tmp = chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();
        if (file != null) {
            return file.toString();
        } else
            return "";
    }
}
