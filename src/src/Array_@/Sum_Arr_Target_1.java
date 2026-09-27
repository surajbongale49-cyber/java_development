public class Sum_Arr_Target_1 {
    public static void main(String[] args){
        int[] arr={2,-3,4,6,9,8,7,1};
        int target=8;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    System.out.println((arr[i]+" "+arr[j]));
                }
            }
        }
    }

}

