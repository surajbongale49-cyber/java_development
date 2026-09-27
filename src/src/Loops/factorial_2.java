import java.util.Scanner;
public class factorial_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
         System.out.println("the factorial of the number is :"+i);
         System.out.println(fact);
        }
    }

}
