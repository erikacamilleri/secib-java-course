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
        
        // assign a value for strength and weakness
        jack.strength = "Vision";

        jack.weakness = "Speed";
        
        jack.weapons[0] = "M82";

        // give Jack a couple of more weapons
        jack.weapons[1] = "rifle";

        jack.currentWeaponIndex = 0;

        /**
         * Create an instance of Soldier for a character Amanda.
         * ---------------------------------------------------------------------------------
         */
        Soldier amanda = new Soldier();
        
        amanda.name = "Amanda";

         /**
          * Display all soldiers
          */
          jack.display();
          
          amanda.display();
          
          // TODO display Amanda
    }
}
