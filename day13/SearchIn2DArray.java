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

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{1,2,5},{4,5,6}};
          
        search(arr,6);

    }
    
}
