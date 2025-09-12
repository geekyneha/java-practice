package day12;

public class SelectionSort {


    public static void selectionsort(int arr[]){
        
        int n = arr.length;


        for(int i = 0 ; i < n-1; i++){

            int smallest = i;

            for(int j = i+1; j < n ; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest] ;
            arr[smallest] = temp; 
        }
       

       

    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

       selectionsort(arr);

        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
