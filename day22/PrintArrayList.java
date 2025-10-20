package day22;

import java.util.ArrayList;
public class PrintArrayList {

    public static void main(String args[]){

        ArrayList <String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");    
        list.add("Date");
        list.add("Elderberry");


        // Printing using for loop

        for(int i =0; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        // Printing reverse order using for loop

        System.out.println("Printing in reverse order:");
        for(int i = list.size() -1 ; i>=0; i--){
            System.out.println(list.get(i));
        }
        
        

    }
    
}
