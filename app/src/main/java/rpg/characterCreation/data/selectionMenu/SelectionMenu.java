package selectionMenu;

import data.Character;
import java.util.LinkedList;
import sfsubs.data.drinks.Picard;
import sfsubs.data.drinks.Troi;
import sfsubs.data.drinks.Worf;
import sfsubs.data.entrees.Bbq;
import sfsubs.data.entrees.Janeway;
import sfsubs.data.entrees.Kirk;
import sfsubs.data.entrees.Riker;
import sfsubs.data.entrees.Spock;
import sfsubs.data.enums.Size;
import sfsubs.data.sides.Borg;
import sfsubs.data.sides.Data;
import sfsubs.data.sides.Enterprise;

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
     *Getter for the list of availible entrees.
     *
     *<p>Gets the availible entrees.
     *
     *@return LinkedList the entrees
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
     *Getter for the list of availible sides.
     *
     *<p>Gets the availible sides.
     *
     *@return LinkedList the sides
     */

    public static LinkedList<Item> getSides() {
        LinkedList<Item> list = new LinkedList<>();
        Data dt = new Data();
        Data dt2 = new Data();
        dt2.setSize(Size.MEDIUM);
        Data dt3 = new Data();
        dt3.setSize(Size.LARGE);
        list.add(dt);
        list.add(dt2);
        list.add(dt3);
        Borg bg = new Borg();
        Borg bg2 = new Borg();
        bg2.setSize(Size.MEDIUM);
        Borg bg3 = new Borg();
        bg3.setSize(Size.LARGE);
        list.add(bg);
        list.add(bg2);
        list.add(bg3);
        Enterprise ent = new Enterprise();
        Enterprise ent2 = new Enterprise();
        ent2.setSize(Size.MEDIUM);
        Enterprise ent3 = new Enterprise();
        ent3.setSize(Size.LARGE);
        list.add(ent);
        list.add(ent2);
        list.add(ent3);
        return list;
    }

    /**
     *Getter for the list of availible drinks.
     *
     *<p>Gets the availible drinks.
     *
     *@return LinkedList the drinks
     */

    public static LinkedList<Item> getDrinks() {
        LinkedList<Item> list = new LinkedList<>();
        Picard pk = new Picard();
        Picard pk2 = new Picard();
        pk2.setSize(Size.MEDIUM);
        Picard pk3 = new Picard();
        pk3.setSize(Size.LARGE);
        list.add(pk);
        list.add(pk2);
        list.add(pk3);
        Troi tr = new Troi();
        Troi tr2 = new Troi();
        tr2.setSize(Size.MEDIUM);
        Troi tr3 = new Troi();
        tr3.setSize(Size.LARGE);
        list.add(tr);
        list.add(tr2);
        list.add(tr3);
        Worf wf = new Worf();
        Worf wf2 = new Worf();
        wf2.setSize(Size.MEDIUM);
        Worf wf3 = new Worf();
        wf3.setSize(Size.LARGE);
        list.add(wf);
        list.add(wf2);
        list.add(wf3);
        return list;
    }

    /**
     *Getter for the list of all availible items.
     *
     *<p>Gets the availible items.
     *
     *@return LinkedList the items
     */

    public static LinkedList<Item> getFullMenu() {
        LinkedList<Item> list = new LinkedList<>();
        list.addAll(Menu.getEntrees());
        list.addAll(Menu.getSides());
        list.addAll(Menu.getDrinks());
        list.addAll(Menu.getCombos());
        return list;
    }

    /**
     *Getter for the list of availible Combos.
     *
     *<p>Gets the availible Combos.
     *
     *@return LinkedList the Combos
     */

    public static LinkedList<Item> getCombos() {
        LinkedList<Item> list = new LinkedList<>();
        Item originalSeries = ComboBuilder.buildCombo("OriginalSeries");
        list.add(originalSeries);
        Item nextGeneration = ComboBuilder.buildCombo("NextGeneration");
        list.add(nextGeneration);
        Item voyageBeyond = ComboBuilder.buildCombo("VoyageBeyond");
        list.add(voyageBeyond);
        Item galaxyClass = ComboBuilder.buildCombo("GalaxyClass");
        list.add(galaxyClass);
        return list;
    }
}