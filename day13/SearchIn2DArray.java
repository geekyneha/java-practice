package day13;

public class SearchIn2DArray {

    public static void search(int arr[][], int target){
       
      for(int i = 0 ; i < arr.length ; i++){
        for(int j = 0; j < arr[0].length; j++){
            if(arr[i][j]== target){
                
                System.out.println(" found at (" + i + "," +j +")");
                
            }
        }
      }


      
      }

      public static int findLargest(int [][]arr){


        int largest = Integer.MIN_VALUE;
        
       
      for(int i = 0 ; i < arr.length ; i++){
        for(int j = 0; j < arr[0].length; j++){

            if(arr[i][j] > largest){
                largest = arr[i][j];
            }     
                
            }
        }
       
        return largest;
    }

     public static int findSmallest(int [][]arr){


        int smallest = Integer.MAX_VALUE;
        
       
      for(int i = 0 ; i < arr.length ; i++){
        for(int j = 0; j < arr[0].length; j++){

            if(arr[i][j] < smallest){
                smallest = arr[i][j];
            }     
                
            }
        }
       
        return smallest;
    }


    public static void main(String[] args) {
        int arr[][] = {{0,2,3},{1,7,5},{4,5,6}};
          
        search(arr,6);
       System.out.println( findLargest(arr));
       System.out.println( findSmallest(arr));

    }
    
}
