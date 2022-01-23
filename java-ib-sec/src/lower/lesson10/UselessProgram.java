package lower.lesson10;

public class UselessProgram {
    
    public static int max = 10;

    public static int sum = 0;

    public static void exec() {
        int count;
        
        for (count = 0; count < (max - 6); count++) {
            if (count == 0 && max > 0) {
                System.out.println("Hello");
            } else if (count > 2) {
                System.out.println("Go for it");
            } else {
                System.out.println("Ok");
            }
        }
        
        sum += count; // same as sum = sum + count;

        System.out.println("Total " + sum);
    }

    public static void qanda() {
        System.out.println("What is a scope? Define the scope of the COUNT variable in your program.");
        System.out.println("A scope is a block that defines the boundary in which variables can live and thus be used.");
    }
}
