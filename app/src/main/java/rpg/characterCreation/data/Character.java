package data;

import java.util.LinkedList;

/** 
 * Interface for the various aspects of a Character.
 *
 * <p>This is an Interface containing getters for
 *    the Character Objects's Stamina, Health, HitChance and Defense modifiers.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public interface Character {

    /** 
     * getter method for stamina modifier of character aspects.
     *
     *@return double
     */
    abstract int getStaminaModifier();

    /** 
     * getter method for health modifier of Charcater aspects.
     *
     *@return int
     */
    abstract int getHealthModifier();

    /** 
     * getter method for hit chance modifier of Character aspects.
     *
     *@return int
     */
    abstract int getHitChanceModifier();

    /** 
     * getter method for defense modifier of Character aspects.
     *
     *@return int
     */
    abstract int getDefenseModifier();
}