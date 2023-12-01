package gui;

import classes.CharacterClass;
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
import races.Human;
import races.Race;
import selectionmenu.SelectionMenu;




/**
 * Represents a CreationPanel.
 *
 *<p>Panel to create a character in.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class CreationPanel extends JPanel implements ActionListener {

    private PrimaryWindow parent;

    /**
     * Constructor.
     *
     *<p>Builds the Creation Panel.
     * 
     */
    public CreationPanel(PrimaryWindow parent) {
        this.parent = parent;
        this.setPreferredSize(new Dimension(500, 600));
        this.setLayout(new GridBagLayout());
        int i = 0;
    
        GridBagConstraints classLabelgbc = new GridBagConstraints();
        classLabelgbc.gridx = 0;
        classLabelgbc.gridy = i;
        i += 1;
        //raceLabelgbc.weightx = 1.0;
        //raceLabelgbc.weighty = 1.0;
        //raceLabelgbc.fill = GridBagConstraints.BOTH;
        classLabelgbc.insets = new Insets(2, 2, 2, 2);
        //raceLabelgbc.anchor = GridBagConstraints.LINE_START;
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
        i = 0;
        
        GridBagConstraints raceLabelgbc = new GridBagConstraints();
        raceLabelgbc.gridx = 1;
        raceLabelgbc.gridy = i;
        i += 1;
        //raceLabelgbc.weightx = 1.0;
        //raceLabelgbc.weighty = 1.0;
        //raceLabelgbc.fill = GridBagConstraints.BOTH;
        raceLabelgbc.insets = new Insets(2, 2, 2, 2);
        //raceLabelgbc.anchor = GridBagConstraints.LINE_START;
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
        //talentLabelgbc.weightx = 1.0;
        //talentLabelgbc.weighty = 1.0;
        //talentLabelgbc.fill = GridBagConstraints.BOTH;
        talentLabelgbc.insets = new Insets(2, 2, 2, 2);
        //talentLabelgbc.anchor = GridBagConstraints.LINE_START;
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
     *<p>ActionListener that loads appropriate panel from button press.
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if ("Left Hander".equals(event.getActionCommand())) {
            //System.out.println("Left");
            Talents t = Talents.LEFT_HANDER;
            this.parent.changeTalent(t);
        } else if ("Stocky".equals(event.getActionCommand())) {
            //System.out.println("Stocky");
            Talents t = Talents.STOCKY;
            this.parent.changeTalent(t);
        } else if ("Tall".equals(event.getActionCommand())) {
            //System.out.println("Tall");
            Talents t = Talents.TALL;
            this.parent.changeTalent(t);
        } else if ("Fast Twitch".equals(event.getActionCommand())) {
            //System.out.println("Fast Twitch");
            Talents t = Talents.FAST_TWITCH;
            this.parent.changeTalent(t);
        } else if ("Marathon Runner".equals(event.getActionCommand())) {
            //System.out.println("Marathon Runner");
            Talents t = Talents.MARATHON_RUNNER;
            this.parent.changeTalent(t);
        } else if ("Human".equals(event.getActionCommand())) {
            //System.out.println("Human");
            Race r = new Human();
            this.parent.changeRace(r);
        } else if ("Elf".equals(event.getActionCommand())) {
            System.out.println("Elf");
        } else if ("Dwarf".equals(event.getActionCommand())) {
            System.out.println("Dwarf");
        } else if ("Warrior".equals(event.getActionCommand())) {
            System.out.println("Warrior");
        } else if ("Rogue".equals(event.getActionCommand())) {
            System.out.println("Rogue");
        } else if ("Mage".equals(event.getActionCommand())) {
            System.out.println("Mage");
        }
        
    }
}