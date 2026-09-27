import java.util.Scanner;
public class Decimal_or_not{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      double n=sc.nextDouble();
      int x=(int)n;
      if(n-x>0){
         System.out.println("the number is not an integer ");
      }else{
         System.out.println("the number is an integer ");
      }
   }
}
