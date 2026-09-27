import java.util.Scanner;
public class fibonacii_rec {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the nth number of fibonacii :");
        int n=sc.nextInt();
        // 1 1 2 3 5 8 13 21 34..................
        fib(n);
        System.out.println(fib(n));
    }
    public static int fib(int k){
        if(k==1 || k==2){
            return 1;
        }else{
            return fib(k-1)+fib(k-2);
        }
    }

}
