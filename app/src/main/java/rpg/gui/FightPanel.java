package gui;

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
    private Fight fight;
    private JLabel turnLabel;
    private JLabel resultField;
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
        if (player.valid()) {

            this.fight = new Fight(player);
            GridBagConstraints playerNameLabelgbc = new GridBagConstraints();
            playerNameLabelgbc.gridx = 0;
            playerNameLabelgbc.gridy = 0;
            playerNameLabelgbc.weightx = 1.0;
            playerNameLabelgbc.weighty = 1.0;
            playerNameLabelgbc.fill = GridBagConstraints.BOTH;
            playerNameLabelgbc.insets = new Insets(2, 2, 2, 2);
            //playerNameLabelgbc.anchor = GridBagConstraints.LINE_END;
            JLabel playerNameLabel = new JLabel(" " + player.getName());
            this.add(playerNameLabel, playerNameLabelgbc);
            /*
            GridBagConstraints hlablegbc = new GridBagConstraints();
            hlablegbc.gridx = 3;
            hlablegbc.gridy = 4;
            //hlablegbc.weightx = 0.5;
            hlablegbc.weightx = 1.0;
            hlablegbc.weighty = 1.0;
            hlablegbc.fill = GridBagConstraints.BOTH;
            hlablegbc.insets = new Insets(2, 2, 2, 2);
            //hlablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel hlabel = new JLabel("Health: ");
            this.add(hlabel, hlablegbc);

            computerHealthLabel = new JLabel("" + fight.getComputerCurrentHealth());
            GridBagConstraints healthgbc = new GridBagConstraints();
            healthgbc.gridx = 4;
            healthgbc.gridy = 4;
            //healthgbc.weightx = 0.5;
            healthgbc.weightx = 1.0;
            healthgbc.weighty = 1.0;
            healthgbc.fill = GridBagConstraints.BOTH;
            healthgbc.insets = new Insets(2, 2, 2, 2);
            //healthgbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerHealthLabel, healthgbc);

            GridBagConstraints slablegbc = new GridBagConstraints();
            slablegbc.gridx = 3;
            slablegbc.gridy = 5;
            //slablegbc.weightx = 0.5;
            slablegbc.weightx = 1.0;
            slablegbc.weighty = 1.0;
            slablegbc.fill = GridBagConstraints.BOTH;
            slablegbc.insets = new Insets(2, 2, 2, 2);
            //slablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel slabel = new JLabel("Stamina: ");
            this.add(slabel, slablegbc);

            computerStaminaLabel = new JLabel("" + fight.getComputerCurrentStamina());
            GridBagConstraints staminagbc = new GridBagConstraints();
            staminagbc.gridx = 4;
            staminagbc.gridy = 5;
            //staminagbc.weightx = 0.5;
            staminagbc.weightx = 1.0;
            staminagbc.weighty = 1.0;
            staminagbc.fill = GridBagConstraints.BOTH;
            staminagbc.insets = new Insets(2, 2, 2, 2);
            //staminagbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerStaminaLabel, staminagbc);

            GridBagConstraints htlablegbc = new GridBagConstraints();
            htlablegbc.gridx = 3;
            htlablegbc.gridy = 6;
            //htlablegbc.weightx = 0.5;
            htlablegbc.weightx = 1.0;
            htlablegbc.weighty = 1.0;
            htlablegbc.fill = GridBagConstraints.BOTH;
            htlablegbc.insets = new Insets(2, 2, 2, 2);
            //htlablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel htlable = new JLabel("Hit Chance: %");
            this.add(htlable, htlablegbc);

            computerHitChanceLabel = new JLabel("" + fight.getComputerHitChance());
            GridBagConstraints hitChancegbc = new GridBagConstraints();
            hitChancegbc.gridx = 4;
            hitChancegbc.gridy = 6;
            //hitChancegbc.weightx = 0.5;
            hitChancegbc.weightx = 1.0;
            hitChancegbc.weighty = 1.0;
            hitChancegbc.fill = GridBagConstraints.BOTH;
            hitChancegbc.insets = new Insets(2, 2, 2, 2);
            //hitChancegbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerHitChanceLabel, hitChancegbc);

            GridBagConstraints dlablegbc = new GridBagConstraints();
            dlablegbc.gridx = 3;
            dlablegbc.gridy = 7;
            //dlablegbc.weightx = 0.5;
            dlablegbc.weightx = 1.0;
            dlablegbc.weighty = 1.0;
            dlablegbc.fill = GridBagConstraints.BOTH;
            dlablegbc.insets = new Insets(2, 2, 2, 2);
            //dlablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel dlable = new JLabel("Defense: %");
            this.add(dlable, dlablegbc);

            computerDefenseLabel = new JLabel("" + fight.getComputerDefense());
            GridBagConstraints defensegbc = new GridBagConstraints();
            defensegbc.gridx = 4;
            defensegbc.gridy = 7;
            //defensegbc.weightx = 0.5;
            defensegbc.weightx = 1.0;
            defensegbc.weighty = 1.0;
            defensegbc.fill = GridBagConstraints.BOTH;
            defensegbc.insets = new Insets(2, 2, 2, 2);
            //defensegbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerDefenseLabel, defensegbc);
            */

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

            
            JButton defendButton = new JButton("Defend");
            defendButton.setActionCommand("defend");
            defendButton.addActionListener(this);
            GridBagConstraints defendgbc = new GridBagConstraints();
            defendgbc.gridx = 0;
            defendgbc.gridy = 2;
            defendgbc.weightx = 1.0;
            defendgbc.weighty = 1.0;
            defendgbc.fill = GridBagConstraints.BOTH;
            defendgbc.insets = new Insets(2, 2, 2, 2);
            this.add(defendButton, defendgbc);

            GridBagConstraints turnLabelgbc = new GridBagConstraints();
            turnLabelgbc.gridx = 2;
            turnLabelgbc.gridy = 0;
            turnLabelgbc.weightx = 1.0;
            turnLabelgbc.weighty = 1.0;
            turnLabelgbc.fill = GridBagConstraints.HORIZONTAL;
            turnLabelgbc.insets = new Insets(2, 2, 2, 2);
            //turnLabelgbc.anchor = GridBagConstraints.LINE_END;
            turnLabel = new JLabel(" Fight Results: ");
            this.add(turnLabel, turnLabelgbc);

            GridBagConstraints resultLabelgbc = new GridBagConstraints();
            resultLabelgbc.gridx = 2;
            resultLabelgbc.gridy = 1;
            resultLabelgbc.weightx = 1.0;
            resultLabelgbc.weighty = 1.0;
            resultLabelgbc.fill = GridBagConstraints.BOTH;
            resultLabelgbc.insets = new Insets(2, 2, 2, 2);
            //resultLabelgbc.anchor = GridBagConstraints.LINE_START;
            resultField = new JLabel("|              Results                |");
            this.add(resultField, resultLabelgbc);

            GridBagConstraints computerNameLabelgbc = new GridBagConstraints();
            computerNameLabelgbc.gridx = 4;
            computerNameLabelgbc.gridy = 0;
            playerNameLabelgbc.weightx = 1.0;
            playerNameLabelgbc.weighty = 1.0;
            playerNameLabelgbc.fill = GridBagConstraints.BOTH;
            computerNameLabelgbc.insets = new Insets(2, 2, 2, 2);
            //playerNameLabelgbc.anchor = GridBagConstraints.LINE_START;
            JLabel computerNameLabel = new JLabel("" + fight.getComputerName());
            this.add(computerNameLabel, computerNameLabelgbc);
            
            GridBagConstraints rlablegbc = new GridBagConstraints();
            rlablegbc.gridx = 3;
            rlablegbc.gridy = 1;
            //rlablegbc.weightx = 0.5;
            rlablegbc.weightx = 1.0;
            rlablegbc.weighty = 1.0;
            rlablegbc.fill = GridBagConstraints.BOTH;
            rlablegbc.insets = new Insets(2, 2, 2, 2);
            //rlablegbc.fill = GridBagConstraints.HORIZONTAL;
            //rlablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel rlabel = new JLabel("Race: ");
            this.add(rlabel, rlablegbc);
            
            computerRaceLabel = new JLabel("" + fight.getComputerRace());
            GridBagConstraints racegbc = new GridBagConstraints();
            racegbc.gridx = 4;
            racegbc.gridy = 1;
            //racegbc.weightx = 0.5;
            racegbc.weightx = 1.0;
            racegbc.weighty = 1.0;
            racegbc.fill = GridBagConstraints.BOTH;
            racegbc.insets = new Insets(2, 2, 2, 2);
            //rlablegbc.fill = GridBagConstraints.HORIZONTAL;
            //racegbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerRaceLabel, racegbc);
            
            GridBagConstraints clablegbc = new GridBagConstraints();
            clablegbc.gridx = 3;
            clablegbc.gridy = 2;
            //clablegbc.weightx = 0.5;
            clablegbc.weightx = 1.0;
            clablegbc.weighty = 1.0;
            clablegbc.fill = GridBagConstraints.BOTH;
            clablegbc.insets = new Insets(2, 2, 2, 2);
            //clablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel clabel = new JLabel("Class: ");
            this.add(clabel, clablegbc);
            
            computerClassLabel = new JLabel("" + fight.getComputerCharacterClass());
            GridBagConstraints classgbc = new GridBagConstraints();
            classgbc.gridx = 4;
            classgbc.gridy = 2;
            //classgbc.weightx = 0.5;
            classgbc.weightx = 1.0;
            classgbc.weighty = 1.0;
            classgbc.fill = GridBagConstraints.BOTH;
            classgbc.insets = new Insets(2, 2, 2, 2);
            //classgbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerClassLabel, classgbc);
        
            GridBagConstraints tlablegbc = new GridBagConstraints();
            tlablegbc.gridx = 3;
            tlablegbc.gridy = 3;
            //tlablegbc.weightx = 0.5;
            tlablegbc.weightx = 1.0;
            tlablegbc.weighty = 1.0;
            tlablegbc.fill = GridBagConstraints.BOTH;
            tlablegbc.insets = new Insets(2, 2, 2, 2);
            //tlablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel tlabel = new JLabel("Talent: ");
            this.add(tlabel, tlablegbc);
            
            computerTalentLabel = new JLabel("" + fight.getComputerTalent());
            GridBagConstraints talentgbc = new GridBagConstraints();
            talentgbc.gridx = 4;
            talentgbc.gridy = 3;
            //talentgbc.weightx = 0.5;
            talentgbc.weightx = 1.0;
            talentgbc.weighty = 1.0;
            talentgbc.fill = GridBagConstraints.BOTH;
            talentgbc.insets = new Insets(2, 2, 2, 2);
            //talentgbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerTalentLabel, talentgbc);
            
            GridBagConstraints hlablegbc = new GridBagConstraints();
            hlablegbc.gridx = 3;
            hlablegbc.gridy = 4;
            //hlablegbc.weightx = 0.5;
            hlablegbc.weightx = 1.0;
            hlablegbc.weighty = 1.0;
            hlablegbc.fill = GridBagConstraints.BOTH;
            hlablegbc.insets = new Insets(2, 2, 2, 2);
            //hlablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel hlabel = new JLabel("Health: ");
            this.add(hlabel, hlablegbc);

            computerHealthLabel = new JLabel("" + fight.getComputerCurrentHealth());
            GridBagConstraints healthgbc = new GridBagConstraints();
            healthgbc.gridx = 4;
            healthgbc.gridy = 4;
            //healthgbc.weightx = 0.5;
            healthgbc.weightx = 1.0;
            healthgbc.weighty = 1.0;
            healthgbc.fill = GridBagConstraints.BOTH;
            healthgbc.insets = new Insets(2, 2, 2, 2);
            //healthgbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerHealthLabel, healthgbc);

            GridBagConstraints slablegbc = new GridBagConstraints();
            slablegbc.gridx = 3;
            slablegbc.gridy = 5;
            //slablegbc.weightx = 0.5;
            slablegbc.weightx = 1.0;
            slablegbc.weighty = 1.0;
            slablegbc.fill = GridBagConstraints.BOTH;
            slablegbc.insets = new Insets(2, 2, 2, 2);
            //slablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel slabel = new JLabel("Stamina: ");
            this.add(slabel, slablegbc);

            computerStaminaLabel = new JLabel("" + fight.getComputerCurrentStamina());
            GridBagConstraints staminagbc = new GridBagConstraints();
            staminagbc.gridx = 4;
            staminagbc.gridy = 5;
            //staminagbc.weightx = 0.5;
            staminagbc.weightx = 1.0;
            staminagbc.weighty = 1.0;
            staminagbc.fill = GridBagConstraints.BOTH;
            staminagbc.insets = new Insets(2, 2, 2, 2);
            //staminagbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerStaminaLabel, staminagbc);

            GridBagConstraints htlablegbc = new GridBagConstraints();
            htlablegbc.gridx = 3;
            htlablegbc.gridy = 6;
            //htlablegbc.weightx = 0.5;
            htlablegbc.weightx = 1.0;
            htlablegbc.weighty = 1.0;
            htlablegbc.fill = GridBagConstraints.BOTH;
            htlablegbc.insets = new Insets(2, 2, 2, 2);
            //htlablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel htlable = new JLabel("Hit Chance: %");
            this.add(htlable, htlablegbc);

            computerHitChanceLabel = new JLabel("" + fight.getComputerHitChance());
            GridBagConstraints hitChancegbc = new GridBagConstraints();
            hitChancegbc.gridx = 4;
            hitChancegbc.gridy = 6;
            //hitChancegbc.weightx = 0.5;
            hitChancegbc.weightx = 1.0;
            hitChancegbc.weighty = 1.0;
            hitChancegbc.fill = GridBagConstraints.BOTH;
            hitChancegbc.insets = new Insets(2, 2, 2, 2);
            //hitChancegbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerHitChanceLabel, hitChancegbc);

            GridBagConstraints dlablegbc = new GridBagConstraints();
            dlablegbc.gridx = 3;
            dlablegbc.gridy = 7;
            //dlablegbc.weightx = 0.5;
            dlablegbc.weightx = 1.0;
            dlablegbc.weighty = 1.0;
            dlablegbc.fill = GridBagConstraints.BOTH;
            dlablegbc.insets = new Insets(2, 2, 2, 2);
            //dlablegbc.anchor = GridBagConstraints.LINE_END;
            JLabel dlable = new JLabel("Defense: %");
            this.add(dlable, dlablegbc);

            computerDefenseLabel = new JLabel("" + fight.getComputerDefense());
            GridBagConstraints defensegbc = new GridBagConstraints();
            defensegbc.gridx = 4;
            defensegbc.gridy = 7;
            //defensegbc.weightx = 0.5;
            defensegbc.weightx = 1.0;
            defensegbc.weighty = 1.0;
            defensegbc.fill = GridBagConstraints.BOTH;
            defensegbc.insets = new Insets(2, 2, 2, 2);
            //defensegbc.anchor = GridBagConstraints.LINE_START;
            this.add(computerDefenseLabel, defensegbc);

        } else {
            //Show PopUp then reload previous panel
        }

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