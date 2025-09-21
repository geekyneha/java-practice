// Interface is a blueprint of a class. It has static constants and abstract methods.
// It is used to achieve abstraction and multiple inheritance in Java.
// It is a mechanism to achieve loose coupling.
// It is used to achieve polymorphism in Java.
// It is used to achieve security in Java.
package day16;

public class Interfaces {
  
    // by default, all the methods in an interface are abstract and public.
    // by default, all the variables in an interface are public, static and final.
    // we cannot create an object of an interface.
    // abstract methods do not have a body.
    public static void main(String[] args) {
        
    }
    
}

interface Chessplayer{
    void move();
}

class Queen implements Chessplayer{
    public void move(){
        System.out.println("Queen can move in any direction left, right, up, down and diagonally");
    }
}

class Rook implements Chessplayer{
    public void move(){
        System.out.println(" left, right, up and down");
    }
}
class King implements Chessplayer{
    public void move(){
        System.out.println("Queen can move in any direction left, right, up, down and diagonally(not more than one step)");
    }
}

