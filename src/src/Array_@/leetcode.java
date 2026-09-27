import java.util.Scanner;
public class leetcode {
    public static int[] call(int arr[],int n){
            int l=n;
            for(int i=0;i<l;i++){
            for(int j=i+2;j<l;j++){
                if(i%2==0){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }else{
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n=sc.nextInt();
        System.out.println("Enter array Element :");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] nums=call(arr,n);
        System.out.println("After Enter changing the position :");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
       
    }
}
