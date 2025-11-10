package day25;
import java.util.Stack;

public class NextGreaterII {

    public static void main(String args[]){

        int arr[] = {6,8,0,1,3};
        int n = arr.length;

        Stack<Integer> s = new Stack<>();

        int nxtG[] = new int[n];

        for(int i= n-1; i>=0; i--){
            //pop smaller elements
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            //check if stack is empty
            if(s.isEmpty()){
                nxtG[i]=-1;
            }else{
                nxtG[i]=s.peek();
            }
            //push current element
            s.push(arr[i]);

        }

        System.out.println("Next Greater elements are: "+ nxtG);

        for(int i=0; i<n; i++){
            System.out.print(nxtG[i] + " ");

        }



    }
    
}
