package rpg.charactercreation.data.races;

import rpg.charactercreation.data.Character;


/** 
 * The Race class(representation of a character's race).
 *
 * <p>This class is an abstract base for the various races
 *    available for players to play as.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public abstract class Race implements Character {

    protected int healthModifier;
    protected int staminaModifier;
    protected int hitChanceModifier;
    protected int defenseModifier;

    /**
     *Getter for the healthModifier attribute.
     *
     *<p>Gets the healthModifier of the character race.
     *
     *@return int the healthModifier 
     */
    public int getHealthModifier() {
        return this.healthModifier;
    }

    /**
     *Getter for the staminaModifier attribute.
     *
     *<p>Gets the staminaModifier of the character race.
     *
     *@return int the staminaModifier 
     */
    public int getStaminaModifier() {
        return this.staminaModifier;
    }

    /**
     *Getter for the hitChanceModifier attribute.
     *
     *<p>Gets the hitChanceModifier of the character race.
     *
     *@return int the hitChanceModifier 
     */
    public int getHitChanceModifier() {
        return this.hitChanceModifier;
    }

    /**
     *Getter for the defenseModifier attribute.
     *
     *<p>Gets the defenseModifier of the character race.
     *
     *@return int the defenseModifier 
     */
    public int getDefenseModifier() {
        return this.defenseModifier;
    }
}