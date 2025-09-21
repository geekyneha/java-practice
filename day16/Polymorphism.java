package day16;

public class Polymorphism {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(10,20));
       System.out.println( calc.sum(14,15,14));
        System.out.println(calc.sum((float)1.5,(float)3.5));

        
    }
    
}

// Method Overriding
class Calculator{
    
    
    int sum(int a, int b){
        return a+b;

    }

    float sum(float a, float b){
        return a+b;

    }

    int sum(int a, int b, int c){
      return a+b+c;
    }

    
}


