package selectionmenu;

import classes.Mage;
import classes.Rogue;
import classes.Warrior;
import data.Character;
import java.util.LinkedList;
import races.Dwarf;
import races.Elf;
import races.Human;

/** 
 * The SelectionMenu class(an OOP representation of the rpg creator selection menu).
 *
 * <p>This class represents the menu of character aspects to select.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */

public class SelectionMenu {


    /**
     *Getter for the list of availible CharacterClassses.
     *
     *<p>Gets the availible CharacterClassses.
     *
     *@return LinkedList the CharacterClassses
     */

    public static LinkedList<Character> getCharacterClasses() {
        LinkedList<Character> list = new LinkedList<>();
        Mage mg = new Mage();
        list.add(mg);
        Rogue rg = new Rogue();
        list.add(rg);
        Warrior w = new Warrior();
        list.add(w);
        return list;
    }

    /**
     *Getter for the list of availible races.
     *
     *<p>Gets the availible races.
     *
     *@return LinkedList the races
     */

    public static LinkedList<Character> getRaces() {
        LinkedList<Character> list = new LinkedList<>();
        Dwarf dw = new Dwarf();
        list.add(dw);
        Elf elf = new Elf();
        list.add(elf);
        Human hm = new Human();
        list.add(hm);
        return list;
    }
}