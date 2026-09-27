import java.util.Scanner;
public class reverse_1 {
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Number :");
   int n=sc.nextInt();
   reverse(n,0);

 }public static void reverse(int n, int r){
    if(n==0){
        System.out.print(r);
        return ;
    }
    reverse(n/10,r*10+n%10);
 }

}
