public class floor {
    public static int git(int[] arr,int target){
       int n=arr.length;
       int left=0;
       int right=n-1;
       int idx=-1;
       while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]>target){
            right=mid-1;
        }else{
           idx=mid;
           left=mid+1;
        }
      
       }
       return idx;
    }
   public static void main(String[] args){
    int[] arr={-1,0,3,6,11,18,99,100,109};
    int target=5;
    int t=git(arr,target);
    System.out.println(t);
   }
}
