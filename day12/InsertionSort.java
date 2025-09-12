package day12;

public class InsertionSort {

    public static void insertionsort(int arr[]){
        
        int n = arr.length;

        for(int i = 1 ; i < n; i++){
            int curr = arr[i] ; 
            int prev = i-1;

            // finding the correct position for curr
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
       
        
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        insertionsort(arr);

        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
