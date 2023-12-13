package rpg.battle;

import rpg.charactercreation.data.enums.Talents;
import rpg.charactercreation.data.me.MyCharacter;

/**
 * Represents a player character used in a particular.
 * instance of the fight.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 1.0
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
     *<p>Builds a dulicate of the myCharacter instance 
     *  to be used in a fight. Allowing changes to be made to these attributes
     *  in the fight without changing underlying myCharacter instance.
     *
     * @param myCharacter base MyCharacter instance Player is representing
     */
    public Player(MyCharacter myCharacter) {
        this.myCharacter = myCharacter;
        this.health = myCharacter.getHealth();
        this.stamina = myCharacter.getStamina();
        this.hitChance = myCharacter.getHitChance();
        this.defense = myCharacter.getDefense();
    }

    /*
     * Get MyCharacter.
     *
     *<p>Returns the base MyCharacter instance.
     *
     * @return MyCharacter instance used as base for player
     */
    public MyCharacter getMyCharacter() {
        return this.myCharacter;
    }

    /*
     * Get name.
     *
     *<p>Returns the name of the base MyCharacter instance.
     *
     * @return String name of player
     */
    public String getName() {
        return this.myCharacter.getName();
    }

    /**
     * Get Current health.
     *
     *<p>Returns the current health stat of this player instance.
     *
     * @return int health of player
     */
    public int getCurrentHealth() {
        return this.health;
    }

    /**
     * Get Current stamina.
     *
     *<p>Returns the current stamina stat of this player instance.
     *
     * @return int stamina of player
     */
    public int getCurrentStamina() {
        return this.stamina;
    }

    /**
     * Get Total health.
     *
     *<p>Returns the total health stat of this player instance.
     *  That being the base MyCharacter instance's health.
     *
     * @return int health of player
     */
    public int getTotalHealth() {
        return this.myCharacter.getHealth();
    }

    /**
     * Get Total stamina.
     *
     *<p>Returns the total stamina stat of this player instance.
     *  That being the base MyCharacter instance's stamina.
     *
     * @return int stamina of player
     */
    public int getTotalStamina() {
        return this.myCharacter.getStamina();
    }

    /**
     * Get hitChance.
     *
     *<p>Returns the hit chance stat of this player instance.
     *
     * @return int hitChance of player
     */
    public int getHitChance() {
        return this.hitChance;
    }

    /**
     * Get defense.
     *
     *<p>Returns the defense stat of this player instance.
     *
     * @return int defense of player
     */
    public int getDefense() {
        return this.defense;
    }

    /**
     * Changes Character Health in response to Hit.
     *
     *<p>Subtracts damage taken from player instance's health.
     *
     * @param damage damage of the attack
     */
    public void takeHit(int damage) {
        this.health = this.health - damage;
    }

    /**
     * Changes Character Stamina in response to attacking.
     *
     *<p>Subtracts 20 points from stamina when an attack is attempted.
     *  to simulate effort exerted attacking.
     *
     */
    public void makeHit() {
        this.stamina = this.stamina - 20;
    }

    /**
     * resets stamina to max when needed.
     *
     *<p>Used when player Defends(resting) or exhausts all stamina.
     *
     */
    public void resetStamina() {
        this.stamina = this.getTotalStamina();
    }

    /**
     * Slightly heals Character.
     *
     *<p>Used when player defends. Heals for 5 points unless that makes
     *  health greater then max possible, in that case, sets it to max
     *  health of character.
     *
     */
    public void heal() {
        this.health = this.health + 5;
        if (this.health > this.getTotalHealth()) {
            this.health = this.getTotalHealth();
        }
    }

    /**
     * Tests if the base MyCharacter instance has requisite attributes 
     * to start fight.
     *
     *<p>Checks to make sure all attributes are set and name isn't empty.
     *
     * @return boolean Character ready or not
     */
    public boolean valid() {
        if (this.myCharacter.getName() != null && this.myCharacter.getName().length() != 0) {
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