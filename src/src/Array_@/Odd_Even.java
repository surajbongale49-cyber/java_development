import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array Element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println("the "+i+" index Even Number :"+ arr[i]);
            }else{
                System.out.println("the "+i+" index Odd Number :"+ arr[i]);
            }
        }

    }

}
