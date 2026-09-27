import java.util.Stack;
public class InsertInStack {
    public static void main(String[]  args){
        Stack<Integer> st=new Stack<>();
        st.push(200);
        st.push(100);
        st.push(300);
        st.push(400);
        st.push(500);
        System.out.println(st);
        int idx=2;
        int x=700;
        Stack<Integer> st1=new Stack<>();
        while(st.size()>idx){
          st1.push(st.pop());
        }
        st.push(x);
        while(st1.size()>0){
            st.push(st1.pop());
        }
        System.out.println(st);
    }

}
