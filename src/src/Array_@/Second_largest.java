import java.util.Scanner;
public class Second_largest {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number :");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    //1st largest;
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println("The  maxmum no is "+max);
    int max2=arr[0];
    for(int i=0;i<n;i++){
        if(max2<arr[i] && arr[i]!=max){
            max2=arr[i];
        }
    }
    System.out.println("The Second maximum "+max2);
  }
}
