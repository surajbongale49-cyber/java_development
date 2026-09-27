import java.util.Scanner;
public class Grater_Area {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of Rectangle :");
    int l=sc.nextInt();
    System.out.println("Enter the breadth of Rectangle :");
    int b=sc.nextInt();
    int A=l*b,P=l+b;
    if(A>P){
        System.out.println("Area of rectangle is greater than the perimeter");
    }else{
        System.out.println("perimeter is greater than the Area");
    }

 }
}
