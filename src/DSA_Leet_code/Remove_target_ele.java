import java.util.Scanner;
public class Remove_target_ele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the target Element :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target Element :");
        int t=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            int j=0;
            if(arr[i]!=t){
               arr[j]=arr[i];
               System.out.print(arr[j]+" ");
               j++;
            }
        }
    }

}
