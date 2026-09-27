import java.util.Scanner;
public class Odd_Number_divisible_by_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Printing the odd Number:");
        for(int i=1;i<=n;i=i+2){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }

}

