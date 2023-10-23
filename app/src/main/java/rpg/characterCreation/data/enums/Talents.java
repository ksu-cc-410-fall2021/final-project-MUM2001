package enums;

/** 
 * The Talent class(representation of character perks).
 *
 * <p>This class is an enumeration of the various talents
 *    available for characters.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 0.1
 */

public enum Talents {
    LETTUCE("Lettuce"),
    TOMATO("Tomato"),
    ONION("Onion"),
    PICKLES("Pickels"),
    PEPPERS("Peppers"),
    OLIVES("Olives"),
    MAYO("Mayo"),
    MUSTARD("Mustard"),
    BBQ_SAUCE("Bbq Sauce");

    private final String description;

    /**
     *Topping constructor.
     *
     *<p>Constructs enumeration with desired String description.
     *   
     *
     *@param description  String 
     */

    private Topping(String description) {
        this.description = description;
    }

    /**
     *Overide method of toString().
     *
     *<p>Modifies the Talent standard toString() method in order to
     *   more accurately describe the enumeration.
     *
     *
     *@return String the description
     */

    @Override
    public String toString() {
        return this.description;
    }
}