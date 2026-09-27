import java.util.Scanner;
class Circle{
    double r;

    void display(int r1){
        r=(double)r1;
        System.out.println(r);
    }
     
    double Area(){
        return 3.14*r*r;
    }

}
public class Area2 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Circle c=new Circle();
    System.out.println("Enter the Radius of Circle :");
    int r1=sc.nextInt();
    c.display(r1);
    System.out.println(c.Area());


  }
}
