package day02;
import java.util.*;
public class Q2_AreaOfSquare {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Area of Square Calculator");

        System.out.println("Enter the length of one side of the square:");

        int a = sc.nextInt();
        int area = a * a;

        System.out.println("The area of the square with side length " + a + " is: " + area);
        sc.close();
    }
    
}
