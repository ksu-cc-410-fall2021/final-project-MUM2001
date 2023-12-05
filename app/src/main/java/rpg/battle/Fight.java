package battle;

import classes.Mage;
import classes.Rogue;
import classes.Warrior;
import enums.Talents;
import java.util.Random;
import me.MyCharacter;
import races.Dwarf;
import races.Elf;
import races.Human;


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
            this.computer.takeHit(20);
            returned = returned + (this.player.getName() + " hits " + this.computer.getName()
                +  "with furious anger! ");
            returned = returned + this.computerAction();
        } else {
            this.player.resetStamina();
            returned = returned + (this.player.getName() 
                + " is too exhauted to do anything right now! Soo... ");
            returned = returned + this.computerAction();
        }
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
            this.player.takeHit(20);
            returned = returned + (this.computer.getName() + " hits " + this.player.getName()
                +  "with furious anger! ");
        } else {
            this.computer.resetStamina();
            this.computer.heal();
            returned = returned + (this.computer.getName() 
                + " rests to recover stamina, healing slightly in the process.");
        }
        return returned;
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
     * Gets the result of the game.
     *
     *<p>Finds the winning party and returns an appropriate statement,
     * or, in case of a draw, gives the tragic news.
     *
     *@return String result of the game
     */
    public String getResultOfGame() {
        if (this.player.getCurrentHealth() > 0 && this.computer.getCurrentHealth() <= 0) {
            return this.player.getName() + "won!";
        } else if (this.computer.getCurrentHealth() > 0 && this.player.getCurrentHealth() <= 0) {
            return this.computer.getName() + "won!";
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