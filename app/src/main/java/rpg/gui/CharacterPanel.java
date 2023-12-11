package gui;

import battle.Player;
import classes.CharacterClass;
import enums.Talents;
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
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import me.MyCharacter;
import races.Race;

/**
 * Represents the Character/Sidebar Panel.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class CharacterPanel extends JPanel implements ActionListener {

    
    private PrimaryWindow parent;
    private JLabel name;
    private JLabel race;
    private JLabel characterClass;
    private JLabel talent;
    private JLabel health;
    private JLabel stamina;
    private JLabel hitChance;
    private JLabel defense;
    private MyCharacter myCharacter;

    /**
     * Constructor.
     *
     *<p>Constructs the Character Side Panel.
     * 
     */
    public CharacterPanel(PrimaryWindow parent) {
        //300, 600
        this.parent = parent;
        this.setPreferredSize(new Dimension(300, 650));
        this.setLayout(new GridBagLayout());
        this.myCharacter = new MyCharacter("who?");

        GridBagConstraints characterlabelgbc = new GridBagConstraints();
        characterlabelgbc.gridx = 0;
        characterlabelgbc.gridy = 0;
        characterlabelgbc.weightx = 0.5;
        characterlabelgbc.insets = new Insets(2, 2, 2, 2);
        characterlabelgbc.anchor = GridBagConstraints.LINE_END;
        JLabel characterlabel = new JLabel("Character");
        this.add(characterlabel, characterlabelgbc);

        GridBagConstraints nlablegbc = new GridBagConstraints();
        nlablegbc.gridx = 0;
        nlablegbc.gridy = 1;
        nlablegbc.weightx = 0.5;
        nlablegbc.insets = new Insets(2, 2, 2, 2);
        nlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel nlabel = new JLabel("Name: ");
        this.add(nlabel, nlablegbc);

        name = new JLabel("who?");
        GridBagConstraints namegbc = new GridBagConstraints();
        namegbc.gridx = 1;
        namegbc.gridy = 1;
        namegbc.weightx = 0.5;
        namegbc.insets = new Insets(2, 2, 2, 2);
        namegbc.anchor = GridBagConstraints.LINE_START;
        this.add(name, namegbc);

        GridBagConstraints rlablegbc = new GridBagConstraints();
        rlablegbc.gridx = 0;
        rlablegbc.gridy = 2;
        rlablegbc.weightx = 0.5;
        rlablegbc.insets = new Insets(2, 2, 2, 2);
        rlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel rlabel = new JLabel("Race: ");
        this.add(rlabel, rlablegbc);

        race = new JLabel("which?");
        GridBagConstraints racegbc = new GridBagConstraints();
        racegbc.gridx = 1;
        racegbc.gridy = 2;
        racegbc.weightx = 0.5;
        racegbc.insets = new Insets(2, 2, 2, 2);
        racegbc.anchor = GridBagConstraints.LINE_START;
        this.add(race, racegbc);

        GridBagConstraints clablegbc = new GridBagConstraints();
        clablegbc.gridx = 0;
        clablegbc.gridy = 3;
        clablegbc.weightx = 0.5;
        clablegbc.insets = new Insets(2, 2, 2, 2);
        clablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel clabel = new JLabel("Class: ");
        this.add(clabel, clablegbc);

        characterClass = new JLabel("which?");
        GridBagConstraints classgbc = new GridBagConstraints();
        classgbc.gridx = 1;
        classgbc.gridy = 3;
        classgbc.weightx = 0.5;
        classgbc.insets = new Insets(2, 2, 2, 2);
        classgbc.anchor = GridBagConstraints.LINE_START;
        this.add(characterClass, classgbc);

        GridBagConstraints tlablegbc = new GridBagConstraints();
        tlablegbc.gridx = 0;
        tlablegbc.gridy = 4;
        tlablegbc.weightx = 0.5;
        tlablegbc.insets = new Insets(2, 2, 2, 2);
        tlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel tlabel = new JLabel("Talent: ");
        this.add(tlabel, tlablegbc);

        talent = new JLabel("which?");
        GridBagConstraints talentgbc = new GridBagConstraints();
        talentgbc.gridx = 1;
        talentgbc.gridy = 4;
        talentgbc.weightx = 0.5;
        talentgbc.insets = new Insets(2, 2, 2, 2);
        talentgbc.anchor = GridBagConstraints.LINE_START;
        this.add(talent, talentgbc);

        GridBagConstraints hlablegbc = new GridBagConstraints();
        hlablegbc.gridx = 0;
        hlablegbc.gridy = 5;
        hlablegbc.weightx = 0.5;
        hlablegbc.insets = new Insets(2, 2, 2, 2);
        hlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel hlabel = new JLabel("Health: ");
        this.add(hlabel, hlablegbc);

        health = new JLabel("0");
        GridBagConstraints healthgbc = new GridBagConstraints();
        healthgbc.gridx = 1;
        healthgbc.gridy = 5;
        healthgbc.weightx = 0.5;
        healthgbc.insets = new Insets(2, 2, 2, 2);
        healthgbc.anchor = GridBagConstraints.LINE_START;
        this.add(health, healthgbc);

        GridBagConstraints slablegbc = new GridBagConstraints();
        slablegbc.gridx = 0;
        slablegbc.gridy = 6;
        slablegbc.weightx = 0.5;
        slablegbc.insets = new Insets(2, 2, 2, 2);
        slablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel slabel = new JLabel("Stamina: ");
        this.add(slabel, slablegbc);

        stamina = new JLabel("0");
        GridBagConstraints staminagbc = new GridBagConstraints();
        staminagbc.gridx = 1;
        staminagbc.gridy = 6;
        staminagbc.weightx = 0.5;
        staminagbc.insets = new Insets(2, 2, 2, 2);
        staminagbc.anchor = GridBagConstraints.LINE_START;
        this.add(stamina, staminagbc);

        GridBagConstraints htlablegbc = new GridBagConstraints();
        htlablegbc.gridx = 0;
        htlablegbc.gridy = 7;
        htlablegbc.weightx = 0.5;
        htlablegbc.insets = new Insets(2, 2, 2, 2);
        htlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel htlable = new JLabel("Hit Chance: %");
        this.add(htlable, htlablegbc);

        hitChance = new JLabel("0");
        GridBagConstraints hitChancegbc = new GridBagConstraints();
        hitChancegbc.gridx = 1;
        hitChancegbc.gridy = 7;
        hitChancegbc.weightx = 0.5;
        hitChancegbc.insets = new Insets(2, 2, 2, 2);
        hitChancegbc.anchor = GridBagConstraints.LINE_START;
        this.add(hitChance, hitChancegbc);

        GridBagConstraints dlablegbc = new GridBagConstraints();
        dlablegbc.gridx = 0;
        dlablegbc.gridy = 8;
        dlablegbc.weightx = 0.5;
        dlablegbc.insets = new Insets(2, 2, 2, 2);
        dlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel dlable = new JLabel("Defense: %");
        this.add(dlable, dlablegbc);

        defense = new JLabel("0");
        GridBagConstraints defensegbc = new GridBagConstraints();
        defensegbc.gridx = 1;
        defensegbc.gridy = 8;
        defensegbc.weightx = 0.5;
        defensegbc.insets = new Insets(2, 2, 2, 2);
        defensegbc.anchor = GridBagConstraints.LINE_START;
        this.add(defense, defensegbc);


        JButton fight = new JButton("Fight");
        fight.setActionCommand("fight");
        fight.addActionListener(this);
        GridBagConstraints fightgbc = new GridBagConstraints();
        fightgbc.gridx = 0;
        fightgbc.gridy = 9;
        fightgbc.gridwidth = 2;
        fightgbc.weightx = 1.0;
        fightgbc.fill = GridBagConstraints.BOTH;
        fightgbc.insets = new Insets(2, 2, 2, 2);
        this.add(fight, fightgbc);

        JButton create = new JButton("Create");
        create.setActionCommand("create");
        create.addActionListener(this);
        GridBagConstraints creategbc = new GridBagConstraints();
        creategbc.gridx = 0;
        creategbc.gridy = 10;
        creategbc.gridwidth = 2;
        creategbc.weightx = 1.0;
        creategbc.fill = GridBagConstraints.BOTH;
        creategbc.insets = new Insets(2, 2, 2, 2);
        this.add(create, creategbc);
    }

    /** 
    * The changeTalent method.
    *
    *
    *@param talent Talents
    */
    public void changeTalent(Talents talent) {
        this.myCharacter.setTalent(talent);
        this.defense.setText(myCharacter.getDefense() + "");
        this.hitChance.setText(myCharacter.getHitChance() + "");
        this.stamina.setText(myCharacter.getStamina() + "");
        this.health.setText(myCharacter.getHealth() + "");
        this.talent.setText(talent.toString() + "");
    }

    /** 
    * The changeRace method.
    *
    *
    *@param race Race
    */
    public void changeRace(Race race) {
        this.myCharacter.setRace(race);
        this.defense.setText(myCharacter.getDefense() + "");
        this.hitChance.setText(myCharacter.getHitChance() + "");
        this.stamina.setText(myCharacter.getStamina() + "");
        this.health.setText(myCharacter.getHealth() + "");
        this.race.setText(race.toString());
    }

    /** 
    * The changeCharacterClass method.
    *
    *
    *@param characterClass class
    */
    public void changeCharacterClass(CharacterClass characterClass) {
        this.myCharacter.setCharacterClass(characterClass);
        this.defense.setText(myCharacter.getDefense() + "");
        this.hitChance.setText(myCharacter.getHitChance() + "");
        this.stamina.setText(myCharacter.getStamina() + "");
        this.health.setText(myCharacter.getHealth() + "");
        this.characterClass.setText(characterClass.toString() + "");
    }

    /** 
    * The changeName method.
    *
    *
    *@param name String
    */
    public void changeName(String name) {
        this.myCharacter.setName(name);
        this.name.setText(name + "");
    }

    /**
     * actionPerformed.
     *
     *<p>ActionListener to trigger loading of Fight or Creation Panels
     *  on button press.
     *
     *@param event ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (("fight").equals(event.getActionCommand())) {
            Player player = new Player(this.myCharacter);
            FightPanel p = new FightPanel(this.parent, player);
            parent.loadPanel(p);
        } else if (("create").equals(event.getActionCommand())) {
            parent.loadCreationPanel();
        }
    }
}