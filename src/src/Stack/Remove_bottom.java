import java.util.Stack;
public class Remove_bottom {
    public static void rec(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return ;
        }
        int t=st.pop();
        rec(st);
        st.push(t);

    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        st.push(600);
        System.out.println(st);
        rec(st);
        System.out.println(st);
    }
}
