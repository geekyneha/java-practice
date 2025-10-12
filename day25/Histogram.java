package day25;

public class Histogram {
    public static void printHistogram(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        for (int i = max; i >= 1; i--) {
            for (int num : arr) {
                if (num >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        printHistogram(arr);
    }
    
}
