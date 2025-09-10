package day11;

public class MaxSubArray {


     

    public static int maxSumSubArr(int arr[]){

        int maxSum =Integer.MIN_VALUE;

        int curr = Integer.MIN_VALUE; 
        for(int i = 0 ; i< arr.length ; i++){

            curr=curr+arr[i];

            if(maxSum<curr) {
                maxSum=curr;
            }
            

        }

        if(curr<0){
                curr= 0;
            }
        return 0;
    }

    public static void main(String[] args) {
        
    }
    
}
