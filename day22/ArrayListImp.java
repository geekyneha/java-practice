package day22;
import java.util.ArrayList;

public class ArrayListImp {



    public static void main(String args[]){
       // Classname datatype referenceNmae = new Constructor

        ArrayList <Integer> list = new ArrayList<> ();


        // Operations on ArrayList

        // 1. Adding elements -> O(1)

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        // 2. Accessing elements -> O(1)

        int element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // 3. Modifying elements -> O(n)
        list.set(2, 35);
        System.out.println("After modification: " + list);

        // 4. Removing elements -> O(n)
        list.remove(3);
        System.out.println("After removal: " + list);

        // 5. Containing elements -> O(n)

        boolean contains20 = list.contains(20);
        System.out.println("List contains 20: " + contains20);

        // 6. Add element at specific index -> O(n)
        list.add(2,30);
        list.add(3, 40);

        System.out.println(list);
    }
    
}
