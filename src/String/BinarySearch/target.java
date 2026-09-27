public class target {
    public static int search(int[] arr,int target){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<target){
                left=mid+1;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
   public static void main(String[] args){
    int[] arr={-400,-20,-5,0,3,42,63,89,99,101,150,175,200,250};
    int target=63;
    System.out.println(search(arr,target));
   }
}
