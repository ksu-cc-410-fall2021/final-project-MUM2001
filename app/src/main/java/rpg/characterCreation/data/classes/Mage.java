package classes;

/** 
 * The Mage class(representation of mage character class).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with a mage archetype.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class Mage extends CharacterClass {


    /**
     * Constructor for the Mage class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for a mage archetype.
     *
     */
    public Mage() {
        this.healthModifier = -10;
        this.staminaModifier = -10;
        this.hitChanceModifier = 20;
        this.defenseModifier = 0;
    }

}