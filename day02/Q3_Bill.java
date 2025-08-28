package day02;
import java.util.*;
public class Q3_Bill {

    public static void main(String args[]){
       

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the item:");
         
        System.out.println("Enter the price of the pencil:");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of the pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of the eraser:");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        float gst = (total* 18) / 100;

        float finalAmount = total + gst;
         System.out.println("Total price without GST is: " + total);
            System.out.println("GST amount is: " + gst);
        System.out.println("Total amount to be paid is: " + finalAmount);
        sc.close();
    }
    
}
