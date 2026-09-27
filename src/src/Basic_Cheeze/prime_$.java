import java.util.Scanner;

public class prime_$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        boolean flag = false;

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                flag = true;
                break;
            }
        }

        if(n == 1)
            System.out.println("Neither prime nor composite");
        else if(flag == false)
            System.out.println("The number is prime");
        else
            System.out.println("The number is composite");
    }
}