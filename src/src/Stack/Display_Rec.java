import java.util.Stack;
public class Display_Rec {
    public static void displayRec(Stack<Integer> rt){
        rt.push(800);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        System.out.println(st);
        displayRec(st);
        System.out.println(st);
    }
}
