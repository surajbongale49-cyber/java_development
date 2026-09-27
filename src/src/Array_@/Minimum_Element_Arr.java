import java.util.Scanner;
public class Minimum_Element_Arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Eneter the Array Element :");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum Element is :"+min);
    }

}
