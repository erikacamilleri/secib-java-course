package lower.lesson12;

public class PostfixEvaluation {
    
    /**
     * ----- PROPERTIES -----------------------------------------------------------------
     */
    public String expression;

    /**
     * ----- METHODS ---------------------------------------------------------------------
     */
    public int evaluate() {
        // create a stack
        NumberStack stack = new NumberStack();
        // scan all characters one by one
        for(int i = 0; i < this.expression.length(); i++) {
            char c = this.expression.charAt(i);
             
            // if the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                // if the scanned character is an operator, pop two
                // elements from stack apply the operator
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch(c) {
                    case '+': {
                        stack.push(val2 + val1);
                    }
                    break; 
                    case '-': {
                        stack.push(val2 - val1);
                    }
                    break;
                    case '/': {
                        stack.push(val2 / val1);
                    }
                    break;
                    case '*': {
                        stack.push(val2 * val1);
                    }
                    break;
               }
            }
        }
        return stack.pop();   
    }
}
