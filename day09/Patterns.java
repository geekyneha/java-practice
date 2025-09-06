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
     
    public static void invertedTriangle(int n){
      

        for(int i = 1; i <=n; i++){
            //spaces
            for(int j = 1; j<= n - i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }      
    } 

    public static void inverted_pyrwithNumbers(int n){
        System.out.println("Inverted Pyramid with Numbers");
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j<= n - i + 1 ; j++){
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }

    public static void floydsTriangle(int n){
        System.out.println("Floyds Triangle");

        int num=1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void triangle01(int n){
        System.out.println(" triangle");
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j) % 2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");

                }
                
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n){
        System.out.println("Butterfly pattern");
        for(int i = 1; i<=n ; i++){

            // starts - i
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
        

            // 2*(n-i) spaces
            for(int j=1; j<=2*(n-i);j++){
                System.out.print("  ");
            }

            //stars - i
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
          System.out.println();
        }

    

        for(int i = n; i>=1 ; i--){
            // starts - i
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
        

            // 2*(n-i) spaces
            for(int j=1; j<=2*(n-i);j++){
                System.out.print("  ");
            }

            //stars - i
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
          System.out.println();
        }
    }
    public static void main(String[] args) {

        hollowrectangle(4,5);
        invertedTriangle(6);
        inverted_pyrwithNumbers(5);
        floydsTriangle(5);
        triangle01(5);
        butterflyPattern(4);
        
    }
    
}
