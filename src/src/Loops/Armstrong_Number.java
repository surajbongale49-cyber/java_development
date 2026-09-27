import java.util.Scanner;
public class Armstrong_Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int org_num=sc.nextInt();
        int rem,sum=0,n;
        n=org_num;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum+=rem*rem*rem;
        }
        if(org_num==sum){
            System.out.println("Given number is Armstrong number ");
        }else{
            System.out.println("The number is not Armstrong number");
        }
    }
}
