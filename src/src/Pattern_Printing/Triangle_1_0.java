import java.util.Scanner;

public class Triangle_1_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = (i % 2 != 0) ? 1 : 0; // Start value for each row

            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x = 1 - x; // Toggle between 1 and 0
            }
            System.out.println();
        }
    }
}