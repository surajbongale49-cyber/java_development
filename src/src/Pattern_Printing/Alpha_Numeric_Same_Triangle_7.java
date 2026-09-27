import java.util.Scanner;
public class Alpha_Numeric_Same_Triangle_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                System.out.print(i+" ");
                }else{
                    System.out.print((char)(i+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
