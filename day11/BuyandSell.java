package day11;

public class BuyandSell {

    public static int maximumProfit(int prices[]){

        int maxProfit =0;
        int BP = Integer.MAX_VALUE;


        for(int i = 0; i < prices.length; i++){
            if(BP < prices[i]){
                int profit = prices[i] - BP; // today's profit
                if(maxProfit<profit){
                    maxProfit= profit;
                }

            }
            else{
                BP = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = {7,1,5,4,6,4};

        System.out.println(maximumProfit(prices));

        
    }
    
}
