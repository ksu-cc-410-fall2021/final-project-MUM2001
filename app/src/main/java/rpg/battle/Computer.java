package battle;

import me.MyCharacter;

/**
 * Represents the computer opponent of the player character 
 * used in a particular instance of the fight.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class Computer extends Player {

    /**
     * Constructor with myCharacter instance provided.
     *
     *<p>Builds a dulicate of the myCharacter changible stats so they can
     *  be modified in the fight without changing underlying myCharacter object.
     *
     * @param myCharacter MyCharacter Instance representing player
     */
    public Computer(MyCharacter myCharacter) {
        super(myCharacter);
    }


}