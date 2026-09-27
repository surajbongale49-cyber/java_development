import java.util.Scanner;

public class Armstrong_Number1_500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int original = i;
            int temp = i;
            int sum = 0;

            while (temp != 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp = temp / 10;
            }

            if (original == sum) {
                System.out.println(original);
            }
        }
    }
}
