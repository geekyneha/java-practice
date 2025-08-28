// Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
package day02;
import java.util.*;
public class Q1_Average{

   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Average Calculator: 3 numbers");
    

    System.out.println("Enter first number:"); 
    int a = sc.nextInt();
    System.out.println("Enter second number:"); 
    int b = sc.nextInt();
    System.out.println("Enter third number:"); 
    int c = sc.nextInt();

    int avg = (a + b + c) / 3;

    System.out.println("The average of " + a + ", " + b + ", and " + c + " is: " + avg);
    
    sc.close();

   }
 

}