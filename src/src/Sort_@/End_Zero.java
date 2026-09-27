import java.util.Scanner;
//This is good method
public class End_Zero{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size :");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the array Element :");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int j=0;
    for(int i=0;i<n;i++){
        if(arr[i]!=0){
            if(i!=j){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
    }
    System.out.println("the output is :");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

}
}