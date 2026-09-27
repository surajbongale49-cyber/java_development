import java.util.Stack;
public class insertAtBottom {
    public static void insertAtBottom(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return ;
        }
        int top=st.pop();
        insertAtBottom(st,ele);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30); 
        st.push(40);
        st.push(50);
        int ele=60;
        System.out.println(st);
        insertAtBottom(st,ele);
        System.out.println(st);
    }
}
