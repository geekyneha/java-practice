package day08;

public class Q5_sumofDigits {

    public static int sumofdigits(int n){

        int sum = 0;

        while(n > 0){
         int ld = n % 10;
         sum+=ld;
         n=n/10;
        }
      return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(12345));
        
    }
    
}
