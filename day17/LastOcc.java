package day17;

public class LastOcc {


    public static int lastOcc(int arr[], int key,int i){
        if(i<0) return -1;

        if(arr[i]==key) return i;

        return lastOcc(arr,key,i-1);
    }



    public static void main(String[] args) {


        int arr[] = {1,3,4,6,7,3,89,9};
        System.out.println(lastOcc(arr, 1, arr.length-1));
        
    }
    
}
