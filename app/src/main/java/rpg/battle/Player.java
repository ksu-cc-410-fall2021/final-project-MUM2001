package battle;

import me.MyCharacter;

/**
 * Represents the player character used in a particular.
 * instance of the fight.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class Player {

    private MyCharacter myCharacter;

    /**
     * Constructor with myCharacter instance provided.
     *
     * @param myCharacter MyCharacter Instance representing player
     */
    public Player(MyCharacter myCharacter) {
        this.myCharacter = myCharacter;
    }
}