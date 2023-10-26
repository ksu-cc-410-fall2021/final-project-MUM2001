package me;

import data.Character;
import classes.Class;
import classes.Mage;
import classes.Rogue;
import classes.Warrior;
import perks.Talents;
import races.Dwarf;
import races.Elf;
import races.Human;
import races.Race;
import java.lang.IllegalArgumentException;


/**
 * Represents a Builder/Factory Method approach to building myCharacter.
 *
 * @author: Michael Umscheid mjumsc@ksu.edu
 * @version: 0.1
 */
public class myCharacterBuilder {

    /**
     * Builds myCharacter with given name.
     *
     * @param name name of desired combo
     * @return Combo desired combo
     */
    public static Combo buildCombo(String name) {
        if ("OriginalSeries".equals(name)) {
            return ComboBuilder.buildOriginalSeries();
        } else if ("NextGeneration".equals(name)) {
            return ComboBuilder.buildNextGeneration();
        } else if ("VoyageBeyond".equals(name)) {
            return ComboBuilder.buildVoyageBeyond();
        } else if ("GalaxyClass".equals(name)) {
            return ComboBuilder.buildGalaxyClass();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Get number of combos available.
     *
     * @return int available combos
     */
    public static int getNumberOfCombosAvailable() {
        return 4;
    }

    /**
     * Build the OriginalSeries combo.
     *
     * @return Combo
     */
    private static Combo buildOriginalSeries() {
        Combo combo = new Combo("OriginalSeries");
        Entree kirk = new Kirk();
        Drink worf = new Worf();
        Side enterprise = new Enterprise(); 
        combo.setEntree(kirk);
        combo.setDrink(worf);
        combo.setSide(enterprise);
        return combo;
    }

    /**
     * Build the NextGeneration combo.
     *
     * @return Combo
     */
    private static Combo buildNextGeneration() {
        Combo combo = new Combo("NextGeneration");
        Entree riker = new Riker();
        Drink picard = new Picard();
        Side data = new Data(); 
        combo.setEntree(riker);
        combo.setDrink(picard);
        combo.setSide(data);
        return combo;
    }

    /**
     * Build the VoyageBeyond combo.
     *
     * @return Combo
     */
    private static Combo buildVoyageBeyond() {
        Combo combo = new Combo("VoyageBeyond");
        Entree janeway = new Janeway();
        Drink troi = new Troi();
        Side borg = new Borg(); 
        combo.setEntree(janeway);
        combo.setDrink(troi);
        combo.setSide(borg);
        return combo;
    }

    /**
     * Build the GalaxyClass combo.
     *
     * @return Combo
     */
    private static Combo buildGalaxyClass() {
        Combo combo = new Combo("GalaxyClass");
        Entree spock = new Spock();
        Drink picard = new Picard();
        Side enterprise = new Enterprise(); 
        combo.setEntree(spock);
        combo.setDrink(picard);
        combo.setSide(enterprise);
        return combo;
    }
}