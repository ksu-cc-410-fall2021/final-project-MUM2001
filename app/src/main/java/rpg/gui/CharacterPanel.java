package gui;

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
    private JLabel character_class;
    private JLabel talent;
    private JLabel health;
    private JLabel stamina;
    private JLabel hit_chance;
    private JLabel defense;

    /**
     * Constructor.
     *
     *<p>Constructs the Character Side Panel.
     * 
     */
    public CharacterPanel(PrimaryWindow parent) {
        this.parent = parent;
        this.setPreferredSize(new Dimension(300, 600));
        this.setLayout(new GridBagLayout());

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

        character_class = new JLabel("which?");
        GridBagConstraints classgbc = new GridBagConstraints();
        classgbc.gridx = 1;
        classgbc.gridy = 3;
        classgbc.weightx = 0.5;
        classgbc.insets = new Insets(2, 2, 2, 2);
        classgbc.anchor = GridBagConstraints.LINE_START;
        this.add(character_class, classgbc);

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

        hit_chance = new JLabel("0");
        GridBagConstraints hit_chancegbc = new GridBagConstraints();
        hit_chancegbc.gridx = 1;
        hit_chancegbc.gridy = 7;
        hit_chancegbc.weightx = 0.5;
        hit_chancegbc.insets = new Insets(2, 2, 2, 2);
        hit_chancegbc.anchor = GridBagConstraints.LINE_START;
        this.add(hit_chance, hit_chancegbc);

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

        JButton edit = new JButton("Edit");
        edit.setActionCommand("edit");
        edit.addActionListener(this);
        GridBagConstraints editgbc = new GridBagConstraints();
        editgbc.gridx = 0;
        editgbc.gridy = 9;
        editgbc.gridwidth = 2;
        editgbc.weightx = 1.0;
        editgbc.fill = GridBagConstraints.BOTH;
        editgbc.insets = new Insets(2, 2, 2, 2);
        this.add(edit, editgbc);
    }

    /**
     * actionPerformed.
     *
     *<p>ActionListener, not in use currently.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}