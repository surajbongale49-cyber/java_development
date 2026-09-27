import java.util.Scanner;
import java.util.Stack;
public class Element_Remove {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the Number of Element in the Stack :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int t=sc.nextInt();
            st.push(t);
        }
        System.out.println("before pop Elements in the Stack :");
        System.out.println(st);
        Stack<Integer> hp=new Stack<>();
        while(st.size()>2){
            hp.push(st.pop());
        }
        st.pop();
        System.out.println("After Removing Elment in the Stack ,the Stack Becomes :");
        while(hp.size()>0){
            st.push(hp.pop());
        }
        System.out.println(st);
    }

}
