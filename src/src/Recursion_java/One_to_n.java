import java.util.Scanner;
public class One_to_n {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number :");
       int n=sc.nextInt();
       print(1 ,n);

    }
    public static void print(int x,int y){
        if(x>y) return;
        System.out.println(x);
        print(x+1,y);

    }
}
