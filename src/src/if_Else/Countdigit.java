import java.util.Scanner;
public class Countdigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int rem,count=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            count++;
        }
        System.out.println("the no of digits present in the give number are : "+count);
        
    }




}
