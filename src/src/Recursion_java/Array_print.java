import java.util.Scanner;
class Array_print{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(arr,0);
    }
    public static void print(int[] arr,int idx){
        if(idx==arr.length)return;
        System.out.print(arr[idx]+" ");
        print(arr,idx+1);
    }
}
