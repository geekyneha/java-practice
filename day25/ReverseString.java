package day25;
import java.util.Stack;

public class ReverseString {


    public static String reverseString(String str){

        String reversed = new String();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){

            stack.push(str.charAt(i));

            

        }

        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        return reversed;
    }

   public static void main(String args[]){

        String str= "The quick brown fox";
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);

   }
    
}
