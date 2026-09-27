import java.util.*;
public class ArmstrongNo {
    public static boolean isvalid(int n){
        int rem,sum=0;
        int x=n;

        while(n!=0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==x){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("the given no is Armstrong no or not :");
        System.out.println(isvalid(n));
    
    }

}
