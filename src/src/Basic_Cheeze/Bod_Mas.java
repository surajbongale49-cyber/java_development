import java.util.Scanner;
public class Bod_Mas{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd Number :");
        int c=sc.nextInt();
        double res=a+b*c;
        System.out.println("the result of this above operation is : "+res);


    }
}
