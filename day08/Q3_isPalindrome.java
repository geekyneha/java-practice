package day08;

public class Q3_isPalindrome {

    

    public static boolean isPalindrome(int n){

        int num = n;
        int rev = 0;

        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n  = n /10;
        }
       
        return (num == rev) ?  true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1224));
    }
    
}
