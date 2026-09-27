import java.util.Scanner;
public class leap_year {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year :");
        int n=sc.nextInt();
        if(n%400==0 || (n%4==0 && n%100!=0)){
            System.out.println("the given year is leap year");
        }else{
            System.out.println("The given year is not leap year");
        }

    }
}
