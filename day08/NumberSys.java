package day08;

public class NumberSys {
    public static void bintoDec(int n){
        int num = n;

        int pow = 0;
        int dec= 0;

        while(n>0){
            int lD = n % 10;

            dec = dec + (lD * (int) Math.pow(2,pow));

            pow++;
            n = n / 10;
        }
       System.out.println(num + " in Decimal: " 
       + dec);
    }

    public static void dectoBin (int n){
        
        int num = n;
        int pow =0;
        int binNum = 0;

        while(n > 0){

             int rem = n % 2;

             binNum  = binNum + (rem * (int)Math.pow(10,pow));

             pow++;
             n = n / 2;

        }

        System.out.println(num +" in Binary: " + binNum);
    }

    public static void main(String[] args) {
        bintoDec(101);
        dectoBin(7);
        
    }
    
}
