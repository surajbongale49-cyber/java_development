import java.util.Stack;
public class Basic_Stack {
    public static void main(String[] args){
        Stack<String> st=new Stack<>();
        st.push("Suraj");
        st.push("Ravi");
        st.push("Avi");
        st.push("Om");
        System.out.println(st);
        st.pop();
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
    }
}
   