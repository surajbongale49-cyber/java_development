import java.util.Scanner;

public class Math_Three_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum number is: " + Math.max(Math.max(a, b), c));
    }
}
