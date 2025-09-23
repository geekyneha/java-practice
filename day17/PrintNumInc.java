package day17;

public class PrintNumInc{

    public static void printNum(int n){
        

        if(n>10){
            return;
        }
        System.out.println(n);
        printNum(n+1);
        
        

    }

    public static void main(String[] args) {

        
       printNum(0);
        
    }

}