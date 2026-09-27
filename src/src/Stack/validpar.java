import java.util.Stack;
public class validpar {
    public static void main(String[] args) {
        String s = "()(())";
        Stack<Character> st = new Stack<>();
        int t = s.length();
        for (int i = 0; i < t; i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } 
            else {
                if (st.isEmpty()) {
                    System.out.println("Invalid Parenthesis");
                    return;
                }
                st.pop();
            }
        }

        if (st.isEmpty()) {
            System.out.println("Valid Parenthesis");
        } 
        else {
            System.out.println("Invalid Parenthesis");
        }
    }
}
