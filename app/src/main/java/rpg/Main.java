package rpg;

import gui.PrimaryWindow;
import java.lang.Runnable;
import javax.swing.SwingUtilities;

/**
 * Main Class of Project.
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
