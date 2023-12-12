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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import selectionmenu.SelectionMenu;




/**
 * Represents a FightPanel.
 *
 *<p>Panel represents the results and actions of the fight.
 *  Displaying player and computer pertinent attributes, player
 *  interaction buttons, and results provided a valid player object
 *  is provided. If it is not, a prompt and button are provided to
 *  return to character creation.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 1.0
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
    private JLabel playerHealthLabel;
    private JLabel computerStaminaLabel;
    private JLabel playerStaminaLabel;
    private JLabel computerDefenseLabel;
    private JLabel computerHitChanceLabel;


    /**
     * Constructor.
     *
     *<p>Builds the Creation Panel with Primary Window parameter as
     *  parent window and Player parameter as the parameter to create
     *  the underlying Fight Object used to perform calculations and
     *  store data for the fight.
     *
     @param parent PrimaryWindow to serve as parent window
     @param player Player Object to be used as parameter of Fight Object
     */
    public FightPanel(PrimaryWindow parent, Player player) {
        this.parent = parent;
        this.setPreferredSize(new Dimension(800, 650));
        this.setLayout(new GridBagLayout());
        if (player.valid()) {
            this.player = player;
            this.fight = new Fight(player);
            GridBagConstraints playerNameLabelgbc = new GridBagConstraints();
            playerNameLabelgbc.gridx = 0;
            playerNameLabelgbc.gridy = 0;
            playerNameLabelgbc.weightx = 1.0;
            playerNameLabelgbc.weighty = 1.0;
            playerNameLabelgbc.fill = GridBagConstraints.BOTH;
            playerNameLabelgbc.insets = new Insets(2, 2, 2, 2);
            JLabel playerNameLabel = new JLabel(" " + player.getName());
            this.add(playerNameLabel, playerNameLabelgbc);
            
            GridBagConstraints phlablegbc = new GridBagConstraints();
            phlablegbc.gridx = 0;
            phlablegbc.gridy = 1;
            phlablegbc.weightx = 1.0;
            phlablegbc.weighty = 1.0;
            phlablegbc.fill = GridBagConstraints.BOTH;
            phlablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel phlabel = new JLabel("Health: ");
            this.add(phlabel, phlablegbc);

            playerHealthLabel = new JLabel("" + player.getCurrentHealth());
            GridBagConstraints phealthgbc = new GridBagConstraints();
            phealthgbc.gridx = 1;
            phealthgbc.gridy = 1;
            phealthgbc.weightx = 1.0;
            phealthgbc.weighty = 1.0;
            phealthgbc.fill = GridBagConstraints.BOTH;
            phealthgbc.insets = new Insets(2, 2, 2, 2);
            this.add(playerHealthLabel, phealthgbc);

            GridBagConstraints pslablegbc = new GridBagConstraints();
            pslablegbc.gridx = 0;
            pslablegbc.gridy = 2;
            pslablegbc.weightx = 1.0;
            pslablegbc.weighty = 1.0;
            pslablegbc.fill = GridBagConstraints.BOTH;
            pslablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel pslabel = new JLabel("Stamina: ");
            this.add(pslabel, pslablegbc);

            playerStaminaLabel = new JLabel("" + player.getCurrentStamina());
            GridBagConstraints pstaminagbc = new GridBagConstraints();
            pstaminagbc.gridx = 1;
            pstaminagbc.gridy = 2;
            pstaminagbc.weightx = 1.0;
            pstaminagbc.weighty = 1.0;
            pstaminagbc.fill = GridBagConstraints.BOTH;
            pstaminagbc.insets = new Insets(2, 2, 2, 2);
            this.add(playerStaminaLabel, pstaminagbc);

            JButton attackButton = new JButton("Attack");
            attackButton.setActionCommand("attack");
            attackButton.addActionListener(this);
            GridBagConstraints attackgbc = new GridBagConstraints();
            attackgbc.gridx = 2;
            attackgbc.gridy = 3;
            attackgbc.weightx = 1.0;
            attackgbc.weighty = 1.0;
            attackgbc.fill = GridBagConstraints.BOTH;
            attackgbc.insets = new Insets(2, 2, 2, 2);
            this.add(attackButton, attackgbc);

            
            JButton defendButton = new JButton("Defend");
            defendButton.setActionCommand("defend");
            defendButton.addActionListener(this);
            GridBagConstraints defendgbc = new GridBagConstraints();
            defendgbc.gridx = 2;
            defendgbc.gridy = 4;
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
            turnLabel = new JLabel(" Fight Results: ");
            this.add(turnLabel, turnLabelgbc);

            GridBagConstraints resultLabelgbc = new GridBagConstraints();
            resultLabelgbc.gridx = 2;
            resultLabelgbc.gridy = 1;
            resultLabelgbc.weightx = 1.0;
            resultLabelgbc.weighty = 1.0;
            resultLabelgbc.fill = GridBagConstraints.BOTH;
            resultLabelgbc.insets = new Insets(2, 2, 2, 2);
            resultField = new JLabel("|              Results                |");
            this.add(resultField, resultLabelgbc);

            GridBagConstraints computerNameLabelgbc = new GridBagConstraints();
            computerNameLabelgbc.gridx = 4;
            computerNameLabelgbc.gridy = 0;
            playerNameLabelgbc.weightx = 1.0;
            playerNameLabelgbc.weighty = 1.0;
            playerNameLabelgbc.fill = GridBagConstraints.BOTH;
            computerNameLabelgbc.insets = new Insets(2, 2, 2, 2);
            JLabel computerNameLabel = new JLabel("" + fight.getComputerName());
            this.add(computerNameLabel, computerNameLabelgbc);
            
            GridBagConstraints rlablegbc = new GridBagConstraints();
            rlablegbc.gridx = 3;
            rlablegbc.gridy = 1;
            rlablegbc.weightx = 1.0;
            rlablegbc.weighty = 1.0;
            rlablegbc.fill = GridBagConstraints.BOTH;
            rlablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel rlabel = new JLabel("Race: ");
            this.add(rlabel, rlablegbc);
            
            computerRaceLabel = new JLabel("" + fight.getComputerRace());
            GridBagConstraints racegbc = new GridBagConstraints();
            racegbc.gridx = 4;
            racegbc.gridy = 1;
            racegbc.weightx = 1.0;
            racegbc.weighty = 1.0;
            racegbc.fill = GridBagConstraints.BOTH;
            racegbc.insets = new Insets(2, 2, 2, 2);
            this.add(computerRaceLabel, racegbc);
            
            GridBagConstraints clablegbc = new GridBagConstraints();
            clablegbc.gridx = 3;
            clablegbc.gridy = 2;
            clablegbc.weightx = 1.0;
            clablegbc.weighty = 1.0;
            clablegbc.fill = GridBagConstraints.BOTH;
            clablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel clabel = new JLabel("Class: ");
            this.add(clabel, clablegbc);
            
            computerClassLabel = new JLabel("" + fight.getComputerCharacterClass());
            GridBagConstraints classgbc = new GridBagConstraints();
            classgbc.gridx = 4;
            classgbc.gridy = 2;
            classgbc.weightx = 1.0;
            classgbc.weighty = 1.0;
            classgbc.fill = GridBagConstraints.BOTH;
            classgbc.insets = new Insets(2, 2, 2, 2);
            this.add(computerClassLabel, classgbc);
        
            GridBagConstraints tlablegbc = new GridBagConstraints();
            tlablegbc.gridx = 3;
            tlablegbc.gridy = 3;
            tlablegbc.weightx = 1.0;
            tlablegbc.weighty = 1.0;
            tlablegbc.fill = GridBagConstraints.BOTH;
            tlablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel tlabel = new JLabel("Talent: ");
            this.add(tlabel, tlablegbc);
            
            computerTalentLabel = new JLabel("" + fight.getComputerTalent());
            GridBagConstraints talentgbc = new GridBagConstraints();
            talentgbc.gridx = 4;
            talentgbc.gridy = 3;
            talentgbc.weightx = 1.0;
            talentgbc.weighty = 1.0;
            talentgbc.fill = GridBagConstraints.BOTH;
            talentgbc.insets = new Insets(2, 2, 2, 2);
            this.add(computerTalentLabel, talentgbc);
            
            GridBagConstraints hlablegbc = new GridBagConstraints();
            hlablegbc.gridx = 3;
            hlablegbc.gridy = 4;
            hlablegbc.weightx = 1.0;
            hlablegbc.weighty = 1.0;
            hlablegbc.fill = GridBagConstraints.BOTH;
            hlablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel hlabel = new JLabel("Health: ");
            this.add(hlabel, hlablegbc);

            computerHealthLabel = new JLabel("" + fight.getComputerCurrentHealth());
            GridBagConstraints healthgbc = new GridBagConstraints();
            healthgbc.gridx = 4;
            healthgbc.gridy = 4;
            healthgbc.weightx = 1.0;
            healthgbc.weighty = 1.0;
            healthgbc.fill = GridBagConstraints.BOTH;
            healthgbc.insets = new Insets(2, 2, 2, 2);
            this.add(computerHealthLabel, healthgbc);

            GridBagConstraints slablegbc = new GridBagConstraints();
            slablegbc.gridx = 3;
            slablegbc.gridy = 5;
            slablegbc.weightx = 1.0;
            slablegbc.weighty = 1.0;
            slablegbc.fill = GridBagConstraints.BOTH;
            slablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel slabel = new JLabel("Stamina: ");
            this.add(slabel, slablegbc);

            computerStaminaLabel = new JLabel("" + fight.getComputerCurrentStamina());
            GridBagConstraints staminagbc = new GridBagConstraints();
            staminagbc.gridx = 4;
            staminagbc.gridy = 5;
            staminagbc.weightx = 1.0;
            staminagbc.weighty = 1.0;
            staminagbc.fill = GridBagConstraints.BOTH;
            staminagbc.insets = new Insets(2, 2, 2, 2);
            this.add(computerStaminaLabel, staminagbc);

            GridBagConstraints htlablegbc = new GridBagConstraints();
            htlablegbc.gridx = 3;
            htlablegbc.gridy = 6;
            htlablegbc.weightx = 1.0;
            htlablegbc.weighty = 1.0;
            htlablegbc.fill = GridBagConstraints.BOTH;
            htlablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel htlable = new JLabel("Hit Chance: %");
            this.add(htlable, htlablegbc);

            computerHitChanceLabel = new JLabel("" + fight.getComputerHitChance());
            GridBagConstraints hitChancegbc = new GridBagConstraints();
            hitChancegbc.gridx = 4;
            hitChancegbc.gridy = 6;
            hitChancegbc.weightx = 1.0;
            hitChancegbc.weighty = 1.0;
            hitChancegbc.fill = GridBagConstraints.BOTH;
            hitChancegbc.insets = new Insets(2, 2, 2, 2);
            this.add(computerHitChanceLabel, hitChancegbc);

            GridBagConstraints dlablegbc = new GridBagConstraints();
            dlablegbc.gridx = 3;
            dlablegbc.gridy = 7;
            dlablegbc.weightx = 1.0;
            dlablegbc.weighty = 1.0;
            dlablegbc.fill = GridBagConstraints.BOTH;
            dlablegbc.insets = new Insets(2, 2, 2, 2);
            JLabel dlable = new JLabel("Defense: %");
            this.add(dlable, dlablegbc);

            computerDefenseLabel = new JLabel("" + fight.getComputerDefense());
            GridBagConstraints defensegbc = new GridBagConstraints();
            defensegbc.gridx = 4;
            defensegbc.gridy = 7;
            defensegbc.weightx = 1.0;
            defensegbc.weighty = 1.0;
            defensegbc.fill = GridBagConstraints.BOTH;
            defensegbc.insets = new Insets(2, 2, 2, 2);
            this.add(computerDefenseLabel, defensegbc);

        } else { 

            JOptionPane.showMessageDialog(this.parent, "Finish Creating Character First!",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            JButton reloadButton = new JButton("Reload Creation Panel");
            reloadButton.setActionCommand("reload");
            reloadButton.addActionListener(this);
            GridBagConstraints reloadgbc = new GridBagConstraints();
            reloadgbc.gridx = 2;
            reloadgbc.gridy = 3;
            reloadgbc.weightx = 1.0;
            reloadgbc.weighty = 1.0;
            reloadgbc.insets = new Insets(2, 2, 2, 2);
            this.add(reloadButton, reloadgbc);
        }

    }

    /**
     * actionPerformed.
     *
     *<p>ActionListener that loads appropriate panel from button press
     * and calls Fight methods as well as updating JLabels appropriately.
     *
     *@param event ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if ("attack".equals(event.getActionCommand())) {
            String results = fight.attack();
            resultField.setText("|" + results + "|");
            int a = player.getCurrentHealth();
            if (a < 0) {
                a = 0;
            }
            playerHealthLabel.setText(a + "");
            int b = player.getCurrentStamina();
            if (b < 0) {
                b = 0;
            }
            playerStaminaLabel.setText(b + "");
            int c = fight.getComputerCurrentHealth();
            if (c < 0) {
                c = 0;
            }
            computerHealthLabel.setText(c + "");
            int d = fight.getComputerCurrentStamina();
            if (d < 0) {
                d = 0;
            }
            computerStaminaLabel.setText(d + "");
            if (fight.checkIfOver()) {
                String gameResult = fight.getResultOfGame();
                JOptionPane.showMessageDialog(this.parent, gameResult,
                        "Who Won?", JOptionPane.INFORMATION_MESSAGE);
                this.actionPerformed(new ActionEvent(this, 0, "reload"));
            } 
        } else if ("defend".equals(event.getActionCommand())) {
            String results = fight.defend();
            resultField.setText("|" + results + "|");
            int a = player.getCurrentHealth();
            if (a < 0) {
                a = 0;
            }
            playerHealthLabel.setText(a + "");
            int b = player.getCurrentStamina();
            if (b < 0) {
                b = 0;
            }
            playerStaminaLabel.setText(b + "");
            int c = fight.getComputerCurrentHealth();
            if (c < 0) {
                c = 0;
            }
            computerHealthLabel.setText(c + "");
            int d = fight.getComputerCurrentStamina();
            if (d < 0) {
                d = 0;
            }
            computerStaminaLabel.setText(d + "");
            if (fight.checkIfOver()) {
                String gameResult = fight.getResultOfGame();
                JOptionPane.showMessageDialog(this.parent, gameResult,
                        "Who Won?", JOptionPane.INFORMATION_MESSAGE);
                this.actionPerformed(new ActionEvent(this, 0, "reload"));
            } 
        } else if ("reload".equals(event.getActionCommand())) { 
            parent.loadCreationPanel();
        }
    }
}