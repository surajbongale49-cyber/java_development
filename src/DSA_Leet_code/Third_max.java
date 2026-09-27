import java.util.Scanner;
public class Third_max {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of Array :");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the Array ELement :");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println("First Maxmimum element is :"+max);
    int max2=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max2<arr[i] && arr[i]!=max){
            max2=arr[i];
        }
    }
    System.out.println("Second maximum Element is :"+max2);
    int max3=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max3<arr[i] && arr[i]!=max2 && arr[i]!=max){
            max3=arr[i];
        }
    }
    System.out.println("Second maximum Element is :"+max3);
  }
}
