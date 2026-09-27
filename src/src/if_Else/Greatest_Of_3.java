import java.util.Scanner;
public class Greatest_Of_3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd Number :");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("The 1st number is Gereater than the other two:");
            System.out.println(a);
        }else if(b>a && b>c){
             System.out.println("The 2nd number is Gereater than the other two:");
             System.out.println(b);
        }else if(c>a && c>b){
             System.out.println("The 3rd number is Gereater than the other two:");
             System.out.println(c);
        }else{
            System.out.println("None of the number is greater");
        }

    }

}
