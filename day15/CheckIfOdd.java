package day15;

public class CheckIfOdd {

    public static void oddOrEven(int n){

        int bitMask = 1;

        if( (n & bitMask) == 0 ){
            System.out.println( n + " is an even number");
        }
        else{
            System.out.println( n + " is an odd number");
        }

    }

    public static void main(String[] args) {

        int num= 3;
        oddOrEven(num);
        
    }
    
}
