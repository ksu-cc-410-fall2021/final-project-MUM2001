package rpg.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;
import rpg.charactercreation.data.classes.CharacterClass;
import rpg.charactercreation.data.enums.Talents;
import rpg.charactercreation.data.races.Race;
import rpg.gui.CharacterPanel;
import rpg.gui.CreationPanel;


/**
 * Represents a PrimaryWindow.
 *
 *<p>Window serves as base to load rest of gui. Also contains methods
 *  to facilitate interaction between Character and Creation Panels.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 1.0
 */
public class PrimaryWindow extends JFrame {

    private JPanel main;
    private CharacterPanel sidebar;

    /**
     * Constructor.
     *
     *<p>Builds the PrimaryWindow in which all other Panels
     *  load into. Automatically loads Creation and Character Panels
     *  at object creation.
     * 
     */
    public PrimaryWindow() {
        this.setPreferredSize(new Dimension(1100, 650));
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
     *<p>Loads a Creation Screen into Main Panel. Calls
     *  Load Panel Method with Creation Panel as argument
     *  and this window as parent.
     * 
     */
    public void loadCreationPanel() {
        this.loadPanel(new CreationPanel(this));
    }

    /**
     * LoadPanel.
     *
     *<p>Loads another Panel in place of the main Panel.
     *  JPanel parameter is loaded and set as the main Panel
     *  in the window.
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

    /** 
    * The changeTalent method.
    *
    *<p>Calls changeTalent() method in CharacterPanel to modify
    *   character and gui representation.
    *
    *@param talent Talents
    */
    public void changeTalent(Talents talent) {
        this.sidebar.changeTalent(talent);
    }

    /** 
    * The changeRace method.
    *
    *<p>Calls changeRace() method in CharacterPanel to modify
    *   character and gui representation.
    *
    *@param race Race
    */
    public void changeRace(Race race) {
        this.sidebar.changeRace(race);
    }

    /** 
    * The changeCharacterClass method.
    *
    *<p>Calls changeCharacterClass() method in CharacterPanel to modify
    *   character and gui representation.
    *
    *@param characterClass class
    */
    public void changeCharacterClass(CharacterClass characterClass) {
        this.sidebar.changeCharacterClass(characterClass);
    }

    /** 
    * The changeName method.
    *
    *<p>Calls changeName() method in CharacterPanel to modify
    *   character and gui representation.
    *
    *@param name String
    */
    public void changeName(String name) {
        this.sidebar.changeName(name);
    }
}