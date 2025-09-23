package day17;

public class LastOcc {


    public static int lastOcc(int arr[], int key,int i){
        if(i==arr.length) return -1;


        int isFound = lastOcc(arr,key,i+1);

        if(isFound == -1 && arr[i]==key) return i;

        return isFound;
    }



    public static void main(String[] args) {


        int arr[] = {1,3,4,6,7,3,89,9,4};
        System.out.println(lastOcc(arr, 4, 0));
        
    }
    
}
