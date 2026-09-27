import java.util.Scanner;
public class Sum_of_Digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int rem,t=n,sum=0;
        while(n!=0){
          rem=n%10;
          sum+=rem;
          n=n/10;
        }
        System.out.println("The sum of digits present in number :"+sum);
    }
}
