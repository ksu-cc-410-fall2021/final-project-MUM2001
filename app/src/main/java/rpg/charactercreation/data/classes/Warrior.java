package rpg.charactercreation.data.classes;

/** 
 * The Warrior class(representation of warrior character class).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with the warrior archetype.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class Warrior extends CharacterClass {

    /**
     * Constructor for the Warrior class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for the warrior archetype.
     *
     */
    public Warrior() {
        this.healthModifier = 10;
        this.staminaModifier = -10;
        this.hitChanceModifier = -10;
        this.defenseModifier = 10;
    }

    /**
     *Overide method to redefine toString() method.
     *
     *<p>Adjusts output to print the name of the Warrior class.
     *
     *@return String description of Warrior
     */
    @Override
    public String toString() {
        return "Warrior";
    }

}