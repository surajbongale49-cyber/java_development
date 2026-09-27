import java.util.Scanner;
public class Rectangle_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        System.out.println("Enter the Another Number:");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
