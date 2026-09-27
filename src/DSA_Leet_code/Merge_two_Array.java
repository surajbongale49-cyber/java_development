import java.util.Scanner;
import java.util.Arrays;

public class Merge_two_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of 1st Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the 1st Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Size of 2nd Array:");
        int m = sc.nextInt();

        int[] brr = new int[m];

        System.out.println("Enter the 2nd Array Elements:");
        for (int i = 0; i < brr.length; i++) {
            brr[i] = sc.nextInt();
        }

        // Create merged array
        int[] merge = new int[n + m];

        // Copy first array
        for (int i = 0; i < n; i++) {
            merge[i] = arr[i];
        }

        // Copy second array
        for (int i = 0; i < m; i++) {
            merge[n + i] = brr[i];
        }

        // Sort merged array
        Arrays.sort(merge);

        // Print sorted array
        System.out.println("Sorted Merged Array:");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }

        // Find median
        int len = merge.length;
        double median;

        if (len % 2 != 0) {
            // Odd length
            median = merge[len / 2];
        } else {
            // Even length
            int middle1 = merge[(len / 2) - 1];
            int middle2 = merge[len / 2];

            median = (middle1 + middle2) / 2.0;
        }

        System.out.println("\nMedian: " + median);

        sc.close();
    }
}
