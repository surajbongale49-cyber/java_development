import java.util.Scanner;
public class Second_Largest_Num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Largest Number is :"+max);
        System.out.println("The Second largest Number is:");
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.print(smax);
    }


}
