package day30;



public class OOP{
    
    // new keyword is used to create object and it allocates memory to the object in heap. all objects are stored in heap memory.
    public static void main(String[] args){
        Pen p1= new Pen();
        Pen p2= new Pen();
         
        // Here s1 is the object of Student class and it is created using new keyword which allocates memory to s1 in heap. Student() is the constructor of Student class. 
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student(s2);
        s3.name = "Mysha";
        System.out.println(s1.marks[0] );
        System.out.println(s3.marks[0]);

        System.out.println("Color of p1: " + p1.color);
        p1.changeColor("red");
         System.out.println("Color of p1: " + p1.color);
           System.out.println("Tip size of p2: " + p2.getTipSize()); 
        p2.changeTipSize(10);
        System.out.println("Tip size of p2: " + p2.getTipSize()); 

        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum(1,23,4));
        System.out.println(calc.sum(1.2f,1.5f));

         Horse mustang = new Horse();
         mustang.eat();

         Dog labrador = new Dog();
            labrador.makeSound();
            labrador.bark();
            labrador.walk();

        Animal1 a1 = new Dog();
        a1.makeSound();
        a1.walk();
        
        Employee.company = "TechCorp";
        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.name = "John Doe";
        double salary = Employee.calcSalary(50000, 10000);
        System.out.println("Employee Name: " + emp1.name);
        System.out.println("Company: " + Employee.company);
        System.out.println("Salary: " + salary);
        
        Employee emp2 = new Employee();
        emp2.id = 102;
        emp2.name = "Jane Smith";
        double salary2 = Employee.calcSalary(60000, 15000);
        System.out.println("Employee Name: " + emp2.name);
        System.out.println("Company: " + Employee.company);
        System.out.println("Salary: " + salary2);
    }


}

//class: It is a blueprint from which individual objects are created.
class Pen{
    String color = "blue";
    private int tipSize =5;

    int getTipSize(){
        return this.tipSize;
    }

    void changeColor(String color){
        this.color = color;
    }

    void changeTipSize(int tipSize){
        this.tipSize = tipSize;
    }

}

class Student{

    String name;
    int age;
    int rlno;
    String address;
    int marks[]={50,60,70,80,90};

    Student(){
        System.out.println("Constructor called");
    }
    
    // This is a parameterized constructor which initializes the name of the student at the time of object creation.
    Student(String name){
        this.name = name;
    }

    Student (Student s1){
      this.name = s1.name;
      this.age = s1.age; 
      
      

    for(int i=0; i< s1.marks.length; i++){
        this.marks[i]= s1.marks[i];

    }
    this.marks[0]=100;


    }

    


}
// Method Overloading: When multiple methods have the same name but different parameters (different type or number of parameters) in the same class, it is known as method overloading.
class Calculator{
    int sum( int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    float sum (float a, float b){
        return a+b;
    }
}

// Method Overriding: When a subclass provide specific implementation of a method that is already defined in its superclass, it is knnown as method overriding. Method defined in subclass overrides the method in superclass and when the method is called on an object of subclass, the subclass's version of the method is executed.
// It is a runtime polymorphism because the method to be executed is determined at runtime based on the object type.
class Animal{
     Animal(){
        System.out.println("Animal constructor called");
     }
    void eat(){
        System.out.println("eats anyting");
    }
    void sleep(){
        System.out.println("sleeps 8 hours");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }

}
class Horse extends Animal{
     Horse(){
        System.out.println("Horse constructor called");
     }
    void eat(){
        System.out.println("eats grass");

    }
   

}

abstract class Animal1{
    Animal1(){
        System.out.println("Animal1 constructor called");
    }
    void makeSound(){
        System.out.println("Animal makes a sound");
    }

    abstract void walk();

}

class Dog extends Animal1{
    Dog(){
        System.out.println("Dog constructor called");
    }
    void bark(){
        System.out.println("Dog barks");
    }

    void walk(){
        System.out.println("Dog walks on 4 legs");
    }
}


// Interface: It is a blueprint of a class that defines a set of abstract methods method without body that a class must implement. It is used to achieve abstraction and multiple inheritance in Java. Abstact classes can have both abstract and concrete methods, whereas interface can have abstract and public methods only. It can have final, static and public variables only. A class can implement multiple interfaces, but can extend only one class. It is used to achieve total abstraction.

interface Herbivore{
    void eatPlants();

}

interface Carnivore{
    void eatMeat();

}
class Bear implements Herbivore, Carnivore{

    public void eatPlants(){
        System.out.println("Bear eats plants");
    }
    
    public void eatMeat(){
        System.out.println("Bear eats meat");
    }

}

// Static members: Static members belong to the class rather than to any specific instance of the class. They are shared among all instances of the class and can be accessed without creating an object of the class. Static members are used to store common data or behavior that is shared among all instances of the class.
class Employee{
    int id;
    String name;

   static String company; 

   static double calcSalary(int basic, int bonus){
    return basic+ bonus;
   }

} 


