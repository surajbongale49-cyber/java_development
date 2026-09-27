
public class Reverse_Array_3 {
 public static void main(String[] args){
    int[] arr={2,5,89,125,789,365,214,235,684};
    int i=0,j=arr.length-1;
    while(j>i){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    System.out.println("The Reverse array are :");
    for(i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
 }
}
