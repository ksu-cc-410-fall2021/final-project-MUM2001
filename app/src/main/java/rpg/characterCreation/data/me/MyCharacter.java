package me;

import classes.CharacterClass;
import data.Character;
import enums.Talents;
import races.Race;

/**
 * Represents a custom created player character.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 1.0
 */
public class MyCharacter {

    private String name;
    private CharacterClass characterClass;
    private Race race;
    private Talents talent;
    private int health;
    private int stamina;
    private int hitChance;
    private int defense;


    /**
     * Constructor with name provided.
     *
     * @param name String representing charcater name
     */
    public MyCharacter(String name) {
        if ((name.length() == 0)) {
            this.name = null;
        } else {
            this.name = name;
        }
        this.characterClass = null;
        this.race = null;
        this.talent = null;
        this.health = 100;
        this.stamina = 100;
        this.hitChance = 50;
        this.defense = 50;
    }

    /**
     * Set name.
     *
     *<p>Sets name attribute to specified String.
     *
     * @param name String combo name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get name.
     *
     *<p>Returns name of MyCharacter instance.
     *
     * @return String name of character
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set CharacterClass.
     *
     *<p>Sets the CharacterClass for this MyCharacter instance. Removing and adding correct
     * attribute modifiers as nescessary.
     *
     * @param characterClass Class of the character
     */
    public void setCharacterClass(CharacterClass characterClass) {
        if (this.characterClass != null) {
            this.health -= this.characterClass.getHealthModifier();
            this.stamina -= this.characterClass.getStaminaModifier();
            this.hitChance -= this.characterClass.getHitChanceModifier();
            this.defense -= this.characterClass.getDefenseModifier();
        }
        this.characterClass = characterClass;
        this.health += characterClass.getHealthModifier();
        this.stamina += characterClass.getStaminaModifier();
        this.hitChance += characterClass.getHitChanceModifier();
        this.defense += characterClass.getDefenseModifier();
    }

    /**
     * Get Class.
     *
     *<p>Returns the CharacterClass for this MyCharacter instance.
     *
     * @return CharacterClass class of Character
     */
    public CharacterClass getCharacterClass() {
        return this.characterClass;
    }

    /**
     * Set Race.
     *
     *<p>Sets the Race for this MyCharacter instance. Removing and adding correct
     * attribute modifiers as nescessary.
     *
     * @param race Race of Character
     */
    public void setRace(Race race) {
        if (this.race != null) {
            this.health -= this.race.getHealthModifier();
            this.stamina -= this.race.getStaminaModifier();
            this.hitChance -= this.race.getHitChanceModifier();
            this.defense -= this.race.getDefenseModifier();
        }
        this.race = race;
        this.health += race.getHealthModifier();
        this.stamina += race.getStaminaModifier();
        this.hitChance += race.getHitChanceModifier();
        this.defense += race.getDefenseModifier();
    }

    /**
     * Get Race.
     *
     *<p>Returns the Race for this MyCharacter instance.
     *
     * @return Race race of Character
     */
    public Race getRace() {
        return this.race;
    }

    /**
     * Set Talent.
     *
     *<p>Sets the Talent for this MyCharacter instance. Removing and adding correct
     * attribute modifiers as nescessary.
     *
     *<p>Sets characters talent.
     *
     *@param talent the chosen perk of the character.
     */
    public void setTalent(Talents talent) {
        if (this.talent != null) {
            if (this.talent.equals(Talents.LEFT_HANDER)) {
                this.hitChance -= 10;
            } else {
                if (this.talent.equals(Talents.STOCKY)) {
                    this.defense += 10;
                    this.health -= 10;
                } else {
                    if (this.talent.equals(Talents.TALL)) {
                        this.defense -= 5;
                        this.hitChance -= 5;
                    } else {
                        if (this.talent.equals(Talents.FAST_TWITCH)) {
                            this.stamina += 20;
                            this.hitChance -= 20;
                        } else {
                            if (this.talent.equals(Talents.MARATHON_RUNNER)) {
                                this.stamina -= 10;
                                this.hitChance += 10; 
                            }
                        }
                    }
                }
            }
        }
        this.talent = talent;
        if (talent.equals(Talents.LEFT_HANDER)) {
            this.hitChance += 10;
        } else {
            if (talent.equals(Talents.STOCKY)) {
                this.defense -= 10;
                this.health += 10;
            } else {
                if (talent.equals(Talents.TALL)) {
                    this.defense += 5;
                    this.hitChance += 5;
                } else {
                    if (talent.equals(Talents.FAST_TWITCH)) {
                        this.stamina -= 20;
                        this.hitChance += 20;
                    } else {
                        if (talent.equals(Talents.MARATHON_RUNNER)) {
                            this.stamina += 10;
                            this.hitChance -= 10; 
                        }
                    }
                }
            }
        }
    }

    /**
     * Get Talent.
     *
     *<p>Returns Talent of this MyCharacter instance.
     *
     * @return Talents talent of Character
     */
    public Talents getTalent() {
        return this.talent;
    }

    /**
     * Get health.
     *
     *<p>Returns health attribute of this MyCharacter instance.
     *
     * @return int health of character
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Get stamina.
     *
     *<p>Returns stamina attribute of this MyCharacter instance.
     *
     * @return int stamina of character
     */
    public int getStamina() {
        return this.stamina;
    }

    /**
     * Get hitChance.
     *
     *<p>Returns hitChance attribute of this MyCharacter instance.
     *
     * @return int hitChance of character
     */
    public int getHitChance() {
        return this.hitChance;
    }

    /**
     * Get defense.
     *
     *<p>Returns defense attribute of this MyCharacter instance.
     *
     * @return int defense of character
     */
    public int getDefense() {
        return this.defense;
    }

    /**
     * Clear all myCharacter attributes.
     *
     *<p>Resets all MyCharacter attributes back to null or default values.
     *  Used for testing.
     *
     */
    public void clearCharacter() {
        this.name = null;
        this.characterClass = null;
        this.race = null;
        this.talent = null;
        this.health = 100;
        this.stamina = 100;
        this.hitChance = 50;
        this.defense = 50;
    }
}