import java.util.Scanner;
public class ternery_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();

        int pranav=(n>=0) ? 100 : 0;

        System.out.println(pranav);

    }

}
