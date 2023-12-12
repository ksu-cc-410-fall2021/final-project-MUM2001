package races;


/** 
 * The Dwarf class(representation of the dwarven race).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with the dwarven race.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
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

    /**
     *Overide method to redefine toString() method.
     *
     *<p>Adjusts output to print an accurate description of
     *   the Dwarven race.
     *
     *@return String description of Dwarf
     */
    @Override
    public String toString() {
        return "Dwarf";
    }
}