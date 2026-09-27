import java.util.Scanner;
public class Absolute{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a=sc.nextInt();
        if(a>0){
            System.out.print("The Original Number is : "+a);
        }else{
            System.out.println("The absolute Number is : "+(-a));
        }
    }
}