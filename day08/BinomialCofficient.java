package day08;

public class BinomialCofficient {

    public static int fact(int n){


      int fact = 1;
        for(int i = 1; i <=n ; i++){

            fact = fact * i;

            

        }

        return fact;

    }
     
    
    public static int binoCoeff(int n , int r){

         int fact_n = fact(n);
         int fact_r = fact(r);
         int fact_nmr = fact(n-r);
          
         int binoCoeff = fact_n / (fact_r * fact_nmr);
         return binoCoeff;

     }

    public static void main(String[] args) {

        System.out.println(binoCoeff(5,2));
        
    }
    
}
