package day19;

public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }

        // partitioning index
        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx - 1); // left part
        quickSort(arr, pIdx + 1, ei); // right part

    }
   public static int partition(int arr[], int si, int ei){

        int pivot = arr[ei];
        int i = si - 1; // to track the index of smaller element

        for(int j=si; j<ei; j++){
            if(arr[j] < pivot){
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[ei] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[ei];
        arr[ei] = temp;

        return i+1; // return the partitioning index
    }
    public static void printArr(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        printArr(arr);
        
    }
    
}
