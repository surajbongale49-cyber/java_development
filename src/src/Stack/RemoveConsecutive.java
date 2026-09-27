import java.util.*;
public class RemoveConsecutive {
    public static void main(String[] args) {
        String s = "aaaabbcccd";
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i=0;i<n;i++){
            if (st.empty()){
                st.push(s.charAt(i));
            }
            else if(st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
            }
        }

        for (int i=0;i<st.size();i++) {
            System.out.print(st.get(i));
        }
    }
}

