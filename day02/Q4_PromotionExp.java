package day02;

public class Q4_PromotionExp {
   
    public static void main(String args[]){
        byte b = 42;
        char c= 'a';
        short s = 1000;
        float f = 10.04f;
        int i = 5000;
        double d = 123.54d;

        double result = (b * c) + (s / i) - (f * d);
        System.out.println(result);
    }
    
}
