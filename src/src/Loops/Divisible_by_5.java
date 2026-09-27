import java.util.Scanner;
public class Divisible_by_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Printing the multiple of five Number:");
        for(int i=0;i<=n;i++){
            if(i%5==0){
                System.out.print(i + " ");
            }
        }
    }

}
