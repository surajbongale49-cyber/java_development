import java.util.Scanner;
public class Ap_Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        for(int i=99;i>=103-4*n;i-=4){
            if(i>=0){
              System.out.println(i);
            }
        }
    }
}
