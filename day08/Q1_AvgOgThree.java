package day08;

public class Q1_AvgOgThree {

    public static void avgOfnums(int a , int b, int c){
        int avg = (a+b+c) / 3;
        System.out.println("Average of " + a +", "+ b + ", " + c + " is " + avg);
    }

    public static void main(String args[]){
        avgOfnums(1,2,3);
        
    }
    
}
