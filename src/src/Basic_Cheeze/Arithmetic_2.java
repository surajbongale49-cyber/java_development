import java.util.Scanner;
public class Arithmetic_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two Numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The Arithmetic Operation is :");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
