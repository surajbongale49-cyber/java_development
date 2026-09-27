import java.util.Scanner;
import java.util.Stack;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the Number of Element in the Stack :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            st.push(t); 
        }
        System.out.println(st);
        Stack<Integer> hp=new Stack<>();
        while(st.size()>0){
            hp.push(st.pop());
        }
        System.out.println(hp);
        Stack<Integer> rt=new Stack<>();
        while(hp.size()>0){
            rt.push(hp.pop());
        }
        System.out.println(rt);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }

}
