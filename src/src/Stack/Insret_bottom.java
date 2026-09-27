import java.util.Scanner;
import java.util.Stack;
public class Insret_bottom {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the Number of Element in the Stack :");
        int n=sc.nextInt();
        System.out.println("Enter the Number :");
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            st.push(t);
        }
        Stack<Integer> hp=new Stack<>();
        while(st.size()>0){
            hp.push(st.pop());
        }
        st.push(800);
        while(hp.size()>0){
            st.push(hp.pop());
        }
        System.out.println(st);
    }

}
