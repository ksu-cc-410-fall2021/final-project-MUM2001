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
import races.Elf;
import races.Race;

/** 
 * The ElfTest class.
 *
 * <p>This class tests the Elf class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class ElfTest {

    @Test 
    public void testInstanceOfRace() {
        Elf rk = new Elf();
        assertTrue(rk instanceof Race);
    }

    @Test 
    public void testInstanceOfCharacter() {
        Elf rk = new Elf();
        assertTrue(rk instanceof Character);
    }   

    @Test 
    public void testValuesSetCorrectly() {
        Elf rk = new Elf();
        assertTrue(rk.getHealthModifier() == -20);
        assertTrue(rk.getStaminaModifier() == 20);
        assertTrue(rk.getHitChanceModifier() == 10);
        assertTrue(rk.getDefenseModifier() == -10);
    }
}