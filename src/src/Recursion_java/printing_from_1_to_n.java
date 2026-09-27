import java.util.Scanner;
public class printing_from_1_to_n {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        num(n);

    }
    public static void num(int k){
        if(k==0)return;
        System.out.println(k);
        num(k-1);
    }

}
