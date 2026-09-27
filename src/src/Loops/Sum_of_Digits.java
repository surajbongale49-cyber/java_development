import java.util.Scanner;
public class Sum_of_Digits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber :");
        int n=sc.nextInt();
        int rem,sum=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum+=rem;

        }
        System.out.println("the sum of element present in the given Number is :"+sum);

    }
}
