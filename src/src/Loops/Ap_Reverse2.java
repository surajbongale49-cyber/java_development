import java.util.Scanner;

public class Ap_Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int term = 99;

        for (int i = 1; i <= n; i++) {
            System.out.println(term);
            term -= 4;
        }
    }
}
