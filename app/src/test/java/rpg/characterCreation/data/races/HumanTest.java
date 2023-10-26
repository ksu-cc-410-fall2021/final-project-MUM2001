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
import races.Human;
import races.Race;

/** 
 * The HumanTest class.
 *
 * <p>This class tests the Human class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class HumanTest {

    @Test 
    public void testInstanceOfRace() {
        Human rk = new Human();
        assertTrue(rk instanceof Race);
    }

    @Test 
    public void testInstanceOfCharacter() {
        Human rk = new Human();
        assertTrue(rk instanceof Character);
    }   

    @Test 
    public void testValuesSetCorrectly() {
        Human rk = new Human();
        assertTrue(rk.getHealthModifier() == 0);
        assertTrue(rk.getStaminaModifier() == 0);
        assertTrue(rk.getHitChanceModifier() == 0);
        assertTrue(rk.getDefenseModifier() == 0);
    }
}