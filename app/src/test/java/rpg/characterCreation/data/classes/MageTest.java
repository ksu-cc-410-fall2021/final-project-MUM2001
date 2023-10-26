package classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import classes.CharacterClass;
import classes.Mage;
import data.Character;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

/** 
 * The MageTest class.
 *
 * <p>This class tests the Mage class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class MageTest {

    @Test 
    public void testInstanceOfCharacterClass() {
        Mage rk = new Mage();
        assertTrue(rk instanceof CharacterClass);
    }

    @Test 
    public void testInstanceOfCharacter() {
        Mage rk = new Mage();
        assertTrue(rk instanceof Character);
    }   

    @Test 
    public void testValuesSetCorrectly() {
        Mage rk = new Mage();
        assertTrue(rk.getHealthModifier() == -10);
        assertTrue(rk.getStaminaModifier() == -10);
        assertTrue(rk.getHitChanceModifier() == 20);
        assertTrue(rk.getDefenseModifier() == 0);
    }
}