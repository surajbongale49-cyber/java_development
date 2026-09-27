import java.util.Scanner;
public class array_ele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int max=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("the maximum number is :"+max);
        
    }

}
