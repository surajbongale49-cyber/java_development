import java.util.Scanner;
public class Factorial_${
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*i;
        }
        System.out.println("the Factorial of the given number is :");
        System.out.println(product);

    }
}
