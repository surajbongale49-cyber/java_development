//strictly increasing array
public class Strictly_increasing {
    public static boolean call(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return call(arr,idx+1);
        }else{
            return false;
        }

    }
    public static void main(String[] args){
        int[] arr={1,5,3};
        call(arr,0);
        System.out.println(call(arr,0));
    }

}
