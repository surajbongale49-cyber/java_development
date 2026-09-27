import java.util.Scanner;
public class sortedArray {
    public static boolean sorted(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        return arr[idx]<arr[idx+1] && sorted(arr,idx+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Element is :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sorted(arr,0));

    }
}
