import java.util.Scanner;
public class Math_Minimum_3_Num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("The Manimum Number is :"+Math.min(Math.min(a,b),c));
    }

}
