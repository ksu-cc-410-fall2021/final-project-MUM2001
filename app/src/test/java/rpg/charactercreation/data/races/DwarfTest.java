package rpg.charactercreation.data.races;

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
import rpg.charactercreation.data.races.Dwarf;
import rpg.charactercreation.data.races.Race;

/** 
 * The DwarfTest class.
 *
 * <p>This class tests the Dwarf class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class DwarfTest {

    /**
     * Test Dwarf description is correct.
     */
    @Test 
    public void testToStringReturnsCorrectDescription() {
        Dwarf rk = new Dwarf();
        assertTrue(rk.toString().equals("Dwarf"));
    }

    /**
     * Test Dwarf inherits from Race.
     */
    @Test 
    public void testInstanceOfRace() {
        Dwarf rk = new Dwarf();
        assertTrue(rk instanceof Race);
    }

    /**
     * Test Dwarf implements Character.
     */
    @Test 
    public void testInstanceOfCharacter() {
        Dwarf rk = new Dwarf();
        assertTrue(rk instanceof Character);
    }   

    /**
     * Test Dwarf has correct stat modifiers.
     */
    @Test 
    public void testValuesSetCorrectly() {
        Dwarf rk = new Dwarf();
        assertTrue(rk.getHealthModifier() == 20);
        assertTrue(rk.getStaminaModifier() == -20);
        assertTrue(rk.getHitChanceModifier() == -10);
        assertTrue(rk.getDefenseModifier() == 10);
    }
}