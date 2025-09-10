package day11;

public class PrefixSum {
    

    public static int maxSum(int arr[]){

        int p []= new int [arr.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = Integer.MIN_VALUE;
        
        p[0] = arr[0]; 

        for(int i = 1; i < p.length ; i++){

            p[i] = p[i-1] + arr[i];
            
        }

        for(int i = 0; i < arr.length ; i++){
            
            for(int j = i; j < arr.length ; j++){
               
                currSum = i == 0 ?  p[j] : p[j] - p[i-1];
               
                if( maxSum < currSum ){
                maxSum = currSum;
            }
            }

            
        }

        return maxSum;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        System.out.println(maxSum(arr));
    }
}
