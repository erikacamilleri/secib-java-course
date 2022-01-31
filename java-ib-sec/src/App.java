import lower.lesson12.PostfixEvaluation;

public class App {
    public static void main(String[] args) throws Exception {
        
        PostfixEvaluation p = new PostfixEvaluation();
        
        p.expression = "239*+5/";

        int result = p.evaluate();

        System.out.println(result);
    }
}
