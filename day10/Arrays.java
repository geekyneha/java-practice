package day10;

public class Arrays {

    public static void printArr(int arr[], int myNumber){
        myNumber = 15;
        System.out.println("MY number is " + myNumber);
        for(int i = 0; i < arr.length ; i++){

            System.out.println(arr[i]);
 
        }
    }


    public static void main(String args[]){

        int arr[] = {9,8,7,6,5,4,3,2,1,0}; // passed by reference
        int myNumber = 10; // passes by value
        
        printArr(arr, myNumber);

        System.out.println(arr[6]);
        System.out.println(myNumber);

    }
    
}
