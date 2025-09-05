package day08;

public class NumberSys {
    public static void bintoDec(int n){

        int pow = 0;
        int dec= 0;

        while(n>0){
            int lD = n % 10;

            dec = dec + (lD * (int) Math.pow(2,pow));

            pow++;
            n = n / 10;
        }
       System.out.println("Decimal: " 
       + dec);
    }

    public static void main(String[] args) {
        bintoDec(101);
        
    }
    
}
