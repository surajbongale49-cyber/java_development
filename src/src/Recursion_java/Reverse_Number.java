import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("The Reverse Number is :");
        rev(n);
        
    }
    public static void rev(int x){
        if(x==0){
            return;
        }
        System.out.print(x%10);
        rev(x/10);
    }

}
