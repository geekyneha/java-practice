package day30;
import java.util.*;

public class OOPQUES {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        // real and imaginary parts of first complex number
        System.out.print("Enter real and imaginary parts of first complex number: ");
        int a1 = sc.nextInt();
        System.out.println(" + i ");
        int b1 = sc.nextInt();

        Complex c1 = new Complex();
        c1.sum(a1, b1);
        c1.diff(a1, b1);
        c1.prod(a1, b1);



    }
}

class Complex{
    void sum (int a, int b){
        System.out.println("Sum of two integers: " + (a + b));
    }
    void diff (int a, int b){
        System.out.println("Difference of two integers: " + (a - b));
    }
    void prod (int a, int b){
        System.out.println("Product of two integers: " + (a * b));
    }

} 
