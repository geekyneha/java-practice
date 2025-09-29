package day20;

public class constantTC {

    public static void main(String[] args) {
        final int a = 10;
        // a = 20; // This line would cause a compilation error because 'a' is final and cannot be reassigned.
        System.out.println("The value of a is: " + a);
    }
    
}
