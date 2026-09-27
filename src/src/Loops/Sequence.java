import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1, j = n; i <= j; i++, j--) {
            System.out.print(i + " ");

            if (i != j) {
                System.out.print(j + " ");
            }
        }
    }
}
