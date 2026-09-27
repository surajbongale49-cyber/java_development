import java.util.Scanner;
class Shape{
    void dimension(){
        System.out.println("This is Shape");
    }
}
class Circle extends Shape{
    int r;
   
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius :");
        r=sc.nextInt();
    }
    void display(){
        System.out.println("The Area of circle is :"+(double)(3.14*r*r));

    }
}
class Rectangle extends Shape{
    int l;
    int b;
    void getRectangle(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle :");
        l=sc.nextInt();
        System.out.println("Enter the Breadth of the Rectangle :");
        b=sc.nextInt();
    }
    void displayRec(){
        System.out.println("The Area of Rectangle is :"+(l*b));

    }
}
public class Hirechical_Inhertiance{
public static void main(String[] args){
    Circle c=new Circle();
    c.dimension();
    c.get();
    c.display();

    Rectangle r=new Rectangle();
    r.dimension();
    r.getRectangle();
    r.displayRec();

}
}