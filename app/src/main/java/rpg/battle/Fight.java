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
    private static Dice dice = new Dice();
    private Player computer;
    private boolean initiative;
    private boolean over;
    private Player winner;

    /**
     * Constructor.
     *
     *<p>Builds an instance of fight with provided Player Character.
     *
     * @param player MyCharacter Instance representing player
     */
    public Fight(Player player) {
        this.player = player;
        this.computer = Fight.randomEnemy();
        this.over = false;
        this.initiative = Fight.rollForInitiative();
        this.winner = null;
    }

    /**
     * Performs an attack for the player and performs computer's responce.
     *
     *<p>Calls functions in and Modifies Player and Computer Instances
     *  to simulate attack performed.
     *
     *@return String result of Action
     */
    public String attack() {
        String returned = "";
        this.initiative = false;
        if (this.player.getCurrentStamina() > 0) {
            this.player.makeHit();
            this.computer.takeHit(20);
            returned = returned + (this.player.getName() + " hits " + this.computer.getName()
                +  "with furious anger! ");
            //returned = returned + this.computerAction(); 
        } else {
            this.player.resetStamina();
            returned = returned + (this.player.getName() 
                + " is to exhauted to do anything right now!");
            //returned = returned + this.computerAction();
        }
        return returned;
    }



    /**
     * Selects a random enemy for the computer to be.
     *
     *<p>Chooses at random from preset array.
     *
     *@return Computer enemy chosen
     */
    public static Computer randomEnemy() {
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
        Computer enemy = new Computer(possibleEnemies[randomNumber]);
        return enemy;
    }

    /**
     * Rolls dice to determine who goes first(Has Initiative).
     *
     *
     *@return boolean wether player has initiative or not
     */
    public static boolean rollForInitiative() {
        int playerValue = Fight.dice.roll();
        int computerValue = Fight.dice.roll();
        if (playerValue >= computerValue) {
            return true;
        } else {
            return false;
        }
    }

    
}