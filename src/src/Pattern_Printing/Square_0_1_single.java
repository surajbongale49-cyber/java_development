import java.util.Scanner;
public class Square_0_1_single {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        for(int i=0;i<n*n;i++){
            int r=i/n;
            int c=i%n;
            if(r==0 || r==n-1 || c==0 || c==n-1){
                System.out.print("1"+" ");
            }else{
                System.out.print("0"+" ");
            }
            if(c==n-1)
            System.out.println();
        }

    }

}
