package me;

import classes.CharacterClass;
import data.Character;
import enums.Talents;
import races.Race;

/**
 * Represents a player character.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
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
     * @param name String combo name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get name.
     *
     * @return String name of character
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set CharacterClass.
     *
     * @param characterClass Class of the character
     */
    public void setCharacterClass(CharacterClass characterClass) {
        if (this.characterClass != null) {
            this.health -= characterClass.getHealthModifier();
            this.stamina -= characterClass.getStaminaModifier();
            this.hitChance -= characterClass.getHitChanceModifier();
            this.defense -= characterClass.getDefenseModifier();
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
     * @return CharacterClass class of Character
     */
    public CharacterClass getCharacterClass() {
        return this.characterClass;
    }

    /**
     * Set Race.
     *
     * @param race Race of Character
     */
    public void setRace(Race race) {
        if (this.race != null) {
            this.health -= race.getHealthModifier();
            this.stamina -= race.getStaminaModifier();
            this.hitChance -= race.getHitChanceModifier();
            this.defense -= race.getDefenseModifier();
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
     * @return Race race of Character
     */
    public Race getRace() {
        return this.race;
    }

    /**
     * Set Talent.
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
            //
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
     * @return Talents talent of Character
     */
    public Talents getTalent() {
        return this.talent;
    }

    /**
     * Get health.
     *
     * @return int health of character
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Get stamina.
     *
     * @return int stamina of character
     */
    public int getStamina() {
        return this.stamina;
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
     * Clear all myCharacter attributes.
     *
     *<p>Sets all MyCharacter attributes back to null or default values.
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