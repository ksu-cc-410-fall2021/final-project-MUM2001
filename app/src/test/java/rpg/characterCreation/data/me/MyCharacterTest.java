package me;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import classes.CharacterClass;
import classes.Mage;
import data.Character;
import enums.Talents;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import races.Dwarf;
import races.Race;

/** 
 * The MyCharacterTest class.
 *
 * <p>This class tests the MyCharacter class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */
public class MyCharacterTest {

    @Test 
    public void testDefaultConstructorValueNameIsNull() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getName() == null);
    }

    @Test 
    public void testDefaultConstructorValueClassIsNull() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getCharacterClass() == null);
    }

    @Test 
    public void testDefaultConstructorValueRaceIsNull() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getRace() == null);
    }

    @Test 
    public void testDefaultConstructorValueTalentIsNull() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getTalent() == null);
    }

    @Test 
    public void testDefaultConstructorValueHealthIs100() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getHealth() == 100);
    }

    @Test 
    public void testDefaultConstructorValueStaminaIs100() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getStamina() == 100);
    }

    @Test 
    public void testDefaultConstructorValueHitChanceIs50() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getHitChance() == 50);
    }

    @Test 
    public void testDefaultConstructorValueDefenseIs50() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getDefense() == 50);
    }

    @Test 
    public void testConstructorSetsGivenName() {
        MyCharacter rk = new MyCharacter("Mike");
        assertTrue(rk.getName().equals("Mike"));
    }

    @Test 
    public void testSetNameSetsCorrectName() {
        MyCharacter rk = new MyCharacter("");
        rk.setName("Mike");
        assertTrue(rk.getName().equals("Mike"));
    }

    @Test 
    public void testSetCharacterClassSetsCorrectCharacterClass() {
        MyCharacter rk = new MyCharacter("");
        Mage m = new Mage();
        rk.setCharacterClass(m);
        assertTrue(rk.getCharacterClass().equals(m));
    }

    @Test 
    public void testSetRaceSetsCorrectRace() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        rk.setRace(m);
        assertTrue(rk.getRace().equals(m));
    }

    @Test 
    public void testClearCharacterResetsHealthToBaseLevel() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        rk.setRace(m);
        rk.clearCharacter();
        assertTrue(rk.getHealth() == 100);
    }

    @Test 
    public void testClearCharacterResetsStaminaToBaseLevel() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        rk.setRace(m);
        rk.clearCharacter();
        assertTrue(rk.getStamina() == 100);
    }

    @Test 
    public void testClearCharacterResetsHitChanceToBaseLevel() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        rk.setRace(m);
        rk.clearCharacter();
        assertTrue(rk.getHitChance() == 50);
    }

    @Test 
    public void testClearCharacterResetsDefenseToBaseLevel() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        rk.setRace(m);
        rk.clearCharacter();
        assertTrue(rk.getDefense() == 50);
    }

    @Test 
    public void testSetTalentLeftHanderSetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.LEFT_HANDER);
        assertTrue(rk.getTalent().equals(Talents.LEFT_HANDER));
        assertTrue(rk.getHitChance() == 60);
    }

    @Test 
    public void testSetTalentStockySetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.STOCKY);
        assertTrue(rk.getTalent().equals(Talents.STOCKY));
        assertTrue(rk.getHealth() == 110);
        assertTrue(rk.getDefense() == 40);
    }

    @Test 
    public void testSetTalentTallSetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.TALL);
        assertTrue(rk.getTalent().equals(Talents.TALL));
        assertTrue(rk.getHitChance() == 55);
        assertTrue(rk.getDefense() == 55);
    }

    @Test 
    public void testSetTalentFastTwitchSetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.FAST_TWITCH);
        assertTrue(rk.getTalent().equals(Talents.FAST_TWITCH));
        assertTrue(rk.getHitChance() == 70);
        assertTrue(rk.getStamina() == 80);
    }

    @Test 
    public void testSetTalentMarathonRunnerSetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.MARATHON_RUNNER);
        assertTrue(rk.getTalent().equals(Talents.MARATHON_RUNNER));
        assertTrue(rk.getStamina() == 110);
        assertTrue(rk.getHitChance() == 40);
    }
}