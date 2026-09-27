import java.util.*;
public class reverse_array {
    public static void main(String[] args){
        int[] arr={1,3,4,5,6,2,7,8};
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
        int j=0;
        while(!st.empty()){
            arr[j]=st.pop();
            j++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
