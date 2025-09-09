package day10;

public class LargestNum {

    public static int find_largest(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length ; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String args[]){
        int arr[] = {-67,-900,-50,-40};

        System.out.println(find_largest(arr));
    }
    
}
