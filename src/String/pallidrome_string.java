import java.util.Scanner;

public class pallidrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String s = sc.nextLine();

        boolean flag = true;

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("The given String is palindrome");
        } else {
            System.out.println("The given String is not palindrome");
        }

        sc.close();
    }
}
