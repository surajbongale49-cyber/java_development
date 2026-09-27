import java.util.Scanner;
public class Sum_of_digits_rev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int rem,t=n,sum=0;
        while(n!=0){
          rem=n%10;
          sum=sum*10+rem;
          n=n/10;
        }
       if(t==sum){
        System.out.println("the string is pallidrome");
       }else{
        System.out.println("the string is not pallidrome");
       }
    }
}
