import java.util.Scanner;
public class Increment_Decrement{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the 1st Number :");
   int x=sc.nextInt();
   System.out.println("Enter the 2nd Number :");
   int y=sc.nextInt();
   System.out.println("Enter the 3rd Number :");
   int z=sc.nextInt();
   int t=(++x)+(y++)+(++z);
   System.out.println(t);



   }
}


