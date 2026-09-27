import java.util.Scanner;
public class Alpha_Same_Triangle_4{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number :");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print((char)(i+64)+" ");
        }
        System.out.println();
    }

}
}