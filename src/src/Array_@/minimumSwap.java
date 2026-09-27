public class minimumSwap {
    public static int call(int[] arr,int count,int swaps,int n){
         for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=n-count;i<n;i++){
            if(arr[i]!=0) swaps++;
        }
        return swaps;
    }

    public static void main(String[] args){
        int[] arr={1,0,3,0,4,12};
        int n=arr.length;
        System.out.println("Minimum number of Swapping to move all zero element at the end :");
        System.out.println(call(arr,0,0,n));
    }
}
