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
/**
import menu.Menu;
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
        for (Item item : Menu.getEntrees()) {
            String s = "";
            JButton button = new JButton(s);
            if (item.toString().contains("bb-Q")) {
                s = "BB-Q";
                button = new JButton(s);
            }
            if (item.toString().contains("Janeway")) {
                s = "Janeway";
                button = new JButton(s);
            }
            if (item.toString().contains("Kirk")) {
                s = "Kirk";
                button = new JButton(s);
            }
            if (item.toString().contains("Riker")) {
                s = "Riker";
                button = new JButton(s);
            }
            if (item.toString().contains("Spock")) {
                s = "Spock";
                button = new JButton(s);
            }
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
        for (Item item : Menu.getSides()) {
            JButton button = new JButton(item.toString());
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
        i = 0;
        for (Item item : Menu.getDrinks()) {
            JButton button = new JButton(item.toString());
            button.setActionCommand(item.toString());
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

    }

    /**
     * actionPerformed.
     *
     *<p>ActionListener that loads appropriate panel from button press.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("BB-Q".equals(e.getActionCommand())) {
            this.parent.loadPanel(new BbqPanel(this.parent));
        }
        if ("Janeway".equals(e.getActionCommand())) {
            this.parent.loadPanel(new JanewayPanel(this.parent));
        }
        if ("Kirk".equals(e.getActionCommand())) {
            this.parent.loadPanel(new KirkPanel(this.parent));
        }
        if ("Riker".equals(e.getActionCommand())) {
            this.parent.loadPanel(new RikerPanel(this.parent));
        }
        if ("Spock".equals(e.getActionCommand())) {
            this.parent.loadPanel(new SpockPanel(this.parent));
        }
        if ("Small Data Chips".equals(e.getActionCommand())) {
            Data data = new Data();
            this.parent.loadPanel(new SidePanel(this.parent, data));
        }
        if ("Medium Data Chips".equals(e.getActionCommand())) {
            Data data = new Data();
            data.setSize(Size.MEDIUM);
            this.parent.loadPanel(new SidePanel(this.parent, data));
        }
        if ("Large Data Chips".equals(e.getActionCommand())) {
            Data data = new Data();
            data.setSize(Size.LARGE);
            this.parent.loadPanel(new SidePanel(this.parent, data));
        }
        if ("Small Borg".equals(e.getActionCommand())) {
            Borg borg = new Borg();
            this.parent.loadPanel(new SidePanel(this.parent, borg));
        }
        if ("Medium Borg".equals(e.getActionCommand())) {
            Borg borg = new Borg();
            borg.setSize(Size.MEDIUM);
            this.parent.loadPanel(new SidePanel(this.parent, borg));
        }
        if ("Large Borg".equals(e.getActionCommand())) {
            Borg borg = new Borg();
            borg.setSize(Size.LARGE);
            this.parent.loadPanel(new SidePanel(this.parent, borg));
        }
        if ("Small Enterprise".equals(e.getActionCommand())) {
            Enterprise ent = new Enterprise();
            this.parent.loadPanel(new SidePanel(this.parent, ent));
        }
        if ("Medium Enterprise".equals(e.getActionCommand())) {
            Enterprise ent = new Enterprise();
            ent.setSize(Size.MEDIUM);
            this.parent.loadPanel(new SidePanel(this.parent, ent));
        }
        if ("Large Enterprise".equals(e.getActionCommand())) {
            Enterprise ent = new Enterprise();
            ent.setSize(Size.LARGE);
            this.parent.loadPanel(new SidePanel(this.parent, ent));
        }
        if ("Small Picard".equals(e.getActionCommand())) {
            Picard pic = new Picard();
            this.parent.loadPanel(new PicardPanel(this.parent, pic));
        }
        if ("Medium Picard".equals(e.getActionCommand())) {
            Picard pic = new Picard();
            pic.setSize(Size.MEDIUM);
            this.parent.loadPanel(new PicardPanel(this.parent, pic));
        }
        if ("Large Picard".equals(e.getActionCommand())) {
            Picard pic = new Picard();
            pic.setSize(Size.LARGE);
            this.parent.loadPanel(new PicardPanel(this.parent, pic));
        }
        if ("Small Troi".equals(e.getActionCommand())) {
            Troi tr = new Troi();
            this.parent.loadPanel(new TroiPanel(this.parent, tr));
        }
        if ("Medium Troi".equals(e.getActionCommand())) {
            Troi tr = new Troi();
            tr.setSize(Size.MEDIUM);
            this.parent.loadPanel(new TroiPanel(this.parent, tr));
        }
        if ("Large Troi".equals(e.getActionCommand())) {
            Troi tr = new Troi();
            tr.setSize(Size.LARGE);
            this.parent.loadPanel(new TroiPanel(this.parent, tr));
        }
        if ("Small Worf".equals(e.getActionCommand())) {
            Worf wf = new Worf();
            this.parent.loadPanel(new WorfPanel(this.parent, wf));
        }
        if ("Medium Worf".equals(e.getActionCommand())) {
            Worf wf = new Worf();
            wf.setSize(Size.MEDIUM);
            this.parent.loadPanel(new WorfPanel(this.parent, wf));
        }
        if ("Large Worf".equals(e.getActionCommand())) {
            Worf wf = new Worf();
            wf.setSize(Size.LARGE);
            this.parent.loadPanel(new WorfPanel(this.parent, wf));
        }
    }
}