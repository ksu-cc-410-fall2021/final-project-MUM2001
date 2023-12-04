package battle;

import com.wildpi.games.structures.dice.Die;
import com.wildpi.games.structures.dice.DieBuilder;

/** 
 * The Dice class(represents dice used in battle mode).
 *
 * <p>This class is implements an external dice library to create
 *    dice objects for use in the battle mode.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class Dice {

    private Die<Integer> die;

    /**
     *Constructor for Dice class.
     */
    public Dice() {
        Integer[] d20values = new Integer[]{1, 2, 
            3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        this.die = DieBuilder.fairDie(d20values);
    }

    /**
     *Rolls the die object to get a new value.
     *
     *@return Integer
     */
    public Integer roll() {
        this.die.roll();
        return this.die.getValue();
    }

}