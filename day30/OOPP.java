package day30;

public class OOPP {
    public static void main(String args[]){
        B obj = new B("Alice");
        obj.display();
    } 
    
}
class A{
String name;

A(String name){
   
    this.name= name;
}

void display(){
    System.out.println("Hello " + name);
}
}
class B extends A{
    
 // here we need to create constructor of class B. consructor of parent class is not inherited because constructors are not members of class. It is private to class only. if we want to use constructor of parent class we have to call it using super keyword.
 B(String name){
       super(name);
 }
 // how will this work? 
 // we will create an object of class B. we will pass the name to constructor of class B. inside constructor of class B we are calling constructor of class A using super keyword and passing the name to it. constructor of class A will initialize the name variable. now when we call display method using object of class B it will print the name. This is an example of constructor chaining where constructor of child class calls constructor of parent class.
}