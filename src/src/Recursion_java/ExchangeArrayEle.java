import java.util.Scanner;
public class ExchangeArrayEle {
    public static void exchange(int[] arr,int[] brr,int idx){
        if(idx==arr.length){
           return ;
        }
         int temp=arr[idx];
            arr[idx]=brr[idx];
            brr[idx]=temp;

        exchange(arr,brr,idx+1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] brr=new int[n];
        System.out.println("Enter the 1st Array Element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the 2nd Array Element :");
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }

        System.out.println("original Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int j=0;j<n;j++){
            System.out.print(brr[j]+" ");
        }
        System.out.println();

        exchange(arr,brr,0);

        System.out.println("After Exchanging the new Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int j=0;j<n;j++){
            System.out.print(brr[j]+" ");
        }

    }

}
