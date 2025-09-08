package day10;

public class LineaSearch {

    public static int linear_Search (int arr[],  int target){

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i]==target){
                
                return i;
               
            }

        }
       return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,56,7,3,45,4};
        System.out.println(linear_Search(arr,80));
    }
    
}
