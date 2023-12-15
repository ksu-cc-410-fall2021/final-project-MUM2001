package rpg.charactercreation.data.races;


/** 
 * The Human class(representation of the human race).
 *
 * <p>This class contains the numerical bonuses associated 
 *  with the human race.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class Human extends Race {

    /**
     * Constructor for the Human class.
     *
     *<p>Sets the appropriate modifiers to a character's
     *  attributes for a human player character.
     *
     */
    public Human() {
        this.healthModifier = 0;
        this.staminaModifier = 0;
        this.hitChanceModifier = 0;
        this.defenseModifier = 0;
    }

    /**
     *Overide method to redefine toString() method.
     *
     *<p>Adjusts output to print an accurate description of
     *   the Human race.
     *
     *@return String description of Human
     */
    @Override
    public String toString() {
        return "Human";
    }

}