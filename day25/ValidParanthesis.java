package day25;  
import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        
        for (int i=0; i < s.length(); i++) {

            char ch = s.charAt(i);

            //opening bracket
            // push it to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                // closing bracket
                //if no opening bracket is there in stack
            
                if (stack.isEmpty()) return false;

                //pop the top element and check if it matches
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s)); // Output: true
    }
    
}
