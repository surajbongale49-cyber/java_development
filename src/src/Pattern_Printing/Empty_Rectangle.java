
    // * * * * * * *
    // *           *
    // *           *
    // *           *
    // * * * * * * *
   import java.util.Scanner;
   public class Empty_Rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+2;j++){
             if(i==1 || i==n){
                System.out.print("* ");
             }else if(j==1 || j==n+2){
                System.out.print("* ");
             }else{
                System.out.print("  ");
             }
             
            }
            System.out.println();

        }
    }
   }