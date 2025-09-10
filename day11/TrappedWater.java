package day11;

public class TrappedWater {
    
    public static int TrappingWater(int heights[])
    
    {
        
        int n = heights.length;

        if(n<=2) return 0;

        // calculate Leftxax boundry  - array

        int Leftmax [] = new int [n];
        Leftmax[0] = heights[0];

        for(int i = 1 ; i < n; i++){
            Leftmax[i] = Math.max(heights[i], Leftmax[i-1]);
        }

        // calculate Rightmax boundry - array

        int Rightmax [] = new int [n];
         
        Rightmax[n-1] = heights[n-1];
        for(int i = n-2; i>=0; i--){
            Rightmax[i] = Math.max(heights[i],Rightmax[i+1]);

        }
         
        // loop;
         int trappedwater= 0;
        for(int i = 0; i < n ; i++){

            // calculate waterLevel = min(LeftMax, RightMax);
         int waterLevel = Math.min(Leftmax[i],Rightmax[i]);
        // trapped water = waterLevel - heights[i];
        trappedwater += waterLevel - heights[i];
        }
        
        
        

        return trappedwater;

    }
    public static void main(String[] args) {
        int heights[] = {1,2,3,5,3,6};
        System.out.println(TrappingWater(heights));

    }
    
}
