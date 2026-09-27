import java.util.Scanner;
public class Nested_if_Else_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd Number :");
        int c=sc.nextInt();
        if(a<b){
            if(a<c){
            System.out.println("a is smaller than the b and c");
            }else{
            System.out.println("c is smaller than the a and b");
            }
        }else{
            if(b<c){
                System.out.println("b is smaller than the a and c");
            }else{
                System.out.println("c is smaller than the b and a");
            }
        }

    }
}