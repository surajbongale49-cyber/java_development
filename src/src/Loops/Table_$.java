import java.util.Scanner;
public class Table_${
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int res;
        for(int i=1;i<=10;i++){
            res=i*n;
            System.out.println(res);
        }
    }
}