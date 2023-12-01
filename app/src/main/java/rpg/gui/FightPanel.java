package gui;

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
import javax.swing.JPanel;
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

    /**
     * Constructor.
     *
     *<p>Builds the Creation Panel.
     * 
     */
    public FightPanel(PrimaryWindow parent) {
        this.parent = parent;
        this.setPreferredSize(new Dimension(500, 600));
        this.setLayout(new GridBagLayout());
        

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