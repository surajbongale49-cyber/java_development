import java.util.Scanner;
public class Revese_Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int original=sc.nextInt();
        int rem,sum=0;
        int n=original;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum=sum*10+rem;
        }
       System.out.println("The sum of this two numbers are :");
       System.out.println(original+sum);
    }

}
