package lower.lesson10;

/**
 * The entry point of this program to demonstrate variable scope.
 */
public class VariableScopeMain {
    public static void main(String[] args) {
        //System.out.println("[VariableScopeMain.main] From here, we have access to a variable count through the VariableScopeDemo class: " + VariableScopeDemo.count);
        //System.out.println("[VariableScopeMain.main] Access to class methods, let's call VariableScopeDemo.lesson() and see other blocks running...");
        //VariableScopeDemo.lesson();
        //System.out.println("[VariableScopeMain.main] VariableScopeDemo.lesson() is gone now, and so are the variables within it like myName.");
        //System.out.println("[VariableScopeMain.main] But guess what, VariableScopeDemo.count lives on so we can see the updated value within this scope: " + VariableScopeDemo.count);

        UselessProgram.exec();
        UselessProgram.max = 20;
        UselessProgram.exec();
        UselessProgram.exec();
    }
}
