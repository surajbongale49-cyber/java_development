import java.util.Scanner;
public class Math_Max_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.print("The Maximum Number is :"+ Math.max(Math.max(Math.max(a,b),c),d));
    }

}
