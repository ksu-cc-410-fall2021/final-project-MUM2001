package battle;

import enums.Talents;
import me.MyCharacter;

/**
 * Represents a player character used in a particular.
 * instance of the fight.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class Player {

    private MyCharacter myCharacter;
    private int health;
    private int stamina;
    private int hitChance;
    private int defense;

    /**
     * Constructor with myCharacter instance provided.
     *
     *<p>Builds a dulicate of the myCharacter changible stats so they can
     *  be modified in the fight without changing underlying myCharacter object.
     *
     * @param myCharacter MyCharacter Instance representing player
     */
    public Player(MyCharacter myCharacter) {
        this.myCharacter = myCharacter;
        this.health = myCharacter.getHealth();
        this.stamina = myCharacter.getStamina();
        this.hitChance = myCharacter.getHitChance();
        this.defense = myCharacter.getDefense();
    }

    /*
     * Get name.
     *
     * @return String name of character
     */
    public String getName() {
        return this.myCharacter.getName();
    }

    /**
     * Get Talent.
     *
     * @return Talents talent of Character
     */
    public Talents getTalent() {
        return this.myCharacter.getTalent();
    }

    /**
     * Get Current health.
     *
     * @return int health of character
     */
    public int getCurrentHealth() {
        return this.health;
    }

    /**
     * Get Current stamina.
     *
     * @return int stamina of character
     */
    public int getCurrentStamina() {
        return this.stamina;
    }

    /**
     * Get Total health.
     *
     * @return int health of character
     */
    public int getTotalHealth() {
        return this.myCharacter.getHealth();
    }

    /**
     * Get Total stamina.
     *
     * @return int stamina of character
     */
    public int getTotalStamina() {
        return this.myCharacter.getStamina();
    }

    /**
     * Get hitChance.
     *
     * @return int hitChance of character
     */
    public int getHitChance() {
        return this.hitChance;
    }

    /**
     * Get defense.
     *
     * @return int defense of character
     */
    public int getDefense() {
        return this.defense;
    }

    /**
     * Changes Character Health in response to Hit.
     *
     * @param damage damage of the attack
     */
    public void takeHit(int damage) {
        this.health = this.health - damage;
    }

    /**
     * Changes Character Stamina in response to attacking.
     *
     */
    public void makeHit() {
        this.stamina = this.stamina - 20;
    }

    /**
     * resets stamina to max when needed.
     *
     *<p>Used when player Defends or exhausts all stamina.
     *
     */
    public void resetStamina() {
        this.stamina = this.getTotalStamina();
    }

    /**
     * Slightly heals Character.
     *
     *<p>Used when player defends.
     *
     */
    public void heal() {
        this.health = this.health + 5;
        if (this.health > this.getTotalHealth()) {
            this.health = this.getTotalHealth();
        }
    }

    /**
     * Tests if the Character has requisite attributes to start fight.
     *
     * @return boolean Character ready or not
     */
    public boolean valid() {
        if (this.myCharacter.getName() != null) {
            if (this.myCharacter.getRace() != null) {
                if (this.myCharacter.getCharacterClass() != null) {
                    if (this.myCharacter.getTalent() != null) {
                        return true;
                    }
                }
            }
        } 
        return false;
    }
}