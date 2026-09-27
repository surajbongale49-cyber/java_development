import java.util.Scanner;

public class Reverse_the_Num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        int rem, sum = 0;

        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            sum = (sum * 10) + rem;
        }

        System.out.println("The Reverse Number is :");
        System.out.println(sum);
    }
}
