import java.util.*;
public class addParanthesis {
      public static int call(String str){
        int n=str.length();
        int count=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.empty()){
                    count++;
                }else{
                    st.pop();
                }
            }
        }
        return count+st.size();
      }
      public static void main(String[] args){
        String str="(((";
        System.out.println("The  total Minimum Number of paranthesis is required :");
        System.out.println(call(str));
      }
}
