public class leetcodenextGreater {
  public static int[] call(int[] nums1,int[] nums2,int n,int m){
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=-1;
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(nums1[i]==nums2[j]){
                for(int k=j+1;k<m;k++){
                    if(nums2[k]>nums2[j]){
                        arr[i]=nums2[k];
                        break;
                    }
                }
                break;
            }
        }
    }
    return arr;
  }
 public static void main(String[] args){
    int[] nums1={4,1,2};
    int[] nums2={1,3,4,2};
    int n=nums1.length;
    int m=nums2.length;
    int[] arr=call(nums1,nums2,n,m);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

 }
}
