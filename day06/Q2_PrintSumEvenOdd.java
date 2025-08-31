package day06;
import java.util.*;
public class Q2_PrintSumEvenOdd {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Enter Integers ");
        int sumOfEven =0;
        int sumOfOdd= 0;

        for(int i = 0 ; i < n; i++){
            
            int num = sc.nextInt();  

            if(num%2==0){
                sumOfEven+=num;
            }
            else{
                sumOfOdd+=num;
            }

        }
       
        System.out.println("Sum of given even integers = "+ sumOfEven);
        System.out.println("Sum of given odd integers = "+ sumOfOdd);
       
        sc.close();
    }
    
}
