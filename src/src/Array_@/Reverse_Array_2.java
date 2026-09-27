import java.util.Scanner;

public class Reverse_Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        System.out.println("Enter the Array Element:");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array
        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print reversed array
        for(int i = 0; i < arr.length; i++) {
            System.out.println("The " + i + " index element is: " + arr[i]);
        }
    }
}