import java.util.Stack;
public class Display_stack_w_array{
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        st.push(600);
        int n=st.size();
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
        System.out.println();
        System.out.println(st);
    }

}
