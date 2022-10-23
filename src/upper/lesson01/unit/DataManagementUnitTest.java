package upper.lesson01.unit;

import upper.lesson01.Fixture;

public class DataManagementUnitTest {
    public static void testReadFixtureById() {
        // set-up

        // Do Test
        Fixture fixture = Fixture.getDaoInstance().getById("NMK123JKLMN123");

        // Assert
        if (fixture != null && fixture.getFixtureId().equals("NMK123JKLMN123")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
