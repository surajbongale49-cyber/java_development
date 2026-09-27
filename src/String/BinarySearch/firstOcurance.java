public class firstOcurance {
    public static int Occurance(int[] arr,int target){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int idx=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<target){
                left=mid+1;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                idx=mid;
                right=mid-1;
            }
        }
        return idx;
    }
   public static void main(String[] args){
    int[] arr={1,1,2,2,2,3,4,5,5,5,6,7,8,11};
    int target=5;
    System.out.println(Occurance(arr,target));
   }
}
