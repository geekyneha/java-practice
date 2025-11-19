package day30;
public class Inheri {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
       
    }
    
}

interface Animal {
    void sound();
    
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }

}
