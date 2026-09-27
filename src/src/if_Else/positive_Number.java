import java.util.Scanner;

public class positive_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("The Number is +ve");
        } else if (a == 0) {
            System.out.println("The Number is not +ve or -ve");
        } else {
            System.out.println("The Number is -ve");
        }

        sc.close();
    }
}