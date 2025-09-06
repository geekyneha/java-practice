package day09;

public class Patterns {

    public static void hollowrectangle(int rows, int cols){

        for(int i = 1; i <= rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || j==1 || i ==rows|| j==cols){
                    System.out.print("* ");
                }
                else{
                  System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        hollowrectangle(10,7);
        
    }
    
}
