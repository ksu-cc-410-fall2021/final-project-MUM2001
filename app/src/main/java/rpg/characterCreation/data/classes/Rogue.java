package classes;


/** 
 * The Rogue class(representation of rogue character class).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with a rogue archetype.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class Rogue extends CharacterClass {

    /**
     * Constructor for the Rogue class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for a rogue archetype.
     *
     */
    public Rogue() {
        this.healthModifier = -10;
        this.staminaModifier = 10;
        this.hitChanceModifier = 10;
        this.defenseModifier = -10;
    }

    /**
     *Overide method to redefine toString() method.
     *
     *<p>Adjusts output to print an accurate description of
     *   the Rogue class.
     *
     *@return String description of Rogue
     */

    @Override
    public String toString() {
        return "Rogue";
    }

}