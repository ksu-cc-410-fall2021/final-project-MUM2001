package classes;

/** 
 * The Warrios class(representation of warrior character class).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with a warrior archetype.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class Warrior extends CharacterClass {

    /**
     * Constructor for the Warrior class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for a warrior archetype.
     *
     */
    public Warrior() {
        this.healthModifier = 10;
        this.staminaModifier = -10;
        this.hitChanceModifier = -10;
        this.defenseModifier = 10;
    }

}