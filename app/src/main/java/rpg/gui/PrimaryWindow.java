package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;
import gui.CreationPanel;
import gui.CharacterPanel;


/**
 * Represents a MainWindow.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class PrimaryWindow extends JFrame {

    private JPanel main;
    private JPanel sidebar;

    /**
     * Constructor.
     *
     *<p>Builds the PrimaryWindow in which all other Panels
     *  load.
     * 
     */
    public PrimaryWindow() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setTitle("RPG");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        this.main = null;
        this.loadCreationPanel();

        this.sidebar = new CharacterPanel(this);
        GridBagConstraints sidegbc = new GridBagConstraints();
        sidegbc.gridx = 1;
        sidegbc.gridy = 0;
        sidegbc.weighty = 1.0;
        sidegbc.weightx = 0.4;
        sidegbc.fill = GridBagConstraints.BOTH;
        sidegbc.insets = new Insets(10, 10, 10, 10);
        this.add(this.sidebar, sidegbc);

        this.pack();

    }

    /**
     * loadCreationPanel.
     *
     *<p>Loads a Creation Screen into Main Panel.
     * 
     */
    public void loadCreationPanel() {
        this.loadPanel(new CreationPanel(this));
    }

    /**
     * LoadPanel.
     *
     *<p>Loads another Panel.
     *
     *@param panel JPanel to load
     */
    public void loadPanel(JPanel panel) {
        if (this.main != null) {
            this.remove(this.main);
        }
        this.main = panel;
        GridBagConstraints maingbc = new GridBagConstraints();
        maingbc.gridx = 0;
        maingbc.gridy = 0;
        maingbc.weighty = 1.0;
        maingbc.weightx = 1.0;
        maingbc.fill = GridBagConstraints.BOTH;
        maingbc.insets = new Insets(10, 10, 10, 10);
        this.add(this.main, maingbc);
        this.pack();
        this.repaint();
    }
}