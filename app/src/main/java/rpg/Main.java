package rpg;

import java.lang.Runnable;
import javax.swing.SwingUtilities;
import rpg.gui.PrimaryWindow;

/**
 * Main Class of Project.
 *
 *<p>Loads GUI Panels: Primary Window, CreationPanel, CharacterPanel,
 *  FightPanel.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class Main {

    /**
     *Main method to load gui.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PrimaryWindow().setVisible(true);
            }
        });

    }
}
