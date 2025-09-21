package day16;

public class ClassAndObjects {

    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setType("Gel");

        System.out.println("Pen Color is "+ p1.color);

        System.out.println("Pen Type is "+ p1.type);
    }

    
    
}

class Pen{
    String color;
    String type;

    void setColor(String newColor){
        color = newColor;
    }
    void setType(String newType){
        type = newType;
    }


}