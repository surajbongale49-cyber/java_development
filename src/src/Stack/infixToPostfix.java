import java.util.Scanner;
import java.util.Stack;
public class infixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String infix = sc.nextLine();
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int n = infix.length();
        for (int i = 0; i < n; i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            }
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t =v1 + v2 + o;
                    val.push(t);
                }
                op.pop();
            }

            else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                   String t =v1 + v2 + o;
                    val.push(t);
                    op.push(ch);
                }

                else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                       String t =v1 + v2 + o;
                        val.push(t);
                    }
                    op.push(ch);
                }
            }
        }

        while (op.size() > 0) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t =v1 + v2 + o;
            val.push(t);
        }
        String postfix = val.pop();
        System.out.println(postfix);
    }
}

              