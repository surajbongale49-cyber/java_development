import java.util.Scanner;
public class Rotate_Array {
    // Method to rotate the array
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] ans = new int[n];
        int j = 0;

        // Copy last k elements
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // Copy remaining elements
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    // Method to print the array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of an Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Number of Rotations: ");
        int k = sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        int[] ans = rotate(arr, k);

        System.out.println("Rotated Array:");
        printArray(ans);

    }
}
