import java.util.*;
public class NextSmallest {
    public static int[] call(int[] arr,int n,Stack<Integer> st){
    int[] res=new int[n];
    res[n-1]=-1;
    st.push(arr[n-1]);
    for(int i=n-2;i>=0;i--){
        while(!st.empty() && st.peek()>arr[i]){
            st.pop();
        }
        if(st.size()==0){
            res[i]=-1;
        }else{
            res[i]=st.peek();
        }
        st.push(arr[i]);
      }
       return res;
    }
 public static void main(String[] args){
    int[] arr={7,9,12,10,14,8,3,6,9};
    Stack<Integer> st=new Stack<>();
    int n=arr.length;
    System.out.println("Original Array is :");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    int[] res=call(arr,n,st);
    System.out.println("After rearranging the array is :");
    for(int i=0;i<n;i++){
        System.out.print(res[i]+" ");
    }
 }
}
