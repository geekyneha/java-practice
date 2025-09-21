package day16;

public class Inhertance {

    public static void main( String args[]){


        // Single level Inhertance
        Fish whale = new Fish();
        whale.eat();

        // Multilevel Inhertance

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs= 3;

        dobby.breed ="Bull dog";

        System.out.println(dobby.breed);
        System.out.println(dobby.legs);




    }
    
}

class Animal{

    void eat(){
        System.out.println("eats");
    }

    void breath(){

        System.out.println("Breathes");

    }

}

class Fish extends Animal{
 int fins;
    

}

class Mammals extends Animal {

    int legs;

}

class Dog extends Mammals{
    String breed;
}
