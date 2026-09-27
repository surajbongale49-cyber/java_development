public class mountleetcode{
    public static int peak(int[] arr){
        int n=arr.length;
        int left=1;
        int right=n-2;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={0,1,2,100,3,-1};
        System.out.println("The Peek Element is :");
        System.out.println(peak(arr));
    }

}
