package data;

import java.util.LinkedList;

/** 
 * Interface for the Character Items.
 *
 * <p>This is an Interface containing getters for
 *    the Character Objects's Stamina, Health, and Talent.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public interface Character {

    /** 
     * getter method for stamin of character objects.
     *
     *@return double
     */
    abstract double getStamina();

    /** 
     * getter method for health points of Charcater objects.
     *
     *@return int
     */
    abstract int getHealth();

    /** 
     * getter method for Talent of Character objects.
     *
     *@return LinkedList
     */
    LinkedList<String> getTalent();
}