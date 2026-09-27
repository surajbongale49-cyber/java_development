import java.util.Scanner;
public class Div_3_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        if(num%5==0 || num%3==0){
            System.out.println("the Number is Divisible by 5 or 3");
        }else{
            System.out.println("The Number is not divisible by 5 or 3");
        }
    }

}
