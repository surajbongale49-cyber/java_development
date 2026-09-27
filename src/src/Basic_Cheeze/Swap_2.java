import java.util.Scanner;
public class Swap_2{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number :");
    int a=sc.nextInt();
    System.out.println("Enter the Number :");
    int b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("the value of Number After the Swapping is :");
    System.out.println(a);
    System.out.println(b);

}



}