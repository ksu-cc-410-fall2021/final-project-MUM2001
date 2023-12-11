package battle;

import classes.CharacterClass;
import classes.Mage;
import classes.Rogue;
import classes.Warrior;
import enums.Talents;
import java.util.Random;
import me.MyCharacter;
import races.Dwarf;
import races.Elf;
import races.Human;
import races.Race;


/**
 * Controls the course of the fight, calling appropriate methods on both
 * Player and Computer Objects as well as returning results when nescessary.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class Fight {

    private Player player;
    private Dice dice;
    private Player computer;

    /**
     * Constructor.
     *
     *<p>Builds an instance of fight with provided Player Character.
     *
     * @param player MyCharacter Instance representing player
     */
    public Fight(Player player) {
        this.dice = new Dice();
        this.player = player;
        this.computer = Fight.randomEnemy();
    }

    /**
     * Performs an attack for the player and calls computer's responce.
     *
     *<p>Calls functions in and Modifies Player and Computer Instances
     *  to simulate attack performed.
     *
     *@return String result of Action
     */
    public String attack() {
        String returned = "";
        if (this.player.getCurrentStamina() > 0) {
            this.player.makeHit();
            if (this.rollForPlayerAttackSuccess()) {
                this.computer.takeHit(20);
                returned = returned + (this.player.getName() + " hits " + this.computer.getName()
                    +  "with furious anger! ");
                returned = returned + this.computerAction();
            } else {
                returned = returned + (this.player.getName() + " misses " + this.computer.getName()
                    +  "with gusto! ");
                returned = returned + this.computerAction();
            }
        } else {
            this.player.resetStamina();
            returned = returned + (this.player.getName() 
                + " is too exhauted to do anything right now! Soo... ");
            returned = returned + this.computerAction();
        }
        return returned;
    }

    /**
     * Performs defense for the player and calls computer's responce.
     *
     *<p>Calls functions in and Modifies Player and Computer Instances
     *  to simulate defense performed.
     *
     *@return String result of Action
     */
    public String defend() {
        String returned = "";
        this.player.resetStamina();
        this.player.heal();
        returned = returned + (this.player.getName() 
                + " rests to recover stamina, healing slightly in the process. ");
        returned = returned + "But this allows an opening... ";
        returned = returned + this.computerAction();
        return returned;
    }

    /**
     * Performs an action for the computer.
     *
     *<p>Calls functions in and Modifies Player and Computer Instances
     *  to simulate action performed.
     *
     *@return String result of Action
     */
    public String computerAction() {
        String returned = "";
        if (this.computer.getCurrentStamina() > 0) {
            this.computer.makeHit();
            if (this.rollForComputerAttackSuccess()) {
                this.player.takeHit(20);
                returned = returned + (this.computer.getName() + " hits " + this.player.getName()
                    +  "with furious anger! ");
            } else {
                returned = returned + (this.computer.getName() + " misses " + this.player.getName()
                    +  "with gusto! ");
            }
        } else {
            this.computer.resetStamina();
            this.computer.heal();
            returned = returned + (this.computer.getName() 
                + " rests to recover stamina, healing slightly in the process.");
        }
        return returned;
    }

    /**
     * Rolls to see if player attack successful.
     *
     *<p>Rolls die and applies hit chance and stamina modifiers, getting a total
     * which is checked against the opponents defense roll.
     *
     *@return boolean result of attack
     */
    public boolean rollForPlayerAttackSuccess() {
        int roll = this.dice.roll();
        roll = roll + this.player.getHitChance() + (this.player.getCurrentStamina());
        if (roll > this.rollForComputerDefense()) {
            return true;
        } else {
            return false;
        }
    }

    
    /**
     * Rolls to see if computer attack successful.
     *
     *<p>Rolls die and applies hit chance and stamina modifiers, getting a total
     * which is checked against the opponents defense roll.
     *
     *@return boolean result of attack
     */
    public boolean rollForComputerAttackSuccess() {
        int roll = this.dice.roll();
        roll = roll + this.computer.getHitChance() + (this.computer.getCurrentStamina());
        if (roll > this.rollForPlayerDefense()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Rolls for players defensive capability.
     *
     *<p>Rolls die and applies defense and stamina modifiers, getting a total
     * which is returned to th opponents attack roll.
     *
     *@return int result of dice roll and stat modifiers
     */
    public int rollForPlayerDefense() {
        int roll = this.dice.roll();
        roll = roll + this.player.getDefense() + (this.player.getCurrentStamina());
        return roll;
    }

    /**
     * Rolls for computers defensive capability.
     *
     *<p>Rolls die and applies defense and stamina modifiers, getting a total
     * which is returned to th opponents attack roll.
     *
     *@return int result of dice roll and stat modifiers
     */
    public int rollForComputerDefense() {
        int roll = this.dice.roll();
        roll = roll + this.computer.getDefense() + (this.computer.getCurrentStamina());
        return roll;
    }

    /**
     * Checks to see if the fight is over.
     *
     *<p>Finds out if either player has zero health left.
     *
     *@return boolean over or not
     */
    public boolean checkIfOver() {
        if (this.player.getCurrentHealth() <= 0 || this.computer.getCurrentHealth() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets Computer Health to Zero.
     *
     *<p>This Method is for testing purposes only.
     *
     */
    public void killComputer() {
        this.computer.takeHit(this.computer.getTotalHealth());
    }


    /**
     * Sets Computer Stamina to Zero.
     *
     *<p>This Method is for testing purposes only.
     *
     */
    public void exhaustComputer() {
        while (this.computer.getCurrentStamina() > 0) {
            this.computer.makeHit();
        }
    }

    /**
     * Gets Name of Computer Player.
     *
     *
     */
    public String getComputerName() {
        return this.computer.getName();
    }

    /**
     * Gets Race of Computer Player.
     *
     *
     */
    public Race getComputerRace() {
        return this.computer.getMyCharacter().getRace();
    }

    /**
     * Gets Class of Computer Player.
     *
     *
     */
    public CharacterClass getComputerCharacterClass() {
        return this.computer.getMyCharacter().getCharacterClass();
    }

    /**
     * Gets Talent of Computer Player.
     *
     *
     */
    public Talents getComputerTalent() {
        return this.computer.getMyCharacter().getTalent();
    }

    /**
     * Gets CurrentHealth of Computer Player.
     *
     *
     */
    public int getComputerCurrentHealth() {
        return this.computer.getCurrentHealth();
    }

    /**
     * Gets CurrentStamina of Computer Player.
     *
     *
     */
    public int getComputerCurrentStamina() {
        return this.computer.getCurrentStamina();
    }

    /**
     * Gets HitChance of Computer Player.
     *
     *
     */
    public int getComputerHitChance() {
        return this.computer.getHitChance();
    }

    /**
     * Gets Defense of Computer Player.
     *
     *
     */
    public int getComputerDefense() {
        return this.computer.getDefense();
    }

    /**
     * Gets the result of the game.
     *
     *<p>Finds the winning party and returns an appropriate statement,
     * or, in case of a draw, gives the tragic news.
     *
     *@return String result of the game
     */
    public String getResultOfGame() {
        if (this.player.getCurrentHealth() > 0 && this.computer.getCurrentHealth() <= 0) {
            return this.player.getName() + " won!";
        } else if (this.computer.getCurrentHealth() > 0 && this.player.getCurrentHealth() <= 0) {
            return this.computer.getName() + " won!";
        } else {
            return "Both parties fought to their end, and what a tragic one it was...";
        }
    }



    /**
     * Selects a random enemy for the computer to be.
     *
     *<p>Chooses at random from preset array.
     *
     *@return Computer enemy chosen
     */
    public static Player randomEnemy() {
        MyCharacter morrigan = new MyCharacter("Morrigan");
        morrigan.setCharacterClass(new Mage());
        morrigan.setTalent(Talents.TALL);
        morrigan.setRace(new Human());
        MyCharacter oghren = new MyCharacter("Oghren");
        oghren.setCharacterClass(new Warrior());
        oghren.setTalent(Talents.STOCKY);
        oghren.setRace(new Dwarf());
        MyCharacter zevran = new MyCharacter("Zevran");
        zevran.setCharacterClass(new Rogue());
        zevran.setTalent(Talents.FAST_TWITCH);
        zevran.setRace(new Elf());
        MyCharacter[] possibleEnemies = new MyCharacter[3];
        possibleEnemies[0] = morrigan;
        possibleEnemies[1] = oghren;
        possibleEnemies[2] = zevran;
        Random randomNumGen = new Random();
        int randomNumber = randomNumGen.nextInt(3);
        Player enemy = new Player(possibleEnemies[randomNumber]);
        return enemy;
    }
    
}