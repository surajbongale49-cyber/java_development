import java.util.Scanner;
class Circle{
    int r;
}
class Area extends Circle{
    void display(){
    double A;
    A=3.14*(int)r*(int)r;
    System.out.println("the Area of the circle is :"+A);
    }
}
public class Single_Inheritance{
    public static void main(String[] args){
        Area c=new Area();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius :");
        c.r=sc.nextInt();
        c.display();
   

    }
}
