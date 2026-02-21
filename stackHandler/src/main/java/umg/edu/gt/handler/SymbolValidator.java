package umg.edu.gt.handler;

import umg.edu.gt.data_structure.stack.LikedStack;

public class SymbolValidator {

    public static boolean isValid(String exp) {

        LikedStack stack = new LikedStack();

        for (int i = 0; i < exp.length(); i++) {

            char c = exp.charAt(i);

            // símbolos de apertura
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            // símbolos de cierre
            if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = (Character) stack.pop();

                if (!match(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean match(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}