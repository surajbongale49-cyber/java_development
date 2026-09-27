import java.util.Scanner;
import java.util.Stack;

public class  smart_infix {
    public static int calculate(int v1, int v2, char ch) {
        if (ch == '+') return v1 + v2;
        if (ch == '-') return v1 - v2;
        if (ch == '*') return v1 * v2;
        return v1 / v2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sc.nextLine();

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                val.push(ch - '0');

            else if (ch == '(')
                op.push(ch);

            else if (ch == ')') {
                while (op.peek() != '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    val.push(calculate(v1, v2, op.pop()));
                }
                op.pop();
            }

            else if (op.size() == 0 || op.peek() == '(')
                op.push(ch);
            else if (ch == '+' || ch == '-') {
                int v2 = val.pop();
                int v1 = val.pop();
                val.push(calculate(v1, v2, op.pop()));
                op.push(ch);
            }
            else if (ch == '*' || ch == '/') {
                if (op.peek() == '*' || op.peek() == '/') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    val.push(calculate(v1, v2, op.pop()));
                }
                op.push(ch);
            }
        }
        while (op.size() > 0) {
            int v2 = val.pop();
            int v1 = val.pop();
            val.push(calculate(v1, v2, op.pop()));
        }
        System.out.println(val.peek());
    }
}
