public class gfgTarget {
    public static boolean search(int[] arr,int target){
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
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={-400,-20,-5,0,3,42,63,89,99,101,150,175,200,250};
        int target=600;
        System.out.println(search(arr,target));
    }

}
