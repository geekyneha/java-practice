package day19;

public class RotateSortedArray {
    public static int findPivot(int arr[]){
        int si = 0;
        int ei = arr.length - 1;

        while(si < ei){
            int mid = si + (ei - si) / 2;

            if(arr[mid] >= arr[0]){
                si = mid + 1;
            } else {
                ei = mid;
            }
        }
        return si;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println("Pivot is at index: " + findPivot(arr));
    }
    
}
