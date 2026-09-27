import java.util.Scanner;

public class Increasing_decreasing {

    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        print(n);

    
    }

    public static void print(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Print before recursive call
        System.out.print(n + " ");

        // Recursive call
        print(n - 1);

        // Print after recursive call
        if (n != 1) {
            System.out.print(n + " ");
        }
    }
}