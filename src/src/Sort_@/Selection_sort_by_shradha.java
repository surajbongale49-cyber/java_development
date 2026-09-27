import java.util.Scanner;
public class Selection_sort_by_shradha{
    public static void call(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Element :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            int Smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[Smallest]>arr[j]){
                    Smallest=j;
                }

            }
            int temp=arr[Smallest];
               arr[Smallest]=arr[i];
               arr[i]=temp;
        }
        System.out.println("The Sorting array is :");
        call(arr);
    }
}