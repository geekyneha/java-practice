package day08;

public class Q4_Exercise {

    public static void mathsFunc(int a, int b){

        int minimum = Math.min(a,b);

        System.out.println(minimum);
        int maximum = Math.max(a,b);
        System.out.println(maximum);
        int absolute = (int)Math.abs(123.90);
        System.out.println(absolute);
        int squareRoot = (int)Math.sqrt(9);
        System.out.println(squareRoot);
        int twotothepow5 = (int)Math.pow(2,5);
        System.out.println(twotothepow5);
        

        
    }

    public static void main(String[] args) {

        mathsFunc(2,4);
        
    }
    
}
