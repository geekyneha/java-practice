package day25;
public class DuplicateParenthesis {

    public static boolean hasDuplicateParenthesis(String expression) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == ')') {
                if (stack.peek() == '(') {
                    return true; // Found duplicate parenthesis
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop(); // Pop the opening parenthesis
                }
            } else {
                stack.push(ch);
            }
        }

        return false; // No duplicate parenthesis found
    }

    public static void main(String[] args) {
        String expression = "((a+b)) + (c+d)";
        System.out.println(hasDuplicateParenthesis(expression)); // Output: true
    }
    
}
