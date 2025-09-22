package day17;

public class PrintNum {

    public static void printNum(int n){

        if(n<1) return;

        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {

        printNum(5);
        
    }
    
}
