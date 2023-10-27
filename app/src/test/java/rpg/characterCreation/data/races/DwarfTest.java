package races;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import data.Character;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import races.Dwarf;
import races.Race;

/** 
 * The DwarfTest class.
 *
 * <p>This class tests the Dwarf class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class DwarfTest {

    @Test 
    public void testToStringReturnsCorrectDescription() {
        Dwarf rk = new Dwarf();
        assertTrue(rk.toString().equals("Dwarf"));
    }

    @Test 
    public void testInstanceOfRace() {
        Dwarf rk = new Dwarf();
        assertTrue(rk instanceof Race);
    }

    @Test 
    public void testInstanceOfCharacter() {
        Dwarf rk = new Dwarf();
        assertTrue(rk instanceof Character);
    }   

    @Test 
    public void testValuesSetCorrectly() {
        Dwarf rk = new Dwarf();
        assertTrue(rk.getHealthModifier() == 20);
        assertTrue(rk.getStaminaModifier() == -20);
        assertTrue(rk.getHitChanceModifier() == -10);
        assertTrue(rk.getDefenseModifier() == 10);
    }
}