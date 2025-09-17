package day14;

public class LargestString {


    public static String largestString (String fruits[]){

        String largest = fruits[0];

        for(int i = 0; i < fruits.length; i++){

            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        return largest;

    }


    public static void main(String[] args) {

        String fruits [] = {"Apple", "Orange", "Pineapple", "Banana", "Grapes"};

        System.out.println(largestString(fruits));


        
    }
    
}
