import java.util.Scanner;
import java.util.Stack;
public class Copy_Stack{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the Number of Element in the Stack :");
        int n=sc.nextInt();
        System.out.println("Enter the Number in the Stack :");
        for(int i=1;i<=n;i++){
            int t=sc.nextInt();
            st.push(t);
        }
        System.out.println(st);
        Stack<Integer> hp=new Stack<>();
        System.out.println("Reverse Element in the Stack :");
        while(st.size()>0){
           hp.push(st.pop());
        }
        System.out.println(hp);


    }
}
