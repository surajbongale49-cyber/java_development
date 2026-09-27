import java.util.Scanner;
import java.util.Stack;
public class isValidparanthesis{
    public static boolean isValid(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='('){
                st.push(str.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }else if(str.charAt(i)==')' && st.peek()=='('){
                    st.pop();
                }else if(str.charAt(i)==']' && st.peek()=='['){
                    st.pop();
                }else if(str.charAt(i)=='}' && st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        System.out.println(isValid(str));
    }
}