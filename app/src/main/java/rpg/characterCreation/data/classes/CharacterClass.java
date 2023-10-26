package classes;

import data.Character;

public abstract class CharacterClass implements Character {

    protected int healthModifier;
    protected int staminaModifier;
    protected int hitChanceModifier;
    protected int defenseModifier;

    /**
     *Getter for the healthModifier attribute.
     *
     *<p>Gets the healthModifier of the character class.
     *
     *@return int the healthModifier 
     */

    public int getHealthModifier() {
        return this.healthModifier;
    }

    /**
     *Getter for the staminaModifier attribute.
     *
     *<p>Gets the staminaModifier of the character class.
     *
     *@return int the staminaModifier 
     */

    public int getStaminaModifier() {
        return this.staminaModifier;
    }

    /**
     *Getter for the hitChanceModifier attribute.
     *
     *<p>Gets the hitChanceModifier of the character class.
     *
     *@return int the hitChanceModifier 
     */

    public int getHitChanceModifier() {
        return this.hitChanceModifier;
    }

    /**
     *Getter for the defenseModifier attribute.
     *
     *<p>Gets the defenseModifier of the character class.
     *
     *@return int the defenseModifier 
     */

    public int getDefenseModifier() {
        return this.defenseModifier;
    }
}