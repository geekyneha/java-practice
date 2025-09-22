package day16;

public class Statickeyword {

    static int a = 10; // static variable

    static void display() { // static method
        System.out.println("Static method called. Value of a: " + a);
    }

    public static void main(String[] args) {
        // Accessing static variable and method without creating an instance
        System.out.println("Value of a: " + Statickeyword.a);
        Statickeyword.display();

        // Creating an instance of the class
        Statickeyword obj = new Statickeyword();
        System.out.println("Accessing static variable through instance: " + obj.a);
        obj.display(); // Not recommended, but possible
    }
    
}
