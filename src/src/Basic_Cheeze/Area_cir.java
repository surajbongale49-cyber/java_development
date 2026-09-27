import java.util.Scanner;
public class Area_cir{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius r :");
        double r=sc.nextDouble();
        double a=3.14*r*r;
        System.out.println("the area of circle is :"+a);

    }
}