import java.util.Scanner;
public class Avg_Number{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Marks of Physics :");
    int p=sc.nextInt();
    System.out.println("Enter the Marks of Chemistry :");
    int c=sc.nextInt();
    System.out.println("Enter the Marks of Mathematics :");
    int m=sc.nextInt();

    double Avg=(p+c+m)/3;
    System.out.println("the Avg marks of all the three Subjects are :");
    System.out.println(Avg);

   }

}