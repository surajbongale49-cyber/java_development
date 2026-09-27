import java.util.Scanner;
class Shape{
    void dimension(){
        System.out.println("The Circle has Zero Dimension :");
    }
  
}
class Circle extends Shape{
    int r;
    void get(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Radius :");
    r=sc.nextInt();
}
}
class Area extends Circle{
    double A;
    void display(){
        A=3.14*(int)r*(int)r;
        print();
        
    }
    void print(){
        System.out.println("The Area of circle is :"+A);
    }

}
public class Multilevel_Inheritance {
    public static void main(String[] args){
        Area a=new Area();
        a.dimension();
        a.get();
        a.display();
        

    }

}
