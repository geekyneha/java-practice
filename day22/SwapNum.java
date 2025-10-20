package day22;
import java.util.ArrayList;

public class SwapNum {

     public static void swapIndex(int index1, int index2, ArrayList<Integer> list){
            int temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
            System.out.println("After swapping: " + list);
        }

    public static void main(String args[]){

        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


       
        System.out.println("Before swapping: " + list);

        swapIndex(0,3,list);

        System.out.println("Final ArrayList: " + list);




    }
    
}
