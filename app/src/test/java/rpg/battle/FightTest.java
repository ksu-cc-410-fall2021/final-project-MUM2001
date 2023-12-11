package battle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import battle.Dice;
import battle.Player;
import classes.CharacterClass;
import classes.Mage;
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
 * The Fight Test class.
 *
 * <p>This class tests the Fight class which controls the battle simulation.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
@MockitoSettings(strictness = Strictness.STRICT_STUBS)
public class FightTest {

    @Mock
    Player mockPlayer;


    /**
     * Test Fight Check if over returns true if Player has 0 health.
     */
    @Test
    public void testFightCheckIfOverReturnsTrueIfPlayerHasZeroHealth() {
        when(mockPlayer.getCurrentHealth()).thenReturn(0);
        Fight fight = new Fight(mockPlayer);
        assertTrue(fight.checkIfOver()); 
    }

    /**
     * Test Fight Check if over returns false if Player and computer have full health.
     */
    @Test
    public void testFightCheckIfOverReturnsTrueIfPlayerAndComputerHaveFullHealth() {
        when(mockPlayer.getCurrentHealth()).thenReturn(100);
        Fight fight = new Fight(mockPlayer);
        assertFalse(fight.checkIfOver()); 
    }

    /**
     * Test Fight Check if over returns true if computer has 0 health.
     */
    @Test
    public void testFightCheckIfOverReturnsTrueIfComputerHasZeroHealth() {
        when(mockPlayer.getCurrentHealth()).thenReturn(100);
        Fight fight = new Fight(mockPlayer);
        fight.killComputer();
        assertTrue(fight.checkIfOver()); 
    }

    /**
     * Test Fight Check if over returns true if both player and Computer have 0 health.
     */
    @Test
    public void testFightCheckIfOverReturnsTrueIfBothPlayerAndComputerHaveZeroHealth() {
        when(mockPlayer.getCurrentHealth()).thenReturn(0);
        Fight fight = new Fight(mockPlayer);
        fight.killComputer();
        assertTrue(fight.checkIfOver()); 
    }

    /**
     * Test Fight Get Result of game returns correct string for Player win.
     */
    @Test
    public void testFightGetResultOfGameReturnsCorrectStringForPlayerWin() {
        when(mockPlayer.getCurrentHealth()).thenReturn(100);
        when(mockPlayer.getName()).thenReturn("Mike");
        Fight fight = new Fight(mockPlayer);
        fight.killComputer();
        assertTrue(fight.getResultOfGame().equals("Mike won!")); 
    }

    /**
     * Test Fight Get Result of game returns correct string for Computer win.
     */
    @Test
    public void testFightGetResultOfGameReturnsCorrectStringForComputerWin() {
        when(mockPlayer.getCurrentHealth()).thenReturn(0);
        Fight fight = new Fight(mockPlayer);
        assertTrue(fight.getResultOfGame().equals("Morrigan won!")
                || fight.getResultOfGame().equals("Zevran won!")
                || fight.getResultOfGame().equals("Oghren won!")); 
    }

    /**
     * Test Fight Get Result of game returns correct string for Mutual Defeat.
     */
    @Test
    public void testFightGetResultOfGameReturnsCorrectStringForMutualDefeat() {
        when(mockPlayer.getCurrentHealth()).thenReturn(0);
        Fight fight = new Fight(mockPlayer);
        fight.killComputer();
        assertTrue(fight.getResultOfGame().equals(
                "Both parties fought to their end, and what a tragic one it was..."));
    }

    /**
     * Test Fight Get Result of game returns Mutual Defeat String Even If Both Full Health.
     */
    @Test
    public void testFightGetResultOfGameReturnsMutualDefeatStringEvenIfBothFullHealth() {
        when(mockPlayer.getCurrentHealth()).thenReturn(100);
        Fight fight = new Fight(mockPlayer);
        assertTrue(fight.getResultOfGame().equals(
                "Both parties fought to their end, and what a tragic one it was..."));
    }

    /**
     * Test Fight Attack With Enoungh Stamina Calls Correct Methods.
     */
    @Test
    public void testFightAttackWithEnounghStaminaCallsCorrectMethods() {
        when(mockPlayer.getName()).thenReturn("Mike");
        when(mockPlayer.getCurrentStamina()).thenReturn(100);
        Fight fight = new Fight(mockPlayer);
        fight.attack();
        verify(mockPlayer, atLeast(1)).makeHit();
    }

    /**
     * Test Fight Attack Mutiple Attacks Do Not Cause Exceptions.
     */
    @Test
    public void testFightAttackMutipleAttacksDoNotCauseExceptions() {
        when(mockPlayer.getName()).thenReturn("Mike");
        when(mockPlayer.getCurrentStamina()).thenReturn(100);
        Fight fight = new Fight(mockPlayer);
        fight.attack();
        fight.attack();
        fight.attack();
        fight.attack();
        fight.attack();
        fight.attack();
        verify(mockPlayer, atLeast(5)).makeHit();
    }

    /**
     * Test Fight Attack Without Enoungh Stamina Calls Correct Methods.
     */
    @Test
    public void testFightAttackWithoutEnounghStaminaCallsCorrectMethods() {
        when(mockPlayer.getName()).thenReturn("Mike");
        when(mockPlayer.getCurrentStamina()).thenReturn(0);
        Fight fight = new Fight(mockPlayer);
        fight.attack();
        verify(mockPlayer, atLeast(1)).resetStamina();
    }

    /**
     * Test Fight Defend Calls Correct Methods.
     */
    @Test
    public void testDefendCallsCorrectMethods() {
        when(mockPlayer.getName()).thenReturn("Mike");
        Fight fight = new Fight(mockPlayer);
        fight.defend();
        verify(mockPlayer, atLeast(1)).resetStamina();
        verify(mockPlayer, atLeast(1)).heal();
    }

    /**
     * Test Fight Computer Action Returns Viable Result For Full Stamina.
     */
    @Test
    public void testComputerActionReturnsaViableResultForFullStamina() {
        when(mockPlayer.getName()).thenReturn("Mike");
        Fight fight = new Fight(mockPlayer);
        String result = fight.computerAction();
        assertTrue(result.contains("Mike"));
    }

    /**
     * Test Fight Computer Action Returns Viable Result For Empty Stamina.
     */
    @Test
    public void testComputerActionReturnsaViableResultForEmptyStamina() {
        Fight fight = new Fight(mockPlayer);
        fight.exhaustComputer();
        String result = fight.computerAction();
        assertTrue(result.contains("rests"));
    }

    /**
     * Test Fight Roll For Player Attack Success Calls Correct Methods.
     */
    @Test
    public void testFightRollForPlayerAttackSuccessCallsCorrectMethods() {
        when(mockPlayer.getHitChance()).thenReturn(50);
        when(mockPlayer.getCurrentStamina()).thenReturn(100);
        Fight fight = new Fight(mockPlayer);
        fight.rollForPlayerAttackSuccess();
        verify(mockPlayer, atLeast(1)).getHitChance();
        verify(mockPlayer, atLeast(1)).getCurrentStamina();
    }

    /**
     * Test Fight Roll For Player Attack Success returns False if  Failure.
     */
    @Test
    public void testFightRollForPlayerAttackSuccessReturnsFalseIfFailure() {
        when(mockPlayer.getHitChance()).thenReturn(0);
        when(mockPlayer.getCurrentStamina()).thenReturn(0);
        Fight fight = new Fight(mockPlayer);
        assertTrue(fight.rollForPlayerAttackSuccess() == false);
    }

    /**
     * Test Fight Roll For Player Attack Success returns True if  Success.
     */
    @Test
    public void testFightRollForPlayerAttackSuccessReturnsTrueIfSuccess() {
        when(mockPlayer.getHitChance()).thenReturn(200);
        when(mockPlayer.getCurrentStamina()).thenReturn(200);
        Fight fight = new Fight(mockPlayer);
        assertTrue(fight.rollForPlayerAttackSuccess() == true);
    }

    /**
     * Test Fight Roll For Player Defense Calls Correct Methods.
     */
    @Test
    public void testFightRollForPlayerDefenseCallsCorrectMethods() {
        when(mockPlayer.getDefense()).thenReturn(50);
        when(mockPlayer.getCurrentStamina()).thenReturn(100);
        Fight fight = new Fight(mockPlayer);
        fight.rollForPlayerDefense();
        verify(mockPlayer, atLeast(1)).getDefense();
        verify(mockPlayer, atLeast(1)).getCurrentStamina();
    }

    /**
     * Test Fight Roll For Player Defense returns Viable Integer For Failure.
     */
    @Test
    public void testFightRollForPlayerDefenseReturnsIntegerForFailure() {
        when(mockPlayer.getDefense()).thenReturn(0);
        when(mockPlayer.getCurrentStamina()).thenReturn(0);
        Fight fight = new Fight(mockPlayer);
        assertTrue(fight.rollForPlayerDefense() <= 20);
    }

    /**
     * Test Fight Roll For Player Defense returns Viable Integer For  Success.
     */
    @Test
    public void testFightRollForPlayerDefenseReturnsViableIntegerForSuccess() {
        when(mockPlayer.getDefense()).thenReturn(50);
        when(mockPlayer.getCurrentStamina()).thenReturn(100);
        Fight fight = new Fight(mockPlayer);
        assertTrue(fight.rollForPlayerDefense() >= 150);
    }

    /**
     * Test Fight Roll For Computer Defense returns Viable Integer.
     */
    @Test
    public void testFightRollForPlayerDefenseReturnsViableInteger() {
        Fight fight = new Fight(mockPlayer);
        assertTrue(fight.rollForComputerDefense() >= 130);
    }



    /**
     * Test Fight Random Enemy Method Sets Enemy Correctly.
     */
    @Test
    public void testFightRandomEnemyMethodSetsEnemyNameCorrectly() {
        Player player = Fight.randomEnemy();
        assertTrue(player.getName() == "Morrigan"
                || player.getName() == "Oghren" 
                || player.getName() == "Zevran"); 
    }

   
 
}