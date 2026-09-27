import java.util.Stack;
public class pop_push_stack {
    public static void main(String[] args){
      Stack<Integer> st=new Stack<>();
      System.out.println(st.isEmpty());
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(5);
      System.out.println(st);
      System.out.println(st.size());
      st.pop();
      System.out.println(st);
      while(st.size()>1){
        st.pop();
      }
    System.out.println(st);

    }

}
