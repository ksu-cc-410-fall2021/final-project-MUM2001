package gui;

//import data.Item;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import selectionMenu.SelectionMenu;
/**
import sfsubs.data.drinks.Picard;
import sfsubs.data.drinks.Troi;
import sfsubs.data.drinks.Worf;
import sfsubs.data.enums.Size;
import sfsubs.data.sides.Borg;
import sfsubs.data.sides.Data;
import sfsubs.data.sides.Enterprise;
import sfsubs.gui.drinks.PicardPanel;
import sfsubs.gui.drinks.TroiPanel;
import sfsubs.gui.drinks.WorfPanel;
import sfsubs.gui.entrees.BbqPanel;
import sfsubs.gui.entrees.JanewayPanel;
import sfsubs.gui.entrees.KirkPanel;
import sfsubs.gui.entrees.RikerPanel;
import sfsubs.gui.entrees.SpockPanel;
**/
import enums.Talents;
import data.Character;
import gui.CharacterPanel;




/**
 * Represents a CreationPanel.
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
    public MenuPanel(PrimaryWindow parent) {
        this.parent = parent;
        this.setPreferredSize(new Dimension(500, 600));
        this.setLayout(new GridBagLayout());
        int i = 0;
        for (Character character : SelectionMenu.getCharacterClasses()) {
            JButton button = new JButton(character.toString());
            button.setActionCommand(s);
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
        for (Character character : SelectionMenu.getRace()) {
            JButton button = new JButton(character.toString());
            button.setActionCommand(item.toString());
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
        i = 0
        JButton button = new JButton("Talents");
        button.setActionCommand(item.toString());
        button.addActionListener(this);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = i;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(2, 2, 2, 2);
        this.add(button, gbc);

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