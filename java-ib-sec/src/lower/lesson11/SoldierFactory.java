package lower.lesson11;

/**
 * A really simple program that creates instances 
 */
public class SoldierFactory {

    public static void make() {

        /**
         * Create an instance of Soldier for a character Jack.
         * ----------------------------------------------------------------------------
         */
        Soldier jack = new Soldier(); // declare and create physical instance of Soldier
        
        jack.health = Soldier.MAX_HEALTH; // access a static constant and assign it to a variable/property
        
        jack.name = "Jack"; // assign a value for name variable/property
        
        // TODO assign a value for strength and weakness
        
        jack.weapons[0] = "M82";

        // TODO give Jack a couple of more weapons

        // TODO assign a value for currentWeaponIndex

        /**
         * Create an instance of Soldier for a character Amanda.
         * ---------------------------------------------------------------------------------
         */
        // TODO object instance for Amanda

         /**
          * Display all soldiers
          */
          display(jack);
          // TODO display Amanda
    }

    public static void display(Soldier soldier) {
        System.out.println("**********************************");
        System.out.println("********* Soldier Object *********");
        System.out.println("**********************************");
        System.out.println("Name: " + soldier.name);
        System.out.println("Strength: " + soldier.strength);
        System.out.println("Weapons: " + soldier.weapons[0] + ", ");
    }
}
