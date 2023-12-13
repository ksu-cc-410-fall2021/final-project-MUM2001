package rpg.charactercreation.data.classes;


/** 
 * The Rogue class(representation of rogue character class).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with the rogue archetype.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class Rogue extends CharacterClass {

    /**
     * Constructor for the Rogue class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for the rogue archetype.
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
     *<p>Adjusts output to print the name of the Rogue class.
     *
     *@return String description of Rogue
     */
    @Override
    public String toString() {
        return "Rogue";
    }

}