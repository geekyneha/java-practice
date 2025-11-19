package day30;
public class Inheri {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
    
}

interface Animal {
    void sound();
    void eat();
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
