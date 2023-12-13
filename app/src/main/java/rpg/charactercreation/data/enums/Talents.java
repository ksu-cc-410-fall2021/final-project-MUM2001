package rpg.charactercreation.data.enums;

/** 
 * The Talents class(representation of character perks/talents).
 *
 * <p>This class is an enumeration of the various talents
 *    available for characters.
 *
 * @author Michael Umscheid mjumsc@ksu.edu
 * @version 1.0
 */
public enum Talents {
    LEFT_HANDER("Left Hander"),
    STOCKY("Stocky"),
    TALL("Tall"),
    FAST_TWITCH("Fast Twitch"),
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
     *   accurately describe the enumeration.
     *
     *
     *@return String the description
     */
    @Override
    public String toString() {
        return this.description;
    }
}