import java.util.Scanner;
public class power_java {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Enter the Another number :");
        int m=sc.nextInt();
        pow(n,m);
        System.out.println("the power of "+n+"raise to the "+m+" is" +pow(n,m));
    }
    public static int pow(int n,int m){
        if(m==0){
            return 1;
        }else{
            return n*pow(n,m-1);
        }
    }

}
