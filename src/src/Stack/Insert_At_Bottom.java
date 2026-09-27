import java.util.Stack;
public class Insert_At_Bottom {
    public static void rec(Stack<Integer> st){
        if(st.size()==0){
            st.push(4000);
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
        rec(st);
        System.out.println(st);


    }
}
