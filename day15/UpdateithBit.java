package day15;

public class UpdateithBit {
    
    public static int updateIthBit(int n, int i, int newBit) {
        // Step 1: Clear the ith bit
        int bitMask = ~(1 << i);
        n = n & bitMask;

        // Step 2: Set the ith bit to newBit
        bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {

        System.out.println(updateIthBit(10, 1, 1));

    }
    
}
