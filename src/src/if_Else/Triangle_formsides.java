import java.util.Scanner;
public class Triangle_formsides {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st side of triangle:");
        int a =sc.nextInt();
        System.out.println("Enter the 2nd side of triangle:");
        int b =sc.nextInt();
        System.out.println("Enter the 3rd side of triangle:");
        int c =sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("the given sides form's the Triangle");
        }else{
            System.out.println("The given sides does not form's triangle");
        }
    }

}
