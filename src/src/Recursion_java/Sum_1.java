import java.util.Scanner;
public class Sum_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        sum(n);
        System.out.println("The Sum of the Natural Number is :"+sum(n));
    }
    public static int sum(int r){
        if(r==0){
            return 0;
        }else{
            return r+sum(r-1);
        }

    }

}
