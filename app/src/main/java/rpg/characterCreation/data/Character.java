package data;

import java.util.LinkedList;

/** 
 * Interface for the Character Items.
 *
 * <p>This is an Interface containing getters for
 *    the Character Objects's Stamina, Health, HitChance and Defense modifiers.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public interface Character {

    /** 
     * getter method for stamina modifier of character objects.
     *
     *@return double
     */
    abstract int getStaminaModifier();

    /** 
     * getter method for health points of Charcater objects.
     *
     *@return int
     */
    abstract int getHealthModifier();

    /** 
     * getter method for hit chance modifier of Character objects.
     *
     *@return int
     */
    abstract int getHitChanceModifier();

    /** 
     * getter method for defense modifier of Character objects.
     *
     *@return int
     */
    abstract int getDefenseModifier();
}