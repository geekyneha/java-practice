package day04;
import java.util.*;
public class Q1_PosOrNeg{

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a number: ");
         int num = sc.nextInt();

         if(num>0){
            System.out.println("The number is positive");
         }
         else if(num<0){
            System.out.println("the number is negative");
         }
         else{
            System.out.println("The number is Zero");
         }
            sc.close();
    }

}