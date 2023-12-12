package gui;

import classes.CharacterClass;
import classes.Mage;
import classes.Rogue;
import classes.Warrior;
import data.Character;
import enums.Talents;
import gui.CharacterPanel;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import races.Dwarf;
import races.Elf;
import races.Human;
import races.Race;
import selectionmenu.SelectionMenu;




/**
 * Represents a CreationPanel.
 *
 *<p>Loads gui Panel to create a character in.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 1.0
 */
public class CreationPanel extends JPanel implements ActionListener {

    private PrimaryWindow parent;
    private JTextField namefield;

    /**
     * Constructor.
     *
     *<p>Builds the Creation Panel with Primary Window parameter as parent.
     *
     *@param parent PrimaryWindow to serve as parent window
     */
    public CreationPanel(PrimaryWindow parent) {
        this.parent = parent;
        this.setPreferredSize(new Dimension(800, 650));
        this.setLayout(new GridBagLayout());
        int i = 0;
    
        GridBagConstraints classLabelgbc = new GridBagConstraints();
        classLabelgbc.gridx = 0;
        classLabelgbc.gridy = i;
        i += 1;
        classLabelgbc.insets = new Insets(2, 2, 2, 2);
        JLabel classLabel = new JLabel("Class:");
        this.add(classLabel, classLabelgbc);
        for (Character character : SelectionMenu.getCharacterClasses()) {
            JButton button = new JButton(character.toString());
            button.setActionCommand(character.toString());
            button.addActionListener(this);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = i;
            i += 1;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.insets = new Insets(2, 2, 2, 2);
            this.add(button, gbc);
        }
        GridBagConstraints namelabelgbc = new GridBagConstraints();
        namelabelgbc.gridx = 0;
        namelabelgbc.gridy = i;
        i += 1;
        namelabelgbc.weightx = 1.0;
        namelabelgbc.weighty = 1.0;
        namelabelgbc.insets = new Insets(2, 2, 2, 2);
        JLabel namelabel = new JLabel("Name:");
        this.add(namelabel, namelabelgbc);

        GridBagConstraints namegbc = new GridBagConstraints();
        namegbc.gridx = 0;
        namegbc.gridy = i;
        i += 1;
        namegbc.weightx = 1.0;
        namegbc.weighty = 1.0;
        namegbc.fill = GridBagConstraints.BOTH;
        namegbc.insets = new Insets(2, 2, 2, 2);
        namegbc.anchor = GridBagConstraints.LINE_START;
        this.namefield = new JTextField(" What is your name ?", 10);
        namefield.setActionCommand("Name");
        namefield.addActionListener(this);
        this.add(namefield, namegbc);
        i = 0;
        
        GridBagConstraints raceLabelgbc = new GridBagConstraints();
        raceLabelgbc.gridx = 1;
        raceLabelgbc.gridy = i;
        i += 1;
        raceLabelgbc.insets = new Insets(2, 2, 2, 2);
        JLabel raceLabel = new JLabel("Race:");
        this.add(raceLabel, raceLabelgbc);
        for (Character character : SelectionMenu.getRaces()) {
            JButton button = new JButton(character.toString());
            button.setActionCommand(character.toString());
            button.addActionListener(this);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = i;
            i += 1;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.insets = new Insets(2, 2, 2, 2);
            this.add(button, gbc);
        }
        i = 0;
        
        GridBagConstraints talentLabelgbc = new GridBagConstraints();
        talentLabelgbc.gridx = 2;
        talentLabelgbc.gridy = i;
        i += 1;
        talentLabelgbc.insets = new Insets(2, 2, 2, 2);
        JLabel talentLabel = new JLabel("Talent:");
        this.add(talentLabel, talentLabelgbc);
        for (Talents t : Talents.values()) {
            JButton button = new JButton(t.toString());
            button.setActionCommand(t.toString());
            button.addActionListener(this);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 2;
            gbc.gridy = i;
            i += 1;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.insets = new Insets(2, 2, 2, 2);
            this.add(button, gbc);
        }
        i = 0;

    }

    /**
     * actionPerformed.
     *
     *<p>ActionListener that changes appropriate attribute from button press.
     *
     *@param event ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if ("Left Hander".equals(event.getActionCommand())) {
            Talents t = Talents.LEFT_HANDER;
            this.parent.changeTalent(t);
        } else if ("Stocky".equals(event.getActionCommand())) {
            Talents t = Talents.STOCKY;
            this.parent.changeTalent(t);
        } else if ("Tall".equals(event.getActionCommand())) {
            Talents t = Talents.TALL;
            this.parent.changeTalent(t);
        } else if ("Fast Twitch".equals(event.getActionCommand())) {
            Talents t = Talents.FAST_TWITCH;
            this.parent.changeTalent(t);
        } else if ("Marathon Runner".equals(event.getActionCommand())) {
            Talents t = Talents.MARATHON_RUNNER;
            this.parent.changeTalent(t);
        } else if ("Human".equals(event.getActionCommand())) {
            Race r = new Human();
            this.parent.changeRace(r);
        } else if ("Elf".equals(event.getActionCommand())) {
            Race r = new Elf();
            this.parent.changeRace(r);
        } else if ("Dwarf".equals(event.getActionCommand())) {
            Race r = new Dwarf();
            this.parent.changeRace(r);
        } else if ("Warrior".equals(event.getActionCommand())) {
            CharacterClass c = new Warrior();
            this.parent.changeCharacterClass(c);
        } else if ("Rogue".equals(event.getActionCommand())) {
            CharacterClass c = new Rogue();
            this.parent.changeCharacterClass(c);
        } else if ("Mage".equals(event.getActionCommand())) {
            CharacterClass c = new Mage();
            this.parent.changeCharacterClass(c);
        } else if ("Name".equals(event.getActionCommand())) {
            this.parent.changeName(namefield.getText());
        }
        
    }
}