package races;


/** 
 * The Dwarf class(representation of the dwarven race).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with the dwarven race.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class Dwarf extends Race {

    /**
     * Constructor for the Dwarf class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for a Dwarven player character.
     *
     */
    public Dwarf() {
        this.healthModifier = 20;
        this.staminaModifier = -20;
        this.hitChanceModifier = -10;
        this.defenseModifier = +10;
    }
}