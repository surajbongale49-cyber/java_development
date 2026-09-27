import java.util.*;
public class NextGraterStack {
    public static int[] call(int[] arr,Stack<Integer> st,int n){
        int[] brr=new int[n];
        for(int i=0;i<n;i++){
            brr[i]=-1;
        }
        for(int i=0;i<n;i++){
        while(!st.empty() && arr[st.peek()]<arr[i]){
            brr[st.peek()]=arr[i];
            st.pop();
        }
        st.push(i);
        }
        return brr;
    }
    public static void main(String[] args){
       int[] arr={8,6,4,7,4,9,10,8,12};
       Stack<Integer> st=new Stack<>();
       int n=arr.length;
       int[] brr=call(arr,st,n);
       for(int i=0;i<n;i++){
        System.out.print(brr[i]+" ");
       }
    }
}
