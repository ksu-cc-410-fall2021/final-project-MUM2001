package rpg.charactercreation.data.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.IllegalArgumentException;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import rpg.charactercreation.data.Character;
import rpg.charactercreation.data.classes.Mage;
import rpg.charactercreation.data.classes.Rogue;
import rpg.charactercreation.data.classes.Warrior;
import rpg.charactercreation.data.races.Dwarf;
import rpg.charactercreation.data.races.Elf;
import rpg.charactercreation.data.races.Human;
import rpg.charactercreation.data.selectionmenu.SelectionMenu;


/** 
 * The SelectionMenuTest class.
 *
 * <p>This class tests the SelectionMenu class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class SelectionMenuTest {

    /**
     * Test Menu Class List has Mage in it.
     */
    @Test 
    public void testMenuHasMageInCharacterClassesList() {
        SelectionMenu menu = new SelectionMenu();
        boolean b = false;
        LinkedList<Character> list = menu.getCharacterClasses();
        for (Character i : list) {
            if (i instanceof Mage) {
                b = true;
                break;
            }
        }
        assertTrue(b);
    }

    /**
     * Test Menu Class List has Warrior in it.
     */
    @Test 
    public void testMenuHasWarriorInCharacterClassesList() {
        SelectionMenu menu = new SelectionMenu();
        boolean b = false;
        LinkedList<Character> list = menu.getCharacterClasses();
        for (Character i : list) {
            if (i instanceof Warrior) {
                b = true;
                break;
            }
        }
        assertTrue(b);
    }

    /**
     * Test Menu Class List has Rogue in it.
     */
    @Test 
    public void testMenuHasRogueInCharacterClassesList() {
        SelectionMenu menu = new SelectionMenu();
        boolean b = false;
        LinkedList<Character> list = menu.getCharacterClasses();
        for (Character i : list) {
            if (i instanceof Rogue) {
                b = true;
                break;
            }
        }
        assertTrue(b);
    }

    /**
     * Test Menu Race List has Dwarf in it.
     */
    @Test 
    public void testMenuHasDwarfInRacesList() {
        SelectionMenu menu = new SelectionMenu();
        boolean b = false;
        LinkedList<Character> list = menu.getRaces();
        for (Character i : list) {
            if (i instanceof Dwarf) {
                b = true;
                break;
            }
        }
        assertTrue(b);
    }

    /**
     * Test Menu Race List has Elf in it.
     */
    @Test 
    public void testMenuHasElfInRacesList() {
        SelectionMenu menu = new SelectionMenu();
        boolean b = false;
        LinkedList<Character> list = menu.getRaces();
        for (Character i : list) {
            if (i instanceof Elf) {
                b = true;
                break;
            }
        }
        assertTrue(b);
    }

    /**
     * Test Menu Race List has Human in it.
     */
    @Test 
    public void testMenuHasHumanInRacesList() {
        SelectionMenu menu = new SelectionMenu();
        boolean b = false;
        LinkedList<Character> list = menu.getRaces();
        for (Character i : list) {
            if (i instanceof Human) {
                b = true;
                break;
            }
        }
        assertTrue(b);
    }

    /**
     * Test Menu Race List has length of 3 items.
     */
    @Test 
    public void testMenuRacesListHasLength3() {
        SelectionMenu menu = new SelectionMenu();
        boolean b = false;
        LinkedList<Character> list = menu.getRaces();
        assertTrue(list.size() == 3);
    }

    /**
     * Test Menu Class List has length of 3 items.
     */
    @Test 
    public void testMenuCharacterClassListHasLength3() {
        SelectionMenu menu = new SelectionMenu();
        boolean b = false;
        LinkedList<Character> list = menu.getCharacterClasses();
        assertTrue(list.size() == 3);
    }
}