import java.util.Scanner;
public class Reverse_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Element :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("The "+i+" index Element is "+arr[i]);

        }
    }

}
