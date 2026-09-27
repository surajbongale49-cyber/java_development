public class maximumcount {
    public static int call(int[] arr){
        int n=arr.length;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                count1++;
            }else if(arr[i]<0){
                count2++;
            }
        }
       return Math.max(count1,count2);
    }
    public static void main(String[] args){
        int[] arr={-3,-2,-5,0,1,2,3};
        System.out.println("The maximum number of +ve or-ve element is :");
        System.out.println(call(arr));
    }
}
