package rpg.charactercreation.data.me;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import rpg.charactercreation.data.Character;
import rpg.charactercreation.data.classes.CharacterClass;
import rpg.charactercreation.data.classes.Mage;
import rpg.charactercreation.data.classes.Rogue;
import rpg.charactercreation.data.classes.Warrior;
import rpg.charactercreation.data.enums.Talents;
import rpg.charactercreation.data.races.Dwarf;
import rpg.charactercreation.data.races.Elf;
import rpg.charactercreation.data.races.Human;
import rpg.charactercreation.data.races.Race;

/** 
 * The MyCharacterTest class.
 *
 * <p>This class tests the MyCharacter class.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public class MyCharacterTest {


    /**
     * Test Constructor sets empty string input to null.
     */
    @Test 
    public void testDefaultConstructorValueNameIsNull() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getName() == null);
    }

    /**
     * Test Constructor sets character class to null.
     */
    @Test 
    public void testDefaultConstructorValueClassIsNull() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getCharacterClass() == null);
    }

    /**
     * Test Constructor sets race to null.
     */
    @Test 
    public void testDefaultConstructorValueRaceIsNull() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getRace() == null);
    }

    /**
     * Test Constructor sets talent to null.
     */
    @Test 
    public void testDefaultConstructorValueTalentIsNull() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getTalent() == null);
    }

    /**
     * Test Constructor sets health to 100.
     */
    @Test 
    public void testDefaultConstructorValueHealthIs100() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getHealth() == 100);
    }

    /**
     * Test Constructor sets stamina to 100.
     */
    @Test 
    public void testDefaultConstructorValueStaminaIs100() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getStamina() == 100);
    }

    /**
     * Test Constructor sets hit chance to 50.
     */
    @Test 
    public void testDefaultConstructorValueHitChanceIs50() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getHitChance() == 50);
    }

    /**
     * Test Constructor sets defense to 50.
     */
    @Test 
    public void testDefaultConstructorValueDefenseIs50() {
        MyCharacter rk = new MyCharacter("");
        assertTrue(rk.getDefense() == 50);
    }

    /**
     * Test Constructor sets name to parameter.
     */
    @Test 
    public void testConstructorSetsGivenName() {
        MyCharacter rk = new MyCharacter("Mike");
        assertTrue(rk.getName().equals("Mike"));
    }

    /**
     * Test setName sets name to parameter.
     */
    @Test 
    public void testSetNameSetsCorrectName() {
        MyCharacter rk = new MyCharacter("");
        rk.setName("Mike");
        assertTrue(rk.getName().equals("Mike"));
    }

    /**
     * Test setCharacterClass sets CharacterClass to parameter.
     */
    @Test 
    public void testSetCharacterClassSetsCorrectCharacterClass() {
        MyCharacter rk = new MyCharacter("");
        Mage m = new Mage();
        rk.setCharacterClass(m);
        assertTrue(rk.getCharacterClass().equals(m));
    }

    /**
     * Test setCharacterClass sets CharacterClass to parameter even if already set.
     */
    @Test 
    public void testSetNewCharacterClassSetsCorrectNewCharacterClass() {
        MyCharacter rk = new MyCharacter("");
        Mage m = new Mage();
        Warrior n = new Warrior();
        rk.setCharacterClass(m);
        rk.setCharacterClass(n);
        assertTrue(rk.getCharacterClass().equals(n));
    }

    /**
     * Test setRace sets race to parameter.
     */
    @Test 
    public void testSetRaceSetsCorrectRace() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        rk.setRace(m);
        assertTrue(rk.getRace().equals(m));
    }

    /**
     * Test setRace sets race to parameter even if already set.
     */
    @Test 
    public void testSetNewRaceSetsCorrectNewRace() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        Elf n = new Elf();
        rk.setRace(m);
        rk.setRace(n);
        assertTrue(rk.getRace().equals(n));
    }

    /**
     * Test clearCharacter resets health to Base Level.
     */
    @Test 
    public void testClearCharacterResetsHealthToBaseLevel() {
        MyCharacter rk = new MyCharacter("");
        Elf m = new Elf();
        rk.setRace(m);
        rk.clearCharacter();
        assertTrue(rk.getHealth() == 100);
    }

    /**
     * Test clearCharacter resets stamina to Base Level.
     */
    @Test 
    public void testClearCharacterResetsStaminaToBaseLevel() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        rk.setRace(m);
        rk.clearCharacter();
        assertTrue(rk.getStamina() == 100);
    }

    /**
     * Test clearCharacter resets hit chance to Base Level.
     */
    @Test 
    public void testClearCharacterResetsHitChanceToBaseLevel() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        Warrior w = new Warrior();
        rk.setRace(m);
        rk.setCharacterClass(w);
        rk.clearCharacter();
        assertTrue(rk.getHitChance() == 50);
    }

    /**
     * Test clearCharacter resets defense to Base Level.
     */
    @Test 
    public void testClearCharacterResetsDefenseToBaseLevel() {
        MyCharacter rk = new MyCharacter("");
        Dwarf m = new Dwarf();
        Rogue w = new Rogue();
        rk.setRace(m);
        rk.setCharacterClass(w);
        rk.clearCharacter();
        assertTrue(rk.getDefense() == 50);
    }

    /**
     * Test setTalent sets correct Talent and makes stat change(left hander).
     */
    @Test 
    public void testSetTalentLeftHanderSetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.LEFT_HANDER);
        assertTrue(rk.getTalent().equals(Talents.LEFT_HANDER));
        assertTrue(rk.getHitChance() == 60);
    }

    /**
     * Test setTalent sets correct Talent and makes stat change(Stocky).
     */
    @Test 
    public void testSetTalentStockySetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.STOCKY);
        assertTrue(rk.getTalent().equals(Talents.STOCKY));
        assertTrue(rk.getHealth() == 110);
        assertTrue(rk.getDefense() == 40);
    }

    /**
     * Test setTalent sets correct Talent and makes stat change(Tall).
     */
    @Test 
    public void testSetTalentTallSetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.TALL);
        assertTrue(rk.getTalent().equals(Talents.TALL));
        assertTrue(rk.getHitChance() == 55);
        assertTrue(rk.getDefense() == 55);
    }

    /**
     * Test setTalent sets correct Talent and makes stat change(Fast Twitch).
     */
    @Test 
    public void testSetTalentFastTwitchSetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.FAST_TWITCH);
        assertTrue(rk.getTalent().equals(Talents.FAST_TWITCH));
        assertTrue(rk.getHitChance() == 70);
        assertTrue(rk.getStamina() == 80);
    }

    /**
     * Test setTalent sets correct Talent and makes stat change(Marathon Runner).
     */
    @Test 
    public void testSetTalentMarathonRunnerSetsCorrectTalentAndStatChanges() {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.MARATHON_RUNNER);
        assertTrue(rk.getTalent().equals(Talents.MARATHON_RUNNER));
        assertTrue(rk.getStamina() == 110);
        assertTrue(rk.getHitChance() == 40);
    }

    /** 
    * The testsTalentChangedCorrectly method(Marathon Runner).
    *
    *<p>Tests if setting a new talent when Marathon Runner already set will
    *   result in correct stats.
    *
    *@param talent Talents enum
    */
    @ParameterizedTest
    @EnumSource(Talents.class)
    public void testChangeTalentChangesTalentMarathonRunner(Talents talent) {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.MARATHON_RUNNER);
        rk.setTalent(talent);
        assertTrue(rk.getTalent().equals(talent));
    }

    /** 
    * The testsTalentChangedCorrectly method(Fast Twitch).
    *
    *<p>Tests if setting a new talent when Fast Twitch already set will
    *   result in correct stats.
    *
    *@param talent Talents enum
    */
    @ParameterizedTest
    @EnumSource(Talents.class)
    public void testChangeTalentChangesTalentFastTwitch(Talents talent) {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.FAST_TWITCH);
        rk.setTalent(talent);
        assertTrue(rk.getTalent().equals(talent));
    }

    /** 
    * The testsTalentChangedCorrectly method(Tall).
    *
    *<p>Tests if setting a new talent when Tall already set will
    *   result in correct stats.
    *
    *@param talent Talents enum
    */
    @ParameterizedTest
    @EnumSource(Talents.class)
    public void testChangeTalentChangesTalentTall(Talents talent) {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.TALL);
        rk.setTalent(talent);
        assertTrue(rk.getTalent().equals(talent));
    }

    /** 
    * The testsTalentChangedCorrectly method(Stocky).
    *
    *<p>Tests if setting a new talent when Stocky already set will
    *   result in correct stats.
    *
    *@param talent Talents enum
    */
    @ParameterizedTest
    @EnumSource(Talents.class)
    public void testChangeTalentChangesTalentStocky(Talents talent) {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.STOCKY);
        rk.setTalent(talent);
        assertTrue(rk.getTalent().equals(talent));
    }

    /** 
    * The testsTalentChangedCorrectly method(Left Hander).
    *
    *<p>Tests if setting a new talent when Left Hander already set will
    *   result in correct stats.
    *
    *@param talent Talents enum
    */
    @ParameterizedTest
    @EnumSource(Talents.class)
    public void testChangeTalentChangesTalentLeftHanded(Talents talent) {
        MyCharacter rk = new MyCharacter("");
        rk.setTalent(Talents.LEFT_HANDER);
        rk.setTalent(talent);
        assertTrue(rk.getTalent().equals(talent));
    }
}