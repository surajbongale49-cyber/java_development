import java.util.Scanner;
public class print_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 numbers :");
        int n=sc.nextInt();
       
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
    }

}
