package me;

import data.Character;
import classes.Class;
import enums.Talents;
import races.Race;
import java.lang.IllegalArgumentException;
import java.util.LinkedList;

/**
 * Represents a player character.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class myCharacter implements Character {

    private String name;
    private Class class;
    private Race race;
    private Talent talent;
    private int health;
    private int stamina;
    private int baseHitChance;


    /**
     * Constructor with name provided.
     *
     * @param name String representing charcater name
     */
    public myCharacter(String name) {
        if ((name.length() == 0)) {
            this.name = null;
        } else {
            this.name = name;
        }
        this.class = null;
        this.race = null;
        this.talent = null;
        this.health = 0;
        this.stamina = 0;
        this.baseHitChance = 0;
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
     * Set Class.
     *
     * @param class Class of character
     */
    public void setClass(Class class) {
        this.class = class;
        this.health += class.healthModifier;
        this.health += class.staminaModifier;
    }

    /**
     * Get Class.
     *
     * @return Class class of Character
     */
    public Class getClass() {
        return this.class;
    }

    /**
     * Set Race.
     *
     * @param race Race of Character
     */
    public void setRace(Race race) {
        this.race = race;
        this.health += race.healthModifier;
        this.health += race.staminaModifier;
    }

    /**
     * Get Race.
     *
     * @return Race race of Character
     */
    public Drink getRace() {
        return this.race;
    }

    /**
     * Set Talent.
     *
     * @param Talent talent of Character
     */
    public void setTalent(Talent talent) {
        this.talent = talent;
        if (talent.equals(talent.LEFT_HANDER)) {
            baseHitChance += 1;
        } else {
            if (talent.equals(talent.LEFT_HANDER)) {
            baseHitChance += 1;
            }
        }
    }

    /**
     * Get Talent.
     *
     * @return Talent talent of Character
     */
    public Talent getTalent() {
        return this.talent;
    }

    /**
     * Clear all myCharacter attributes.
     *
     *<p>Sets all MyCharacter attributes back to null.
     */
    public void clearCharacter() {
        this.name = null;
        this.class = null;
        this.race = null;
        this.talent = null;
    }


    /**
     * Get All Items.
     *
     * @return LinkedList Items in Character
     */
    public LinkedList<Item> getAllItems() {
        LinkedList<Item> list = new LinkedList<>();
        if (this.class != null) {
            list.add(this.class);
        }
        if (this.race != null) {
            list.add(this.race);
        }
        if (this.talent != null) {
            list.add(this.talent);
        }
        return list;
    }

}