package races;


public abstract class Race implements Character{

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

    public int gethealthModifier() {
        return this.healthModifier;
    }

    /**
     *Setter for the healthModifier attribute.
     *
     *<p>Sets the healthModifier.
     *
     *@param h the health modifier
     */

    public void sethealthModifier(int h) {
        this.healthModifier = h;
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
     *Setter for the staminaModifier attribute.
     *
     *<p>Sets the staminaModifier.
     *
     *@param h the staminaModifier
     */

    public void setStaminaModifier(int h) {
        this.staminaModifier = h;
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
     *Setter for the hitChanceModifier attribute.
     *
     *<p>Sets the hitChanceModifier.
     *
     *@param h the hitChanceModifier
     */

    public void setHitChanceModifier(int h) {
        this.hitChanceModifier = h;
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

    /**
     *Setter for the defenseModifier attribute.
     *
     *<p>Sets the defenseModifier.
     *
     *@param h the defenseModifier
     */

    public void setDefenseModifier(int h) {
        this.defenseModifier = h;
    }
}