package races;


/** 
 * The Elf class(representation of the elven race).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with the elven race.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class Elf extends Race {

    /**
     * Constructor for the Elf class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for an elven player character.
     *
     */
    public Elf() {
        this.healthModifier = -20;
        this.staminaModifier = 20;
        this.hitChanceModifier = 10;
        this.defenseModifier = -10;
    }

}