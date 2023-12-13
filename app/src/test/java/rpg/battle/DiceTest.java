package rpg.battle;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


/** 
 * The DiceTest class.
 *
 * <p>This class tests the Dice wrapper class for the external Dice Library.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class DiceTest {

    /**
     * Test Dice is built with correct Values/returns accecptable results on roll.
     */
    @Test
    public void testDiceReturnsCorrectValuesWhenRolled() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int diceValue = dice.roll();
            assertTrue(diceValue == 1
                    || diceValue == 2 
                    || diceValue == 3 
                    || diceValue == 4 
                    || diceValue == 5 
                    || diceValue == 6 
                    || diceValue == 7 
                    || diceValue == 8 
                    || diceValue == 9 
                    || diceValue == 10 
                    || diceValue == 11 
                    || diceValue == 12 
                    || diceValue == 13 
                    || diceValue == 14 
                    || diceValue == 15 
                    || diceValue == 16 
                    || diceValue == 17 
                    || diceValue == 18 
                    || diceValue == 19 
                    || diceValue == 20);
        }
    }

 
}