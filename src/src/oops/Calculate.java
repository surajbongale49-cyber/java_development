import java.util.Scanner;
class Addition{
    int a;
    int b;
 
    void display(int l,int m){
        a=l;
        b=m;
    }

    int add(){
        return a+b;
    }


}
public class Calculate {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Addition a=new Addition();
    System.out.println("Enter the 1st Number :");
    int l=sc.nextInt();
    System.out.println("Enter the 2nd Number :");
    int m=sc.nextInt();
    a.display(l,m);
    System.out.println("The Addition of this two number are :");
    System.out.println(a.add());

   }
 

}
