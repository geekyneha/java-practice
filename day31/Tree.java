package day31;

public class Tree {
    String type;
    int age;

    public Tree(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void grow() {
        age++;
        System.out.println("The " + type + " tree has grown. It is now " + age + " years old.");
    }  
}
