import java.util.Scanner;
public class Mult_Add_Index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
               arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(2*arr[i]+" ");
            }else{
                System.out.print(10+arr[i]+" ");
            }
        }
    }
}