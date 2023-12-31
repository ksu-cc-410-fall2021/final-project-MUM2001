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
import rpg.charactercreation.data.classes.Rogue;

/** 
 * The RogueTest class.
 *
 * <p>This class tests the Rogue class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class RogueTest {

    /**
     * Test Rogue has correct description.
     */
    @Test 
    public void testToStringReturnsCorrectDescription() {
        Rogue rk = new Rogue();
        assertTrue(rk.toString().equals("Rogue"));
    }

    /**
     * Test Rogue inherits from CharacterClass directly.
     */
    @Test 
    public void testInstanceOfCharacterClass() {
        Rogue rk = new Rogue();
        assertTrue(rk instanceof CharacterClass);
    }

    /**
     * Test Rogue implements Character.
     */
    @Test 
    public void testInstanceOfCharacter() {
        Rogue rk = new Rogue();
        assertTrue(rk instanceof Character);
    }   

    /**
     * Test Rogue has correct modifier values.
     */
    @Test 
    public void testValuesSetCorrectly() {
        Rogue rk = new Rogue();
        assertTrue(rk.getHealthModifier() == -10);
        assertTrue(rk.getStaminaModifier() == +10);
        assertTrue(rk.getHitChanceModifier() == 10);
        assertTrue(rk.getDefenseModifier() == -10);
    }
}