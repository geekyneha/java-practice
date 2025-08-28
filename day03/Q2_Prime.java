package day03;
import java.util.*;
public class Q2_Prime {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
         
        if(num<=1) isPrime = false;
        // for(int i = 2; i <= num ; i++)
        // we can also write i*i <= num instead of i <= sqrt(num) to avoid computing square root -> If we have found a factor less than or equal to the square root of n, then there must be a corresponding factor greater than or equal to the square root of n.
        for(int i = 2; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                isPrime = false;
                break;

            }
        }

        if(isPrime){
            System.out.println( num + " is a Prime number");
        }
        else{
            System.out.println( num + " is not a Prime number");
        }
        sc.close();
    }
    
}
