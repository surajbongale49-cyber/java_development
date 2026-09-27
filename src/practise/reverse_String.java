import java.util.Scanner;
public class reverse_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0,j=n-1;i<j;i++,j--){
        //     int temp=arr[j];
        //     arr[j]=arr[i];
        //     arr[i]=temp;
        // }
        // for(int i=0;i<=n/2;i++){
        //     int temp=arr[n-i-1];
        //     arr[n-i-1]=arr[i];
        //     arr[i]=temp;
        // }
        for(int i=n-1;i>=0;i--){
         System.out.print(arr[i]+" ");
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
    }

}
