import java.util.Scanner;
public class Bridge_$ {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            for(int k=1;k<i;k++){
                System.out.print("  ");
            }
            for(int l=1;l<i;l++){
                System.out.print("  ");
            }
            for(int t=1;t<=n-i+1;t++){
                
                System.out.print("* ");

            }
             System.out.println();
        }
       

    }

}
