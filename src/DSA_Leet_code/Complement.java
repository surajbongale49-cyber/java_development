import java.util.Scanner;
public class Complement {
    public static int call(int n){
        int mult=1;
        int rem;
        int ans=0;
        while(n!=0){
            rem=n%2;
            rem=rem^1;
            ans=ans+rem*mult;
            mult=mult*2;
            n=n/2;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("The complement of the "+n+" is :");
        System.out.println(call(n));

    }
}
