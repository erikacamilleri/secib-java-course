import lower.lesson12.NumberStack;

public class App {
    public static void main(String[] args) throws Exception {
        NumberStack numberStack = new NumberStack();
        numberStack.push(1);
        numberStack.push(2);

        System.out.println(numberStack.pop());
        // System.out.println(numberStack.pop());
        System.out.println(numberStack.isEmpty());
    }
}
