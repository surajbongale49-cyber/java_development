import java.util.Stack;
public class Remove_ba_idx {
    public static void main(String[] args){
    Stack<Integer> st=new Stack<>();
      int idx=2;
      st.push(100);
      st.push(200);
      st.push(300);
      st.push(400);
      st.push(500);
      System.out.println(st.size());
      System.out.println(st);
    Stack<Integer> st1=new Stack<>();
      while(st.size()-1>idx){
        st1.push(st.pop());
      }
      st.pop();
      while(st1.size()>0){
        st.push(st1.pop());
      }
      System.out.println(st);
    }
}
