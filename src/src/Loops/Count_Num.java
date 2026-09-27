import java.util.Scanner;
public class Count_Num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int rem,count=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            count++;
        }
        System.out.println("The total number of digit present in the number is:");
        System.out.println(count);
    }

}
