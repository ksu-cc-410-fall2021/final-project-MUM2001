package classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import classes.CharacterClass;
import classes.Warrior;
import data.Character;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;


/** 
 * The WarriorTest class.
 *
 * <p>This class tests the Rogue class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class WarriorTest {

    @Test 
    public void testInstanceOfCharacterClass() {
        Warrior rk = new Warrior();
        assertTrue(rk instanceof CharacterClass);
    }

    @Test 
    public void testInstanceOfCharacter() {
        Warrior rk = new Warrior();
        assertTrue(rk instanceof Character);
    }   

    @Test 
    public void testValuesSetCorrectly() {
        Warrior rk = new Warrior();
        assertTrue(rk.getHealthModifier() == 10);
        assertTrue(rk.getStaminaModifier() == -10);
        assertTrue(rk.getHitChanceModifier() == -10);
        assertTrue(rk.getDefenseModifier() == 10);
    }
}