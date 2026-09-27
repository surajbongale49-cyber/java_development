import java.util.Scanner;
public class Sum_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Enter the Array Element : ");
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("the sum of all element present in the array are : "+sum);

    }

}
