package day16;

public class Constructorss {

    public static void main(String args[]){
        
        
        //Type of Constructors(Polymorphism)
        

        // Non-Parametrized Constructor
        Student s1 = new Student();
        s1.name ="john";
        s1.rollNum= 125;
        s1.marks[0]=80;
        s1.marks[1]= 90;
        s1.marks[2]= 100;

        // Parametrized Constructor- 
        Student s2= new Student("Neha");
        Student s3 = new Student(123);

        // Copy constructor
        Student s4= new Student(s1);//copied - shallow copy
        s4.password="nythts231";
        // s1.marks[2] = 23; //  changes reflect 

        s1.marks[1]= 25;
        for(int i = 0; i<3; i++){
            System.out.println(s4.marks[i]);
        }
        

    

       

    }
    
}


class Student{
    String name;
    int rollNum;
    String password;
    int marks[];

     Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
        System.out.println();

    }

    Student(String name){
        marks = new int[3];
        System.out.println("Parametrized Constructor is called...");
        this.name = name;
        System.out.println("Name: " + name);
        System.out.println();
    }

    Student(int rlNo){
        marks = new int[3];
        this.rollNum = rlNo;
       
        System.out.println("Parameterized Constructor is called...");
         System.out.println("Roll No: "+ rollNum);
        System.out.println();
    }

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNum= s1.rollNum;
        // this.marks = s1.marks; // shallow copy
        

        // deep Copy - changes don't reflect
        for(int i = 0; i < marks.length ; i++){
            this.marks[i] = s1.marks[i];
        }
       

       System.out.println("Copy Constructor is called...");

       System.out.println("Name: "+name);
       System.out.println("Roll Number: "+rollNum);
       
        
    }

    
    
    
}
