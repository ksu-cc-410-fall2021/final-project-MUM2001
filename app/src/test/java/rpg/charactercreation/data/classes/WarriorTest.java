package rpg.charactercreation.data.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import rpg.charactercreation.data.Character;
import rpg.charactercreation.data.classes.CharacterClass;
import rpg.charactercreation.data.classes.Warrior;


/** 
 * The WarriorTest class.
 *
 * <p>This class tests the Rogue class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class WarriorTest {

    /**
     * Test Warrior has correct description.
     */
    @Test 
    public void testToStringReturnsCorrectDescription() {
        Warrior rk = new Warrior();
        assertTrue(rk.toString().equals("Warrior"));
    }

    /**
     * Test Warrior inherits from CharacterClass directly.
     */
    @Test 
    public void testInstanceOfCharacterClass() {
        Warrior rk = new Warrior();
        assertTrue(rk instanceof CharacterClass);
    }

    /**
     * Test Warrior implements Character.
     */
    @Test 
    public void testInstanceOfCharacter() {
        Warrior rk = new Warrior();
        assertTrue(rk instanceof Character);
    }   

    /**
     * Test Warrior has correct modifier values.
     */
    @Test 
    public void testValuesSetCorrectly() {
        Warrior rk = new Warrior();
        assertTrue(rk.getHealthModifier() == 10);
        assertTrue(rk.getStaminaModifier() == -10);
        assertTrue(rk.getHitChanceModifier() == -10);
        assertTrue(rk.getDefenseModifier() == 10);
    }
}