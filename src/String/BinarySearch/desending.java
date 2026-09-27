public class desending {
    public static int binary(int[] arr,int target){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<target){
                right=mid-1;
            }else if(arr[mid]>target){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={100,99,85,77,66,60,54,50,51,40,2,1};
        int target=66;
        int t=binary(arr,target);
        System.out.println(t);
    }

}
