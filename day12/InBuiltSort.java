package day12;
import java.util.*;

public class InBuiltSort {






public static void main(String[] args) {
        Integer arr[] = {5,4,3,2,1};

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
