package battle;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import enums.Talents;
import me.MyCharacter;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;


/** 
 * The PlayerTest class.
 *
 * <p>This class tests the Player class for the battle simulation.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
@MockitoSettings(strictness = Strictness.STRICT_STUBS)
public class PlayerTest {

    @Mock
    MyCharacter mockCharacter;

    @Mock
    Talents mockTalent;

    /**
     * Test Player constructor instanciates Chararacter Correctly.
     */
    @Test
    public void testPlayerIntsanciationSetsAttributesAppropriately() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        when(mockCharacter.getName()).thenReturn("Mike");
        Player player = new Player(mockCharacter);
        assertTrue(player.getMyCharacter() == mockCharacter);
        assertTrue(player.getTotalHealth() == 100);
        assertTrue(player.getTotalStamina() == 100);
        assertTrue(player.getHitChance() == 50);
        assertTrue(player.getDefense() == 50);
        assertTrue(player.getName() == "Mike");
    }

    /**
     * Test Player get current health returns the correct starting health.
     */
    @Test
    public void testPlayerGetCurrentHealthReturnsCorrectStartingHealth() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        Player player = new Player(mockCharacter);
        assertTrue(player.getCurrentHealth() == 100);
    }

    /**
     * Test Player constructor instanciates Chararacter Correctly.
     */
    @Test
    public void testPlayerIntsanciationSetsTalentAppropriately() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        when(mockCharacter.getTalent()).thenReturn(mockTalent);
        Player player = new Player(mockCharacter);
        assertTrue(player.getTalent() == mockTalent);
    }

 
}