package day16;

public class Inherit {

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

        // Hierarchical inhertance;

          Fish shark = new Fish();
          shark.eat();
          shark.swim();
          Bird kingFisher = new Bird();
          kingFisher.fly();
          kingFisher.eat();





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

 void swim(){
    System.out.println("Fish swims");
 }
    

}

class Mammals extends Animal {

    int legs;

    void walk(){
        System.out.println("Animal walks");
    }

}

class Bird extends Animal{

    void fly(){
        System.out.println("Bird files.");
    }
}

class Dog extends Mammals{
    String breed;
}
