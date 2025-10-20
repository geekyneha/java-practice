package day22;
import java.util.ArrayList;
public class FindMax {


    public static void main(String args[]){


        ArrayList <Integer> list = new ArrayList<>();


        list.add(15);
        list.add(42);
        list.add(7);
        list.add(23);
        list.add(8);


        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i< list.size(); i++)
        {
             if(list.get(i) > maxi){
                maxi=list.get(i);
             }

        }

        System.out.println("Maximum value in the ArrayList: " + maxi);
    }
    
    
}
