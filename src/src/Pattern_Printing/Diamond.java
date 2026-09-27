import java.util.Scanner;
public class Diamond{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        // Upper half part of the diamond
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("  ");
            }for(int k=1;k<=((2*i)-1);k++){
                System.out.print("* ");
            }
             System.out.println();
        }
        // Lower half part of the diamond
        for(int i=1;i<=n-1;i++){
            for(int k=1;k<=i+1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
