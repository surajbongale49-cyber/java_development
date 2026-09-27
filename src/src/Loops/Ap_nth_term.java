import java.util.Scanner;
public class Ap_nth_term{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of term of Ap :");
    int n=sc.nextInt();
    //2,5,8,11,14,_ _ _ _ _ _ _ _ _ _ _ _
    for(int i=2;i<=3*n-1;i=i+3){
        System.out.println(i);
    }

}
}
