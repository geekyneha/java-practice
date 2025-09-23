package day17;

public class FirstOcc {
    
    public static int firstOcc(int arr[], int key , int i){
        
        if(i == arr.length-1) return -1;

        if(arr[i] == key) return i;

        return firstOcc(arr,key,i+1);

    }
    public static void main(String[] args) {

        int arr[]={1,2,45,6,79,9,8,6,45};
        System.out.println(firstOcc(arr, 7, 0));
        
    }
    
}
