public class TargetElement {
    public static boolean search(int[] arr,int target,int idx){
        if(idx==arr.length-1){
            return false;
        }
        return arr[idx]==target || search(arr ,target,idx+1);
    }
    public static void main(String[] args){
         int[] arr={88,22,1,3,4,6,19,6};
         int target=18;
         search(arr,target,0);
         System.out.println( search(arr,target,0));
        
    }
   
}
