import java.util.Scanner;
public class Math_Four_Num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("The Minimum Number is :"+Math.min(Math.min(Math.min(a,b),c),d));
    }

}
