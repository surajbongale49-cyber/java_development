import java.util.Stack;
public class DesignArray {
    public static void main(String[] args){
        int[] arr={2,3,5,-4,6,-2,-8,9};
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.empty()){
               st.push(arr[i]);
            }else if(arr[i]>=0){
                if(st.peek()>=0){
                    st.push(arr[i]);
                }else{
                    st.pop();
                }
            }else{
                if(st.peek()<0){
                    st.push(arr[i]);
                }else{
                    st.pop();
                }
            }
        }
        int[] brr=new int[st.size()];
        int k=(st.size()-1);
        while(!st.empty()){
            brr[k]=st.pop();
            k--;
        }
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }

}
