package day19;

public class MergeSort {

    public static void printArr(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    
    public static void merge(int arr[], int si, int mid, int ei){

       
        int temp[]= new int[ei-si + 1];
        int i = si; // starting index of left subarray
        int j=mid+1; // starting index of right subarray
        int k=0; // iterator index of temp array
        ;

        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;


        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=ei){
            temp[k]=arr[j];
            j++;
            k++;    
        }
        // copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
    }
    public static void mergeSort(int arr[], int si, int ei){

        int mid = si+(ei - si) / 2;
        if(si >= ei){
            return;
        }
       mergeSort(arr, si, mid);
       mergeSort(arr, mid+1,ei);
       merge(arr,si,mid,ei);

    }
    public static void main(String[] args) {
        int arr[]={38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
    
}
