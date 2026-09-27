import java.util.Scanner;
public class Integer_or_not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        double a = sc.nextDouble();
        if(a==(int)a){
         System.out.println("The Number is integer number"); 
        }else{
            System.out.println("The Number is decimal Number");
        }
    }

}
