import java.util.*;
public class nextSmallest2 {
   public static int[] call(int[] arr,int n,Stack<Integer> st){
    int[] brr=new int[n];
     for(int i=0;i<n;i++){
        brr[i]=-1;
     }
     for(int i=0;i<n;i++){
        while(!st.empty() && arr[st.peek()]>arr[i]){
            brr[st.peek()]=arr[i];
            st.pop();
        }
        st.push(i);
     }
     return brr;
   } 
   public static void main(String[] args){
    int[] arr={7,9,12,10,14,8,3,6,9};
    Stack<Integer> st=new Stack<>();
    int n=arr.length;
    int[] brr=call(arr,n,st);
    for(int i=0;i<n;i++){
        System.out.print(brr[i]+" ");
    }
   }
}
