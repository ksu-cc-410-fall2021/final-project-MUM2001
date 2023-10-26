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
    LEFT_HANDER("Left Hander"),
    STOCKY("Stocky"),
    TALL("Tall"),
    FAST_TWITCH("Pickels"),
    MARATHON_RUNNER("Marathon Runner");

    private final String description;

    /**
     *Talents constructor.
     *
     *<p>Constructs enumeration with desired String description.
     *   
     *
     *@param description  String 
     */
    private Talents(String description) {
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