import java.util.Scanner;
public class Negative_Array {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Number :");
     int n=sc.nextInt();
     int[] arr=new int[n];
     System.out.println("Enter the Array Number :");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
        if(arr[i]<0){
        System.out.print(arr[i]+" ");
        }
     }
     


    }

}
