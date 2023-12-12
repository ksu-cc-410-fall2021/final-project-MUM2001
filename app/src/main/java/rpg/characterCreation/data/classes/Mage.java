package classes;

/** 
 * The Mage class(representation of the mage character class).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with the mage archetype.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class Mage extends CharacterClass {


    /**
     * Constructor for the Mage class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for the mage archetype.
     *
     */
    public Mage() {
        this.healthModifier = -10;
        this.staminaModifier = -10;
        this.hitChanceModifier = 20;
        this.defenseModifier = 0;
    }

    /**
     *Override method to redefine toString() method.
     *
     *<p>Adjusts output to print name of the Mage class.
     *
     *@return String description of Mage
     */
    @Override
    public String toString() {
        return "Mage";
    }


}