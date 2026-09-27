import java.util.Scanner;
class Rectangle{
    int len;
    int bre;

    void display(int l,int b){
        len=l;
        bre=b;
    }
    int Area(){
          return len*bre;
    }
}
public class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rectangle r1=new Rectangle();
        System.out.println("Enter the length of the rectangle :");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle :");
        int b=sc.nextInt();
        r1.display(l,b);
   
        System.out.println("The are of rectangle :");
        System.out.println(r1.Area());


    }
}