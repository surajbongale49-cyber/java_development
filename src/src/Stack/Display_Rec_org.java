import java.util.Stack;
public class Display_Rec_org {
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0)return;
        int t=st.pop();
        displayRec(st);
        System.out.print(t+" ");
        st.push(t);
    }
    public static void main(String[] args){
     Stack<Integer> st=new Stack<>();
      st.push(100);
      st.push(200);
      st.push(300);
      st.push(400);
      st.push(500);
      displayRec(st);
    }

}
