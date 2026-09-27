
import java.util.Scanner;
import java.util.Stack;
public class Reverse_Stack_in_original_stack {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Stack<Integer> st=new Stack<>();
    System.out.println("Enter the Number of Element in the Stack :");
    int n=sc.nextInt();
    System.out.println("Enter the Elements :");
    for(int i=1;i<n;i++){
        int t=sc.nextInt();
        st.push(t);
    }
    Stack<Integer> hp=new Stack<>();
    while(st.size()>0){
        hp.push(st.pop());
    }
    System.out.println("the Reverse Stack is :");
    System.out.println(hp);
    Stack<Integer> st2=new Stack<>();
    while(hp.size()>0){
        st2.push(hp.pop());
    }
    System.out.println("The Original Content Copy in another Stack");
    System.out.println(st2);
    System.out.println("The reverse element in original stack");
    while(st2.size()>0){
        st.push(st2.pop());
    }
    System.out.println(st);
    
  }
}
