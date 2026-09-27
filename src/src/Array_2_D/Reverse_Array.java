public class Reverse_Array {
    public static void main(String[] args){
        int[] arr={2,1,6,9,3,8,7};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
