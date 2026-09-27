import java.util.Scanner;
public class Mult_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int product=1;
        for(int i=0;i<arr.length;i++){
          product*=arr[i];
        }
        System.out.println("the product of all element present in this array :"+product);
    }
}
