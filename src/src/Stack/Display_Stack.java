import java.util.Stack;
public class Display_Stack {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(1); 
        st.push(2);
        st.push(3); 
        st.push(4);
        st.push(5);
        Stack<Integer> st2=new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        while(st2.size()>0){
            int x=st2.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
        System.out.println(st);
    }

}
