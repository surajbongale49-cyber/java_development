import java.util.Scanner;
public class Sum_rec {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        sum(n);
        System.out.println("The sum of the element present in this Number is :"+sum(n));
    }
    public static int sum(int x){
        if(x==1){
            return 1;
        }
        else{
            return x+sum(x-1);
        }
    }

}
