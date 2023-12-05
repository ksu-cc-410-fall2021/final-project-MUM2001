package gui;

import battle.Dice;
import battle.Fight;
import battle.Player;
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
import selectionmenu.SelectionMenu;




/**
 * Represents a FightPanel.
 *
 *<p>Panel represents the results and actions of the fight.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class FightPanel extends JPanel implements ActionListener {

    private PrimaryWindow parent;
    private Player player;
    //private Fight fight;
    //private Computer computer;
    private JLabel turnLabel;
    private JTextField resultField;
    private JLabel computerClassLabel;
    private JLabel computerRaceLabel;
    private JLabel computerTalentLabel;
    private JLabel computerHealthLabel;
    private JLabel computerStaminaLabel;
    private JLabel computerDefenseLabel;
    private JLabel computerHitChanceLabel;


    /**
     * Constructor.
     *
     *<p>Builds the Creation Panel.
     * 
     */
    public FightPanel(PrimaryWindow parent, Player player) {
        this.parent = parent;
        this.setPreferredSize(new Dimension(500, 600));
        this.setLayout(new GridBagLayout());

        //if (player.valid())

        GridBagConstraints playerNameLabelgbc = new GridBagConstraints();
        playerNameLabelgbc.gridx = 0;
        playerNameLabelgbc.gridy = 0;
        //playerNameLabelgbc.weightx = 1.0;
        //playerNameLabelgbc.weighty = 1.0;
        //playerNameLabelgbc.fill = GridBagConstraints.BOTH;
        playerNameLabelgbc.insets = new Insets(2, 2, 2, 2);
        //playerNameLabelgbc.anchor = GridBagConstraints.LINE_START;
        JLabel playerNameLabel = new JLabel("player.getName()");
        this.add(playerNameLabel, playerNameLabelgbc);

        JButton attackButton = new JButton("Attack");
        attackButton.setActionCommand("attack");
        attackButton.addActionListener(this);
        GridBagConstraints attackgbc = new GridBagConstraints();
        attackgbc.gridx = 0;
        attackgbc.gridy = 1;
        attackgbc.weightx = 1.0;
        attackgbc.weighty = 1.0;
        attackgbc.fill = GridBagConstraints.BOTH;
        attackgbc.insets = new Insets(2, 2, 2, 2);
        this.add(attackButton, attackgbc);

        GridBagConstraints turnLabelgbc = new GridBagConstraints();
        turnLabelgbc.gridx = 2;
        turnLabelgbc.gridy = 0;
        //turnLabelgbc.weightx = 1.0;
        //turnLabelgbc.weighty = 1.0;
        //turnLabelgbc.fill = GridBagConstraints.BOTH;
        turnLabelgbc.insets = new Insets(2, 2, 2, 2);
        //turnLabelgbc.anchor = GridBagConstraints.LINE_START;
        turnLabel = new JLabel("fight.getTurn();");
        this.add(turnLabel, turnLabelgbc);

        GridBagConstraints resultLabelgbc = new GridBagConstraints();
        resultLabelgbc.gridx = 2;
        resultLabelgbc.gridy = 1;
        //turnLabelgbc.weightx = 1.0;
        //turnLabelgbc.weighty = 1.0;
        //turnLabelgbc.fill = GridBagConstraints.BOTH;
        resultLabelgbc.insets = new Insets(2, 2, 2, 2);
        //turnLabelgbc.anchor = GridBagConstraints.LINE_START;
        resultField = new JTextField("fight.getResult()");
        this.add(resultField, resultLabelgbc);

        GridBagConstraints computerNameLabelgbc = new GridBagConstraints();
        computerNameLabelgbc.gridx = 4;
        computerNameLabelgbc.gridy = 0;
        //playerNameLabelgbc.weightx = 1.0;
        //playerNameLabelgbc.weighty = 1.0;
        //playerNameLabelgbc.fill = GridBagConstraints.BOTH;
        computerNameLabelgbc.insets = new Insets(2, 2, 2, 2);
        //playerNameLabelgbc.anchor = GridBagConstraints.LINE_START;
        JLabel computerNameLabel = new JLabel("computer.getName()");
        this.add(computerNameLabel, computerNameLabelgbc);

        GridBagConstraints rlablegbc = new GridBagConstraints();
        rlablegbc.gridx = 3;
        rlablegbc.gridy = 1;
        rlablegbc.weightx = 0.5;
        rlablegbc.insets = new Insets(2, 2, 2, 2);
        rlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel rlabel = new JLabel("Race: ");
        this.add(rlabel, rlablegbc);

        computerRaceLabel = new JLabel("computer.getRace();");
        GridBagConstraints racegbc = new GridBagConstraints();
        racegbc.gridx = 4;
        racegbc.gridy = 1;
        racegbc.weightx = 0.5;
        racegbc.insets = new Insets(2, 2, 2, 2);
        racegbc.anchor = GridBagConstraints.LINE_START;
        this.add(computerRaceLabel, racegbc);

        GridBagConstraints clablegbc = new GridBagConstraints();
        clablegbc.gridx = 3;
        clablegbc.gridy = 2;
        clablegbc.weightx = 0.5;
        clablegbc.insets = new Insets(2, 2, 2, 2);
        clablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel clabel = new JLabel("Class: ");
        this.add(clabel, clablegbc);

        computerClassLabel = new JLabel("computer.getClass()");
        GridBagConstraints classgbc = new GridBagConstraints();
        classgbc.gridx = 4;
        classgbc.gridy = 2;
        classgbc.weightx = 0.5;
        classgbc.insets = new Insets(2, 2, 2, 2);
        classgbc.anchor = GridBagConstraints.LINE_START;
        this.add(computerRaceLabel, classgbc);

        GridBagConstraints tlablegbc = new GridBagConstraints();
        tlablegbc.gridx = 3;
        tlablegbc.gridy = 3;
        tlablegbc.weightx = 0.5;
        tlablegbc.insets = new Insets(2, 2, 2, 2);
        tlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel tlabel = new JLabel("Talent: ");
        this.add(tlabel, tlablegbc);

        computerTalentLabel = new JLabel("which?");
        GridBagConstraints talentgbc = new GridBagConstraints();
        talentgbc.gridx = 4;
        talentgbc.gridy = 3;
        talentgbc.weightx = 0.5;
        talentgbc.insets = new Insets(2, 2, 2, 2);
        talentgbc.anchor = GridBagConstraints.LINE_START;
        this.add(computerTalentLabel, talentgbc);

        GridBagConstraints hlablegbc = new GridBagConstraints();
        hlablegbc.gridx = 3;
        hlablegbc.gridy = 4;
        hlablegbc.weightx = 0.5;
        hlablegbc.insets = new Insets(2, 2, 2, 2);
        hlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel hlabel = new JLabel("Health: ");
        this.add(hlabel, hlablegbc);

        computerHealthLabel = new JLabel("computer.getHealth()");
        GridBagConstraints healthgbc = new GridBagConstraints();
        healthgbc.gridx = 4;
        healthgbc.gridy = 4;
        healthgbc.weightx = 0.5;
        healthgbc.insets = new Insets(2, 2, 2, 2);
        healthgbc.anchor = GridBagConstraints.LINE_START;
        this.add(computerHealthLabel, healthgbc);

        GridBagConstraints slablegbc = new GridBagConstraints();
        slablegbc.gridx = 3;
        slablegbc.gridy = 5;
        slablegbc.weightx = 0.5;
        slablegbc.insets = new Insets(2, 2, 2, 2);
        slablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel slabel = new JLabel("Stamina: ");
        this.add(slabel, slablegbc);

        computerStaminaLabel = new JLabel("computer.getStamina");
        GridBagConstraints staminagbc = new GridBagConstraints();
        staminagbc.gridx = 4;
        staminagbc.gridy = 5;
        staminagbc.weightx = 0.5;
        staminagbc.insets = new Insets(2, 2, 2, 2);
        staminagbc.anchor = GridBagConstraints.LINE_START;
        this.add(computerStaminaLabel, staminagbc);

        GridBagConstraints htlablegbc = new GridBagConstraints();
        htlablegbc.gridx = 3;
        htlablegbc.gridy = 6;
        htlablegbc.weightx = 0.5;
        htlablegbc.insets = new Insets(2, 2, 2, 2);
        htlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel htlable = new JLabel("Hit Chance: %");
        this.add(htlable, htlablegbc);

        computerHitChanceLabel = new JLabel("computer.getHitChance()");
        GridBagConstraints hitChancegbc = new GridBagConstraints();
        hitChancegbc.gridx = 4;
        hitChancegbc.gridy = 6;
        hitChancegbc.weightx = 0.5;
        hitChancegbc.insets = new Insets(2, 2, 2, 2);
        hitChancegbc.anchor = GridBagConstraints.LINE_START;
        this.add(computerHitChanceLabel, hitChancegbc);

        GridBagConstraints dlablegbc = new GridBagConstraints();
        dlablegbc.gridx = 3;
        dlablegbc.gridy = 7;
        dlablegbc.weightx = 0.5;
        dlablegbc.insets = new Insets(2, 2, 2, 2);
        dlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel dlable = new JLabel("Defense: %");
        this.add(dlable, dlablegbc);

        computerDefenseLabel = new JLabel("computer.getDefense()");
        GridBagConstraints defensegbc = new GridBagConstraints();
        defensegbc.gridx = 4;
        defensegbc.gridy = 7;
        defensegbc.weightx = 0.5;
        defensegbc.insets = new Insets(2, 2, 2, 2);
        defensegbc.anchor = GridBagConstraints.LINE_START;
        this.add(computerDefenseLabel, defensegbc);

    }

    /**
     * actionPerformed.
     *
     *<p>ActionListener that loads appropriate panel from button press.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}