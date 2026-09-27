import java.util.Scanner;
public class Sum_fun {
    public static void Sum(int x,int y,int z){
        System.out.println("The Sum of this three Number are :");
        System.out.println(x+y+z);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd Number :");
        int c=sc.nextInt();
        Sum(a,b,c);
    }

}
