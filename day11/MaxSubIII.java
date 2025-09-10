package day11;

public class MaxSubIII {

    public static int kadanesMaxSum(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            
       
            if(currSum < 0){
                currSum = 0;
                
            }

            currSum += arr[i];

          if(maxSum < currSum){
            maxSum = currSum;
          }
        }

        if(maxSum ==0){
            for(int i = 0; i < arr.length ; i++){
                maxSum = Math.max(maxSum,arr[i]);
            }
        }
        

        return maxSum;

    }

    public static void main(String[] args) {

        int arr[] = {-2, -3, -1, -2, 0};

        System.out.println(kadanesMaxSum(arr));
        
    }
    
}
