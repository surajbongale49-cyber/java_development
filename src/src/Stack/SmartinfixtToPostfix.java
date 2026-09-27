import java.util.Scanner;
import java.util.Stack;
public class SmartinfixtToPostfix {

    public static void calculate(Stack<String> val, Stack<Character> op) {
        String v2 = val.pop();
        String v1 = val.pop();
        char o = op.pop();
        val.push(o + v1 + v2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String infix = sc.nextLine();

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (ch >= '0' && ch <= '9')
                val.push("" + ch);

            else if (op.size() == 0 || ch == '(')
                op.push(ch);

            else if (ch == ')') {
                while (op.peek() != '(')
                    calculate(val, op);
                op.pop();
            }

            else if (ch == '+' || ch == '-') {
                calculate(val, op);
                op.push(ch);
            }

            else if (ch == '*' || ch == '/') {
                if (op.peek() == '*' || op.peek() == '/')
                    calculate(val, op);
                op.push(ch);
            }
        }

        while (op.size() > 0)
            calculate(val, op);

        System.out.println(val.pop());
    }
}

