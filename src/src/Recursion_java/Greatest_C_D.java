import java.util.Scanner;
public class Greatest_C_D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st  Number :");
        int n=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int m=sc.nextInt();
        Gcd(n,m);
        System.out.println("The Gcd of this Number is : "+Gcd(n,m));
    }
    public static int Gcd(int n,int m){
        if(n==0){
            return m;
        }else{
           return Gcd(m%n,n);
        }
    }

}
