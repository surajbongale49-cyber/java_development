import java.util.Scanner;
import java.util.Stack;
public class infix_bracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int n = str.length();

        for (int i=0;i<n;i++) {
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if (ascii>=48 && ascii<=57)
                val.push(ascii - 48);
            else if (op.size()==0 || ch=='('|| op.peek()=='(')
                op.push(ch);
            else if(ch==')'){
               while(op.peek()!='('){
                 int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '*')
                        val.push(v1 * v2);
                    if (op.peek() == '/')
                        val.push(v1 / v2);
                    op.pop();
               }
               op.pop();
            }
            else {
                if (ch == '+' || ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '*')
                        val.push(v1 * v2);
                    if (op.peek() == '/')
                        val.push(v1 / v2);

                    op.pop();
                    op.push(ch);
                }

                else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*')
                            val.push(v1 * v2);
                        if (op.peek() == '/')
                            val.push(v1 / v2);
                        op.pop();
                    }
                    op.push(ch);
                }
            }
        }

        while (op.size() > 0) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '-')
                val.push(v1 - v2);
            if (op.peek() == '+')
                val.push(v1 + v2);
            if (op.peek() == '*')
                val.push(v1 * v2);
            if (op.peek() == '/')
                val.push(v1 / v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
