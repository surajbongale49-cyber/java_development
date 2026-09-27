import java.util.Stack;
public class Display_recursivily_Reverse{
  public static void displayRevRec(Stack<Integer> rt){
    if(rt.size()==0)return;
    int t=rt.pop();
    System.out.print(t+" ");
    displayRevRec(rt);
    rt.push(t);

  }
  public static void main(String[] args){
    Stack<Integer> st=new Stack<>();
    st.push(100);
    st.push(200);
    st.push(300);
    st.push(400);
    st.push(500);
    displayRevRec(st);
  }
}