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
//import order.Order;

/**
 * Represents the Character/Sidebar Panel.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class CharacterPanel extends JPanel implements ActionListener {

    
    private PrimaryWindow parent;
    private JLabel namelabel;
    private JLabel racelabel;
    private JLabel classlabel;
    private JLabel Talentlabel;
    private JLabel healthlabel;
    private JLabel staminalabel;
    private JLabel hitchancelabel;
    private JLabel defenselabel;

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
/////////////////////////////////////////////////////////////////////////////
        GridBagConstraints lablegbc = new GridBagConstraints();
        taxlablegbc.gridx = 0;
        taxlablegbc.gridy = 3;
        taxlablegbc.weightx = 0.5;
        taxlablegbc.insets = new Insets(2, 2, 2, 2);
        taxlablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel taxLabel = new JLabel("Tax $");
        this.add(taxLabel, taxlablegbc);

        tax = new JLabel("0.00");
        GridBagConstraints taxgbc = new GridBagConstraints();
        taxgbc.gridx = 1;
        taxgbc.gridy = 3;
        taxgbc.weightx = 0.5;
        taxgbc.insets = new Insets(2, 2, 2, 2);
        taxgbc.anchor = GridBagConstraints.LINE_START;
        this.add(tax, taxgbc);

        GridBagConstraints totallablegbc = new GridBagConstraints();
        totallablegbc.gridx = 0;
        totallablegbc.gridy = 4;
        totallablegbc.weightx = 0.5;
        totallablegbc.insets = new Insets(2, 2, 2, 2);
        totallablegbc.anchor = GridBagConstraints.LINE_END;
        JLabel totalLabel = new JLabel("Total $");
        this.add(totalLabel, totallablegbc);

        total = new JLabel("0.00");
        GridBagConstraints totalgbc = new GridBagConstraints();
        totalgbc.gridx = 1;
        totalgbc.gridy = 4;
        totalgbc.weightx = 0.5;
        totalgbc.insets = new Insets(2, 2, 2, 2);
        totalgbc.anchor = GridBagConstraints.LINE_START;
        this.add(total, totalgbc);

        JButton edit = new JButton("Edit");
        edit.setActionCommand("edit");
        edit.addActionListener(this);
        GridBagConstraints editgbc = new GridBagConstraints();
        editgbc.gridx = 0;
        editgbc.gridy = 5;
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