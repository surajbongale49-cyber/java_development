import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        fact(n);
        System.out.println(fact(n));
    }
    public static int fact(int k){
        if(k==0 || k==1){ 
            return 1;
        }else{
          return k*fact(k-1);
        }
    }

}
