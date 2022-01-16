package lower.lesson11;

/**
 * A class that abstracts a soldier character that may be suitable in a FPS game.
 */
public class Soldier {

    /**
     * ---- STATIC VARIABLES [NO STATE] -------------------------------------------------------------------
     */
    public static final int MAX_HEALTH = 4;
    
    /**
     * ---- VARIABLES OR OBJECT PROPERTIES [DEFINE STATE] --------------------------------------------------
     */
    public int id;

    public int health;

    // TODO property for currentWeaponIndex

    public String name;
    
    public String strength;

    public String weakness;

    public String[] weapons = new String[5];

    /**
     * ---- METHODS OR OBJECT BEHAVIOUR [UPDATE STATE] -----------------------------------------------------
     */
    public void reduceHealth() {
        if (this.health > 0) {
            this.health -= 1; // reduce health by one
        }
    }

    // TODO method to getCurrentWeapon (hint: you need to use the return keyword)

    public void display() {
        System.out.println("**********************************");
        System.out.println("********* Soldier Object *********");
        System.out.println("**********************************");
        System.out.println("Name: " + this.name);
        System.out.println("Strength: " + this.strength);
        System.out.println("Weapons: " + this.weapons[0] + ", ");
    }
}
