import java.util.Scanner;
public class Nested_if_Else{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd Number:");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd Number:");
        int c=sc.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println("Here a is greater than b and c");
            }else{
                System.out.println("c is greater than b and a");
            }
        }else{
            if(b>c){
                System.out.println("b is greater than c and a");
            }else{
                System.out.println("c is greater then b and a");
            }
        }
        
    }
}