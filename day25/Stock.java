package day25;

public class Stock {

    // stock span problem;

    public static void stockSpan(int [] prices, int [] span){
      for(int i=0; i<prices.length; i++){
        span[i] = 1; // Initialize span for each day
        for(int j=i-1; j>=0 && prices[j] <= prices[i]; j--){ // Check previous days
            span[i]++;

            
        }
        
      }

    }



   


    public static void main(String[] args){

        int[] prices = {100,80,60,70,60,75,85};
                                         
      




    }
    
}
