package battle;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import classes.CharacterClass;
import enums.Talents;
import me.MyCharacter;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import races.Race;


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
    Race mockRace;

    @Mock
    CharacterClass mockCharacterClass;

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

    @Test
    public void testPlayerGetCurrentHealthReturnsCorrectPostHitHealth() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        Player player = new Player(mockCharacter);
        player.takeHit(20);
        assertTrue(player.getCurrentHealth() == 80);
    }

    @Test
    public void testPlayerGetCurrentStaminaReturnsCorrectStartingStamina() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        Player player = new Player(mockCharacter);
        assertTrue(player.getCurrentStamina() == 100);
    }

    @Test
    public void testPlayerGetCurrentStaminaReturnsCorrectPostHitStamina() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        Player player = new Player(mockCharacter);
        player.makeHit();
        assertTrue(player.getCurrentStamina() == 80);
    }

    @Test
    public void testPlayerResetStaminaProperlyResetsStamina() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        Player player = new Player(mockCharacter);
        player.makeHit();
        player.makeHit();
        player.makeHit();
        player.resetStamina();
        assertTrue(player.getCurrentStamina() == 100);
    }

    @Test
    public void testPlayerHealRefillsHealthToBySetAmount() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        Player player = new Player(mockCharacter);
        player.takeHit(20);
        player.heal();
        assertTrue(player.getCurrentHealth() == 85);
    }

    @Test
    public void testPlayerHealDoesNotSetHealthOverMax() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        Player player = new Player(mockCharacter);
        player.heal();
        assertTrue(player.getCurrentHealth() == 100);
    }

    @Test
    public void testPlayerValidMethodReturnsTrueIfAllAtributesNotNull() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        when(mockCharacter.getName()).thenReturn("Mike");
        when(mockCharacter.getRace()).thenReturn(mockRace);
        when(mockCharacter.getCharacterClass()).thenReturn(mockCharacterClass);
        when(mockCharacter.getTalent()).thenReturn(mockTalent);
        Player player = new Player(mockCharacter);
        assertTrue(player.valid() == true);
    }

    @Test
    public void testPlayerValidMethodReturnsFalseIfNameNull() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        when(mockCharacter.getName()).thenReturn(null);
        Player player = new Player(mockCharacter);
        assertTrue(player.valid() == false);
    }

    @Test
    public void testPlayerValidMethodReturnsFalseIfNameEmpty() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        when(mockCharacter.getName()).thenReturn("");
        Player player = new Player(mockCharacter);
        assertTrue(player.valid() == false);
    }

    @Test
    public void testPlayerValidMethodReturnsFalseIfRaceNull() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        when(mockCharacter.getName()).thenReturn("mike");
        when(mockCharacter.getRace()).thenReturn(null);
        Player player = new Player(mockCharacter);
        assertTrue(player.valid() == false);
    }

    @Test
    public void testPlayerValidMethodReturnsFalseIfCharacterClassNull() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        when(mockCharacter.getName()).thenReturn("Mike");
        when(mockCharacter.getRace()).thenReturn(mockRace);
        when(mockCharacter.getCharacterClass()).thenReturn(null);
        Player player = new Player(mockCharacter);
        assertTrue(player.valid() == false);
    }

    @Test
    public void testPlayerValidMethodReturnsFalseIfTalentNull() {
        when(mockCharacter.getHealth()).thenReturn(100);
        when(mockCharacter.getStamina()).thenReturn(100);
        when(mockCharacter.getHitChance()).thenReturn(50);
        when(mockCharacter.getDefense()).thenReturn(50);
        when(mockCharacter.getName()).thenReturn("Mike");
        when(mockCharacter.getRace()).thenReturn(mockRace);
        when(mockCharacter.getCharacterClass()).thenReturn(mockCharacterClass);
        when(mockCharacter.getTalent()).thenReturn(null);
        Player player = new Player(mockCharacter);
        assertTrue(player.valid() == false);
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