package day10;

public class PrintSubArr {

   

    public static int printSubArr(int arr[]){

         int maxSum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i  ; j < arr.length ; j++)

            {

                int sum = 0;
                for(int k = i ; k <= j ; k++   ){

                    System.out.print(arr[k]+" " );
                    sum=sum+arr[k];
                    
                }

                if(sum>maxSum){
                        maxSum=sum;
                    }
                System.out.println();

            }
            System.out.println();
        }

        return maxSum;

    }

    public static void main(String[] args) {

        int arr[] = { 2,4,6,8,10 };


        System.out.println(printSubArr(arr));

        
    }
    
}
