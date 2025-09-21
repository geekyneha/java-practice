package day16;

public class Constructorss {

    public static void main(String args[]){
        

        //Type of Constructors(Polymorphism)
        

        // Non-Parametrized Constructor
        Student s1 = new Student();
        s1.name ="john";
        s1.rollNum= 125;

        // Parametrized Constructor- 
        Student s2= new Student("Neha");
        Student s3 = new Student(123);

        // Copy constructor
        Student s4= new Student(s1);
        s4.password="nythts231";

       

    }
    
}


class Student{
    String name;
    int rollNum;
    String password;

     Student(){

        System.out.println("Constructor is called...");
        System.out.println();

    }

    Student(String name){
        System.out.println("Parametrized Constructor is called...");
        this.name = name;
        System.out.println("Name: " + name);
        System.out.println();
    }

    Student(int rlNo){
        this.rollNum = rlNo;
       
        System.out.println("Parameterized Constructor is called...");
         System.out.println("Roll No: "+ rollNum);
        System.out.println();
    }

    Student(Student s1){

        this.name = s1.name;
        this.rollNum= s1.rollNum;
        
       

       System.out.println("Copy Constructor is called...");

       System.out.println("Name: "+name);
       System.out.println("Roll Number: "+rollNum);
       System.out.println();
        
    }
    
    
}
