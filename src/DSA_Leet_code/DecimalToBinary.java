import java.util.Scanner;
public class DecimalToBinary{
public static void call(int n){
    if(n==1 || n==0){
      System.out.print(n);
      return ;
    }
    call(n/2);
    System.out.print(n%2);
    
}
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Number :");
   int n=sc.nextInt();
    call(n);
 }
}
