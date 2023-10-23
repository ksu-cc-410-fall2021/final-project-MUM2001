package data;

import java.util.LinkedList;

/** 
 * Interface for the Character Items.
 *
 * <p>This is an Interface containing getters for
 *    the Character Objects's price, Health, and Talents.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public interface Character {

    /** 
     * getter method for price of menu objects.
     *
     *@return double
     */
    abstract double getPrice();

    /** 
     * getter method for health points of Charcater objects.
     *
     *@return int
     */
    abstract int getHealth();

    /** 
     * getter method for Talents of Character objects.
     *
     *@return LinkedList
     */
    LinkedList<String> getTalents();
}