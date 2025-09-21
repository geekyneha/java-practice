// Abstract classes cant be instantiated - we cannot create an instance of an Abstract class;

// Abstract class can have abstract and non-abstract method;

// Abstract classes can have constructors.

package day16;

public class AbstractClasses {

    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);
        System.out.println();
        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();

        Mustang m1 = new Mustang();
        // Animal -> Horse -> Mustang
    }
    
}

abstract class Animal{
    String color;

     Animal(){

        color = "brown";

        System.out.println("Animal constructor called");

    }

    void eat(){
        System.out.println("eats");
    }
    abstract void walk();





  
}

class Horse extends Animal{

    
    Horse(){
      System.out.println("Horse constructor called");
    }

    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }

}
class Mustang extends Horse{


    Mustang(){
        System.out.println("Mustang constructor called");
    }

}

class Chicken extends Animal{
   
   Chicken(){
    System.out.println("Chicken constructor called");
}

  void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }

}